/*
 * Copyright (C) 2017 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.exec.work.foreman;

import java.util.Date;

import com.dremio.exec.proto.UserBitShared.QueryResult.QueryState;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoggedQuery {
//  static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggedQuery.class);

  private final String queryId;
  private final String schema;
  private final String queryText;
  private final Date start;
  private final Date finish;
  private final QueryState outcome;
  private final String username;
  private final String commandDescription;

  public LoggedQuery(String queryId, String schema, String queryText, Date start, Date finish, QueryState outcome,
      String username, String commandDescription) {
    this.queryId = queryId;
    this.schema = schema;
    this.queryText = queryText;
    this.start = start;
    this.finish = finish;
    this.outcome = outcome;
    this.username = username;
    this.commandDescription = commandDescription;
  }

  @JsonProperty("id")
  public String getQueryId() {
    return queryId;
  }

  public String getSchema() {
    return schema;
  }

  @JsonProperty("query")
  public String getQueryText() {
    return queryText;
  }

  public Date getStart() {
    return start;
  }

  public Date getFinish() {
    return finish;
  }

  public QueryState getOutcome() {
    return outcome;
  }

  @JsonProperty("user")
  public String getUsername() {
    return username;
  }

  public String getCommandDescription() {
    return commandDescription;
  }

}
