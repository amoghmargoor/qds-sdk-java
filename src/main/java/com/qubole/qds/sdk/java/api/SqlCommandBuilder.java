/**
 * Copyright 2014- Qubole Inc.
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
package com.qubole.qds.sdk.java.api;

import com.qubole.qds.sdk.java.entities.CommandResponse;

public interface SqlCommandBuilder extends InvokableBuilder<CommandResponse>
{
    public SqlCommandBuilder query(String query);

    public SqlCommandBuilder scriptLocation(String scriptLocation);

    public SqlCommandBuilder commandType(String commandType);

    public SqlCommandBuilder sampleSize(int sampleSize);

    public SqlCommandBuilder approxModeProgress(double approxModeProgress);

    public SqlCommandBuilder approxModeMaxRt(int approxModeMaxRt);

    public SqlCommandBuilder approxModeMinRt(int approxModeMinRt);

    public SqlCommandBuilder approxAggregations(boolean approxAggregations);

    public SqlCommandBuilder macro(String name, String value);

    public SqlCommandBuilder clusterLabel(String clusterLabel);

    public SqlCommandBuilder name(String queryName);

    public SqlCommandBuilder tags(String[] queryTags);

    public BaseCommand build();
}
