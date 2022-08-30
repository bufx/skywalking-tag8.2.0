/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.plugin.unionpaygate;

import org.apache.skywalking.apm.agent.core.base64.Base64;
import org.apache.skywalking.apm.agent.core.conf.Config;
import org.apache.skywalking.apm.agent.core.context.CarrierItem;
import org.apache.skywalking.apm.agent.core.context.ContextCarrier;
import org.apache.skywalking.apm.agent.core.context.ContextManager;
import org.apache.skywalking.apm.agent.core.context.SW8CarrierItem;
import org.apache.skywalking.apm.agent.core.context.tag.Tags;
import org.apache.skywalking.apm.agent.core.context.tag.Tags.HTTP;
import org.apache.skywalking.apm.agent.core.context.trace.AbstractSpan;
import org.apache.skywalking.apm.agent.core.context.trace.SpanLayer;
import org.apache.skywalking.apm.agent.core.logging.api.ILog;
import org.apache.skywalking.apm.agent.core.logging.api.LogManager;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.EnhancedInstance;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstanceMethodsAroundInterceptor;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.MethodInterceptResult;
import org.apache.skywalking.apm.network.trace.component.ComponentsDefine;
import org.apache.skywalking.apm.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CoreControllerInterceptor implements InstanceMethodsAroundInterceptor {

    private static final ILog LOGGER = LogManager.getLogger(CoreControllerInterceptor.class);

    @Override
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
                             MethodInterceptResult result) throws Throwable {
        Object object = allArguments[0];

        Field requestFiled = object.getClass().getDeclaredField("request");
        requestFiled.setAccessible(true);
        HttpServletRequest request = (HttpServletRequest) requestFiled.get(object);

        boolean hasAgentHeader = false;
        Map<String, String> agentHeaderMap = new HashMap<>();

        if (StringUtil.isEmpty(request.getHeader(SW8CarrierItem.HEADER_NAME))) {
            try {
                if (StringUtil.isNotEmpty(Config.Agent.ESB_TRACE_CLASS_PATH)) {
                    Class aClass = Class.forName(Config.Agent.ESB_TRACE_CLASS_PATH);
                    Object aObject = aClass.newInstance();
                    Method invokeMethod = findInvokeMethod(aObject);
                    Object response = invokeMethod.invoke(aObject, object);
                    String agentHeader = Base64.decode2UTFString(response.toString());
                    if (StringUtil.isNotEmpty(agentHeader)) {
                        String[] traceContextArray = agentHeader.substring(1, agentHeader.length() - 1).split(",");
                        for (String traceContext : traceContextArray) {
                            String[] entry = traceContext.split("=", 2);
                            agentHeaderMap.put(entry[0].trim(), entry[1].trim());
                        }
                        hasAgentHeader = true;
                    }
                }
            } catch (Exception e) {
                LOGGER.info("union-paygate processing reflection method error:. Exception:{}", e);
            }
        }

        ContextCarrier contextCarrier = new ContextCarrier();
        CarrierItem next = contextCarrier.items();
        while (next.hasNext()) {
            next = next.next();
            if (hasAgentHeader) {
                next.setHeadValue(agentHeaderMap.get(next.getHeadKey()));
            } else {
                next.setHeadValue(request.getHeader(next.getHeadKey()));
            }
        }
        AbstractSpan span = ContextManager.createEntrySpan(request.getRequestURI(), contextCarrier);
        Tags.URL.set(span, request.getRequestURL().toString());
        HTTP.METHOD.set(span, request.getMethod());
        span.setComponent(ComponentsDefine.UNION_PAYGATE);
        SpanLayer.asHttp(span);
    }

    @Override
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
                              Object ret) throws Throwable {
        ContextManager.stopSpan();
        return ret;
    }

    @Override
    public void handleMethodException(EnhancedInstance objInst, Method method, Object[] allArguments,
                                      Class<?>[] argumentsTypes, Throwable t) {
        ContextManager.activeSpan().log(t);
    }

    public Method findInvokeMethod(Object object) {
        Method invokeMethod = null;
        Method[] methods = object.getClass().getDeclaredMethods();
        if (methods != null && methods.length > 0) {
            for (Method m : methods) {
                Class<?>[] clazzs = m.getParameterTypes();
                if (m.getName().equals(Config.Agent.ESB_TRACE_CLASS_READ_METHOD) && clazzs.length == 1) {
                    invokeMethod = m;
                    break;
                }
            }
        }
        return invokeMethod;
    }
}
