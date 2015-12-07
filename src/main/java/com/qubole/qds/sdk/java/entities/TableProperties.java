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
package com.qubole.qds.sdk.java.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TableProperties
{
    private String interval;
    private String interval_unit;
    private List<Map<String, String>> columns;

    public TableProperties()
    {
    }

    public TableProperties(String interval, String interval_unit, List<Map<String, String>> columns)
    {
        this.interval = interval;
        this.interval_unit = interval_unit;
        this.columns = columns;
    }

    public String getInterval()
    {
        return interval;
    }

    public void setInterval(String interval)
    {
        this.interval = interval;
    }

    public String getInterval_unit()
    {
        return interval_unit;
    }

    public void setInterval_unit(String interval_unit)
    {
        this.interval_unit = interval_unit;
    }

    public List<Map<String, String>> getColumns()
    {
        return columns;
    }

    public void setColumns(List<Map<String, String>> columns)
    {
        this.columns = columns;
    }
}
