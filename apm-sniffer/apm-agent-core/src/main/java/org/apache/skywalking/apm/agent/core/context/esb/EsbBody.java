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
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.skywalking.apm.agent.core.base64.Base64;
import org.apache.skywalking.apm.agent.core.context.esb.EsbBody.Transaction.Header;
import org.apache.skywalking.apm.agent.core.context.esb.EsbBody.Transaction.Header.SysHeader;

public class EsbBody {

    private Transaction Transaction;

    public boolean hasAgentHeader() {
        return hasTransaction()
            && this.Transaction.hasHeader()
            && this.Transaction.Header.hasSysHeader();
    }

    public String updateMsgId(String body, String newAuthId) {
        JsonObject bodyJsonObject = JsonParser.parseString(body).getAsJsonObject();
        JsonObject sysHeaderJsonObject = bodyJsonObject.getAsJsonObject("Transaction").getAsJsonObject("Header").getAsJsonObject("sysHeader");
        sysHeaderJsonObject.remove("authId");
        sysHeaderJsonObject.addProperty("authId", Base64.encode(newAuthId));
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(bodyJsonObject);
    }

    public String getAgentHeader() {
        return this.Transaction.Header.sysHeader.getAuthId();
    }

    public void setAgentHeader(String agentHeader) {
        SysHeader sysHeader = new SysHeader();
        sysHeader.setAuthId(agentHeader);
        Header header = new Header();
        header.setSysHeader(sysHeader);
        Transaction transaction = new Transaction();
        transaction.setHeader(header);
        this.setTransaction(transaction);
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
                private String authId;

                public String getAuthId() {
                    return authId;
                }

                public void setAuthId(String authId) {
                    this.authId = authId;
                }

            }

        }
    }
}
