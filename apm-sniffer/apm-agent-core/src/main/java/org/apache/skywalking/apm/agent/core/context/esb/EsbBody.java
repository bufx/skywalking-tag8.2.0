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

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.skywalking.apm.agent.core.base64.Base64;
import org.apache.skywalking.apm.util.StringUtil;

public class EsbBody {

    private Transaction Transaction;

    public boolean hasAgentHeader() {
        return hasTransaction()
            && this.Transaction.hasHeader()
            && this.Transaction.Header.hasSysHeader()
            && this.Transaction.Header.sysHeader.hasMsgId();
    }

    public String updateMsgId(String body, String newMsgId) {
        JsonObject bodyJsonObject = JsonParser.parseString(body).getAsJsonObject();
        JsonObject sysHeaderJsonObject = bodyJsonObject.getAsJsonObject("Transaction").getAsJsonObject("Header").getAsJsonObject("sysHeader");
        sysHeaderJsonObject.remove("msgId");

        String oldMsgId = this.Transaction.Header.sysHeader.getMsgId().split("-")[0];
        sysHeaderJsonObject.addProperty("msgId", StringUtil.join('-', oldMsgId, Base64.encode(newMsgId)));
        return new Gson().toJson(bodyJsonObject);
    }

    public String getAgentHeader() {
        return this.Transaction.Header.sysHeader.getMsgId().split("-")[1];
    }

    public boolean hasTransaction() {
        return this.Transaction != null;
    }

    public Transaction getTransaction() {
        return Transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.Transaction = transaction;
    }

    public static class Transaction {

        private Header Header;

        public boolean hasHeader() {
            return this.Header != null;
        }

        public Header getHeader() {
            return Header;
        }

        public void setHeader(Header header) {
            this.Header = header;
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
                private String msgId;

                public boolean hasMsgId() {
                    return this.msgId != null;
                }

                public String getMsgId() {
                    return msgId;
                }

                public void setMsgId(String msgId) {
                    this.msgId = msgId;
                }

            }

        }
    }
}
