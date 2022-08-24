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

package org.apache.skywalking.apm.toolkit.activation.esb.trace;

import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIUtils;
import org.apache.skywalking.apm.agent.core.base64.Base64;
import org.apache.skywalking.apm.agent.core.context.CarrierItem;
import org.apache.skywalking.apm.agent.core.context.ContextCarrier;
import org.apache.skywalking.apm.agent.core.context.ContextManager;
import org.apache.skywalking.apm.agent.core.context.tag.Tags;
import org.apache.skywalking.apm.agent.core.context.trace.AbstractSpan;
import org.apache.skywalking.apm.agent.core.context.trace.SpanLayer;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.MethodInterceptResult;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.StaticMethodsAroundInterceptor;
import org.apache.skywalking.apm.network.trace.component.ComponentsDefine;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TraceContextCarrierInterceptor implements StaticMethodsAroundInterceptor {

    @Override
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInterceptResult result) {
        if (allArguments[0] == null) {
            // illegal args, can't trace. ignore.
            return;
        }
        Object obj = allArguments[0];
        if (obj instanceof HttpPost) {
            final HttpPost httpPost = (HttpPost) obj;
            final ContextCarrier contextCarrier = new ContextCarrier();
            HttpHost httpHost = URIUtils.extractHost(httpPost.getURI());
            String remotePeer = httpHost.getHostName() + ":" + port(httpHost);
            String operationName = httpPost.getURI().getPath();
            AbstractSpan span = ContextManager.createExitSpan(operationName, contextCarrier, remotePeer);

            span.setComponent(ComponentsDefine.HTTPCLIENT);
            Tags.URL.set(span, httpPost.getRequestLine().getUri());
            Tags.HTTP.METHOD.set(span, httpPost.getMethod());
            SpanLayer.asHttp(span);

            CarrierItem next = contextCarrier.items();
            Map<String, String> traceContextCarrierMap = new HashMap<>();
            while (next.hasNext()) {
                next = next.next();
                traceContextCarrierMap.put(next.getHeadKey(), next.getHeadValue());
            }
            result.defineReturnValue(Base64.encode(traceContextCarrierMap.toString()));
        }
    }

    @Override
    public Object afterMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        Object ret) {
        ContextManager.stopSpan();
        return ret;
    }

    @Override
    public void handleMethodException(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        Throwable t) {
        ContextManager.activeSpan().log(t);
    }

    private int port(HttpHost httpHost) {
        int port = httpHost.getPort();
        return port > 0 ? port : "https".equalsIgnoreCase(httpHost.getSchemeName()) ? 443 : 80;
    }
}
