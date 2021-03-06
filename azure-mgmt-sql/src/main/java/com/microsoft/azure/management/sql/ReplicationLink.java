/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasId;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasName;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;
import com.microsoft.azure.management.sql.implementation.ReplicationLinkInner;
import org.joda.time.DateTime;


/**
 * An immutable client-side representation of an Azure SQL Replication link.
 */
@Fluent
public interface ReplicationLink extends
        Refreshable<ReplicationLink>,
        Wrapper<ReplicationLinkInner>,
        HasResourceGroup,
        HasName,
        HasId {

    /**
     * @return name of the SQL Server to which this replication belongs
     */
    String sqlServerName();

    /**
     * @return name of the SQL Database to which this replication belongs
     */
    String databaseName();

    /**
     * @return the name of the Azure SQL Server hosting the partner Azure SQL Database.
     */
    String partnerServer();

    /**
     * @return the name of the partner Azure SQL Database
     */
    String partnerDatabase();

    /**
     * @return the Azure Region of the partner Azure SQL Database
     */
    String partnerLocation();

    /**
     * @return the role of the SQL Database in the replication link
     */
    ReplicationRole role();

    /**
     * @return the role of the partner SQL Database in the replication link
     */
    ReplicationRole partnerRole();

    /**
     * @return start time for the replication link (ISO8601 format)
     */
    DateTime startTime();

    /**
     * @return the percentage of the seeding completed for the replication link
     */
    int percentComplete();

    /**
     * @return the replication state for the replication link
     */
    ReplicationState replicationState();

    /**
     * Deletes the replication link.
     */
    void delete();

    /**
     * Fails over the Azure SQL Database Replication Link.
     */
    void failover();

    /**
     * Forces fail over the Azure SQL Database Replication Link which may result in data loss.
     */
    void forceFailoverAllowDataLoss();
}

