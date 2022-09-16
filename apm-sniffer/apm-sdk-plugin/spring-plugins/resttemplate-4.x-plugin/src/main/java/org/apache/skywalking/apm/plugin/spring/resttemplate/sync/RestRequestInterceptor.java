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

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.skywalking.apm.agent.core.conf.Config;
import org.apache.skywalking.apm.agent.core.context.CarrierItem;
import org.apache.skywalking.apm.agent.core.context.ContextCarrier;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.EnhancedInstance;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstanceMethodsAroundInterceptor;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.MethodInterceptResult;
import org.apache.skywalking.apm.agent.core.util.ReflectionUtil;
import org.apache.skywalking.apm.plugin.spring.resttemplate.helper.RestTemplateRuntimeContextHelper;
import org.springframework.http.client.AbstractClientHttpRequest;
import org.springframework.http.client.ClientHttpRequest;

public class RestRequestInterceptor implements InstanceMethodsAroundInterceptor {

    @Override
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        MethodInterceptResult result) throws Throwable {

    }

    @Override
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        Object ret) throws Throwable {
        ClientHttpRequest clientHttpRequest = (ClientHttpRequest) ret;
        if (clientHttpRequest instanceof AbstractClientHttpRequest) {
            AbstractClientHttpRequest httpRequest = (AbstractClientHttpRequest) clientHttpRequest;
            ContextCarrier contextCarrier = RestTemplateRuntimeContextHelper.getContextCarrier();
            CarrierItem next = contextCarrier.items();
            Map<String, String> agentHeaderMap = new HashMap<>();
            while (next.hasNext()) {
                next = next.next();
                agentHeaderMap.put(next.getHeadKey(), next.getHeadValue());
            }
            ReflectionUtil.invokeMethod(
                    Config.Agent.ESB_TRACE_CLASS_SEND_HEADER_TO_REST_TEMPLATE_METHOD, 2, httpRequest, agentHeaderMap);
        }
        return ret;
    }

    @Override
    public void handleMethodException(EnhancedInstance objInst, Method method, Object[] allArguments,
        Class<?>[] argumentsTypes, Throwable t) {

    }
}
