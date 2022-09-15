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

package org.apache.skywalking.apm.agent.core.util;

import org.apache.skywalking.apm.agent.core.conf.Config;
import org.apache.skywalking.apm.agent.core.logging.api.ILog;
import org.apache.skywalking.apm.agent.core.logging.api.LogManager;
import org.apache.skywalking.apm.util.StringUtil;

import java.lang.reflect.Method;

/**
 * ESB custom class, in order to call a method written by the business system to cancel the value by reflection
 */
public class ReflectionUtil {

    private static final ILog LOGGER = LogManager.getLogger(ReflectionUtil.class);

    public static Object invokeMethod(String methodName, int argumentLength, Object... args) {
        try {
            if (StringUtil.isNotEmpty(Config.Agent.ESB_TRACE_CLASS_PATH)) {
                Method invokeMethod = null;
                Class aClass = Class.forName(Config.Agent.ESB_TRACE_CLASS_PATH);
                Object aObject = aClass.newInstance();
                Method[] methods = aObject.getClass().getDeclaredMethods();
                if (methods != null && methods.length > 0) {
                    for (Method m : methods) {
                        Class<?>[] clazzs = m.getParameterTypes();
                        if (m.getName().equals(methodName) && clazzs.length == argumentLength) {
                            invokeMethod = m;
                            break;
                        }
                    }
                }
                return invokeMethod.invoke(aObject, args);
            }
        } catch (Exception e) {
            LOGGER.info("reflection method error: {}", e);
        }
        return null;
    }
}
