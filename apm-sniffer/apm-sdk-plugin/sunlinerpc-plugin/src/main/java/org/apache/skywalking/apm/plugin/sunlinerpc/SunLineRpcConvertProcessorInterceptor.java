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

package org.apache.skywalking.apm.plugin.sunlinerpc;

import org.apache.skywalking.apm.agent.core.context.ContextCarrier;
import org.apache.skywalking.apm.agent.core.context.ContextManager;
import org.apache.skywalking.apm.agent.core.context.tag.Tags;
import org.apache.skywalking.apm.agent.core.context.trace.AbstractSpan;
import org.apache.skywalking.apm.agent.core.context.trace.SpanLayer;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.EnhancedInstance;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstanceMethodsAroundInterceptor;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.MethodInterceptResult;
import org.apache.skywalking.apm.network.trace.component.ComponentsDefine;

import java.lang.reflect.Method;
import java.util.Map;

public class SunLineRpcConvertProcessorInterceptor implements InstanceMethodsAroundInterceptor {

    @Override
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, MethodInterceptResult result) throws Throwable {
        Object allArgument = allArguments[2];
        if (Constants.BEAD.equals(allArgument.getClass().getName())) {
            Bead bead = (Bead) allArgument;
            Map<String, String> parameters = bead.getParameters();
            String operationName = parameters.get("remote_server");
            String serviceId = parameters.get("serviceId");
            ContextCarrier contextCarrier = new ContextCarrier();

            AbstractSpan span = ContextManager.createEntrySpan(generateRequestURL(operationName, serviceId), contextCarrier);

            Tags.URL.set(span, generateRequestURL(operationName, serviceId));
            span.setComponent(ComponentsDefine.SUNLINERPC);
            SpanLayer.asRPCFramework(span);
        }
    }

    @Override
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Object ret) throws Throwable {
        ContextManager.stopSpan();
        return ret;
    }

    @Override
    public void handleMethodException(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Throwable t) {
        dealException(t);
    }

    /**
     * Log the throwable, which occurs in SunLine RPC service.
     */
    private void dealException(Throwable throwable) {
        AbstractSpan span = ContextManager.activeSpan();
        span.log(throwable);
    }

    /**
     * Format request url. e.g. /32.114.112.192:29009/OPBK0516.
     *
     * @return request url.
     */
    private String generateRequestURL(String operationName, String serviceId) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(operationName);
        requestURL.append("/");
        requestURL.append(serviceId);
        return requestURL.toString();
    }
}
