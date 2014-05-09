package com.qubole.qds.sdk.java.details;

import com.qubole.qds.sdk.java.api.CanonicalHiveCommandsReportBuilder;
import com.qubole.qds.sdk.java.api.ReportsApi;
import com.qubole.qds.sdk.java.client.QdsClient;

class ReportsApiImpl implements ReportsApi
{
    private final QdsClient client;

    @Override
    public CanonicalHiveCommandsReportBuilder canonicalHiveCommands()
    {
        return new CanonicalHiveCommandsReportBuilderImpl(client);
    }

    ReportsApiImpl(QdsClient client)
    {
        this.client = client;
    }
}
