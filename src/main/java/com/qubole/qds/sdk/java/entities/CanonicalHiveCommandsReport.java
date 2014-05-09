package com.qubole.qds.sdk.java.entities;

import java.util.List;

public class CanonicalHiveCommandsReport
{
    private String sort_column;
    private String start_date;
    private String end_date;
    private List<CanonicalQuery> canonical_queries;

    public CanonicalHiveCommandsReport()
    {
    }

    public CanonicalHiveCommandsReport(String sort_column, String start_date, String end_date, List<CanonicalQuery> canonical_queries)
    {
        this.sort_column = sort_column;
        this.start_date = start_date;
        this.end_date = end_date;
        this.canonical_queries = canonical_queries;
    }

    public String getSort_column()
    {
        return sort_column;
    }

    public void setSort_column(String sort_column)
    {
        this.sort_column = sort_column;
    }

    public String getStart_date()
    {
        return start_date;
    }

    public void setStart_date(String start_date)
    {
        this.start_date = start_date;
    }

    public String getEnd_date()
    {
        return end_date;
    }

    public void setEnd_date(String end_date)
    {
        this.end_date = end_date;
    }

    public List<CanonicalQuery> getCanonical_queries()
    {
        return canonical_queries;
    }

    public void setCanonical_queries(List<CanonicalQuery> canonical_queries)
    {
        this.canonical_queries = canonical_queries;
    }
}