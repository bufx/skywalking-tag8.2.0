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

package org.apache.skywalking.apm.agent.core.context.esb;

public class EsbCentersReqDTO {

    private EsbTransactionReqDto transactionReqDto;

    public String getTraceContext() {
        return this.transactionReqDto.esbHeaderReqDto.esbSysHeaderReqDto.traceContext;
    }

    public EsbTransactionReqDto getTransactionReqDto() {
        return transactionReqDto;
    }

    public void setTransactionReqDto(EsbTransactionReqDto transactionReqDto) {
        this.transactionReqDto = transactionReqDto;
    }

    public static class EsbTransactionReqDto {

        private EsbHeaderReqDto esbHeaderReqDto;

        public EsbHeaderReqDto getEsbHeaderReqDto() {
            return esbHeaderReqDto;
        }

        public void setEsbHeaderReqDto(EsbHeaderReqDto esbHeaderReqDto) {
            this.esbHeaderReqDto = esbHeaderReqDto;
        }

        public static class EsbHeaderReqDto {
            private EsbSysHeaderReqDto esbSysHeaderReqDto;

            public EsbSysHeaderReqDto getEsbSysHeaderReqDto() {
                return esbSysHeaderReqDto;
            }

            public void setEsbSysHeaderReqDto(EsbSysHeaderReqDto esbSysHeaderReqDto) {
                this.esbSysHeaderReqDto = esbSysHeaderReqDto;
            }

            public static class EsbSysHeaderReqDto {
                private String traceContext;

                public String getTraceContext() {
                    return traceContext;
                }

                public void setTraceContext(String traceContext) {
                    this.traceContext = traceContext;
                }
            }

        }

    }

}
