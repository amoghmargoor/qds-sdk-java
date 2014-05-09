package com.qubole.qds.sdk.java.api;

import com.qubole.qds.sdk.java.entities.DbTap;

/**
 * Corresponds to http://www.qubole.com/docs/documentation/dbtaps-api-qds-api-reference/
 */
public interface DbTapApi
{
    /**
     * Corresponds to http://www.qubole.com/docs/create-a-dbtap/
     *
     * @param dbTap the data
     * @return new builder
     */
    public InvokableBuilder<DbTap> create(DbTapBuilder dbTap);

    /**
     * Corresponds to http://www.qubole.com/docs/create-a-dbtap/
     *
     * @param dbTapId id to edit
     * @param dbTap the data
     * @return new builder
     */
    public InvokableBuilder<DbTap> edit(int dbTapId, DbTapBuilder dbTap);

    /**
     * Return a new db tap builder. Can be used with
     * apis such as {@link #create(DbTapBuilder)}
     *
     * @return builder
     */
    public DbTapBuilder dbTap();
}
