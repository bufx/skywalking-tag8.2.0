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

import org.apache.skywalking.apm.util.StringUtil;

public class EsbBody {

    private Transaction transaction;

    public boolean hasAgentHeader() {
        return hasTransaction()
            && this.transaction.hasHeader()
            && this.transaction.header.hasSysHeader()
            && this.transaction.header.sysHeader.hasMsgId();
    }

    public void updateMsgId(String msgId) {
        String currentMsgId = this.transaction.header.sysHeader.getMsgId().split("-")[0];
        this.transaction.header.sysHeader.setMsgId(StringUtil.join('-', currentMsgId, msgId));
    }

    public String getAgentHeader() {
        return this.transaction.header.sysHeader.getMsgId().split("-")[1];
    }

    public boolean hasTransaction() {
        return this.transaction != null;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public static class Transaction {

        private Header header;

        private Object body;

        public boolean hasHeader() {
            return this.header != null;
        }

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }

        public Object getBody() {
            return body;
        }

        public void setBody(Object body) {
            this.body = body;
        }

        public static class Header {

            private SysHeader sysHeader;

            public boolean hasSysHeader() {
                return this.sysHeader != null;
            }

            public SysHeader getSysHeader() {
                return sysHeader;
            }

            public void setSysHeader(SysHeader sysHeader) {
                this.sysHeader = sysHeader;
            }

            public static class SysHeader {
                private String ver;
                private String pinIndex;
                private String bizType;
                private String authContext;
                private String msgId;
                private String clientCd;

                public boolean hasMsgId() {
                    return this.msgId != null;
                }

                public String getVer() {
                    return ver;
                }

                public void setVer(String ver) {
                    this.ver = ver;
                }

                public String getPinIndex() {
                    return pinIndex;
                }

                public void setPinIndex(String pinIndex) {
                    this.pinIndex = pinIndex;
                }

                public String getBizType() {
                    return bizType;
                }

                public void setBizType(String bizType) {
                    this.bizType = bizType;
                }

                public String getAuthContext() {
                    return authContext;
                }

                public void setAuthContext(String authContext) {
                    this.authContext = authContext;
                }

                public String getMsgId() {
                    return msgId;
                }

                public void setMsgId(String msgId) {
                    this.msgId = msgId;
                }

                public String getClientCd() {
                    return clientCd;
                }

                public void setClientCd(String clientCd) {
                    this.clientCd = clientCd;
                }
            }

        }
    }
}
