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

package org.apache.skywalking.apm.plugin.spring.resttemplate.sync;

import org.apache.skywalking.apm.agent.core.base64.Base64;
import org.apache.skywalking.apm.agent.core.conf.Config;
import org.apache.skywalking.apm.agent.core.context.CarrierItem;
import org.apache.skywalking.apm.agent.core.context.ContextCarrier;
import org.apache.skywalking.apm.agent.core.logging.api.ILog;
import org.apache.skywalking.apm.agent.core.logging.api.LogManager;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.EnhancedInstance;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstanceMethodsAroundInterceptor;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.MethodInterceptResult;
import org.apache.skywalking.apm.plugin.spring.resttemplate.helper.RestTemplateRuntimeContextHelper;
import org.apache.skywalking.apm.util.StringUtil;
import org.springframework.http.client.AbstractClientHttpRequest;
import org.springframework.http.client.ClientHttpRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link HttpEntityRequestCallbackInterceptor} intercept the TestTemplate$HttpEntityRequestCallback args resolve ;
 */
public class HttpEntityRequestCallbackInterceptor implements InstanceMethodsAroundInterceptor {

    private static final ILog LOGGER = LogManager.getLogger(HttpEntityRequestCallbackInterceptor.class);

    @Override
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, MethodInterceptResult result) throws Throwable {

    }

    @Override
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Object ret) throws Throwable {
        ClientHttpRequest httpRequest = (ClientHttpRequest) allArguments[0];
        AbstractClientHttpRequest clientHttpRequest = (AbstractClientHttpRequest) httpRequest;
        try {
            if (StringUtil.isNotEmpty(Config.Agent.ESB_TRACE_CLASS_PATH)) {
                Map<String, String> agentHeaderMap = new HashMap<>();
                ContextCarrier contextCarrier = RestTemplateRuntimeContextHelper.getContextCarrier();
                CarrierItem next = contextCarrier.items();
                while (next.hasNext()) {
                    next = next.next();
                    agentHeaderMap.put(next.getHeadKey(), next.getHeadValue());
                }
                Class aClass = Class.forName(Config.Agent.ESB_TRACE_CLASS_PATH);
                Object aObject = aClass.newInstance();
                Method invokeMethod = findInvokeMethod(aObject);
                invokeMethod.invoke(aObject, clientHttpRequest, Base64.encode(agentHeaderMap.toString()));
            }
        } catch (Exception e) {
            LOGGER.info("RestTemplate processing reflection method error:. Exception:{}", e);
            return ret;
        }
        return ret;
    }

    @Override
    public void handleMethodException(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Throwable t) {

    }

    public Method findInvokeMethod(Object object) {
        Method invokeMethod = null;
        Method[] methods = object.getClass().getDeclaredMethods();
        if (methods != null && methods.length > 0) {
            for (Method m : methods) {
                Class<?>[] clazzs = m.getParameterTypes();
                if (m.getName().equals(Config.Agent.ESB_TRACE_CLASS_SEND_METHOD) && clazzs.length == 2) {
                    invokeMethod = m;
                    break;
                }
            }
        }
        return invokeMethod;
    }
}
