/*
 * This file is generated by jOOQ.
 */
package org.jooq.impl;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.jooq.Check;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;


/**
 * The migration history of jOOQ Migrations.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
class History extends TableImpl<HistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>JOOQ_MIGRATION_HISTORY</code>
     */
    static final History HISTORY = new History();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HistoryRecord> getRecordType() {
        return HistoryRecord.class;
    }

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.ID</code>. The database version
     * ID.
     */
    final TableField<HistoryRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "The database version ID.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.MIGRATED_AT</code>. The date/time
     * when the database version was migrated to.
     */
    final TableField<HistoryRecord, Timestamp> MIGRATED_AT = createField(DSL.name("MIGRATED_AT"), SQLDataType.TIMESTAMP(6).nullable(false), this, "The date/time when the database version was migrated to.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.MIGRATED_FROM</code>. The
     * previous database version ID.
     */
    final TableField<HistoryRecord, String> MIGRATED_FROM = createField(DSL.name("MIGRATED_FROM"), SQLDataType.VARCHAR(255).nullable(false), this, "The previous database version ID.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO</code>. The current
     * database version ID.
     */
    final TableField<HistoryRecord, String> MIGRATED_TO = createField(DSL.name("MIGRATED_TO"), SQLDataType.VARCHAR(255).nullable(false), this, "The current database version ID.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO_MESSAGE</code>. A
     * message associated with the migration execution.
     */
    final TableField<HistoryRecord, String> MIGRATED_TO_MESSAGE = createField(DSL.name("MIGRATED_TO_MESSAGE"), SQLDataType.CLOB.nullable(false), this, "A message associated with the migration execution.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO_TAGS</code>. The
     * current database version tags, if any, in JSON array format.
     */
    final TableField<HistoryRecord, String> MIGRATED_TO_TAGS = createField(DSL.name("MIGRATED_TO_TAGS"), SQLDataType.CLOB.nullable(false), this, "The current database version tags, if any, in JSON array format.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.MIGRATION_TIME</code>. The time
     * in milliseconds it took to migrate to this database version.
     */
    final TableField<HistoryRecord, Long> MIGRATION_TIME = createField(DSL.name("MIGRATION_TIME"), SQLDataType.BIGINT, this, "The time in milliseconds it took to migrate to this database version.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.CLIENT_USER_NAME</code>. The
     * client user name that was running the migration.
     */
    final TableField<HistoryRecord, String> CLIENT_USER_NAME = createField(DSL.name("CLIENT_USER_NAME"), SQLDataType.VARCHAR(255), this, "The client user name that was running the migration.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.CLIENT_HOST_NAME</code>. The
     * client host name that was running the migration.
     */
    final TableField<HistoryRecord, String> CLIENT_HOST_NAME = createField(DSL.name("CLIENT_HOST_NAME"), SQLDataType.VARCHAR(255), this, "The client host name that was running the migration.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.JOOQ_VERSION</code>. The jOOQ
     * version used to migrate to this database version.
     */
    final TableField<HistoryRecord, String> JOOQ_VERSION = createField(DSL.name("JOOQ_VERSION"), SQLDataType.VARCHAR(50).nullable(false), this, "The jOOQ version used to migrate to this database version.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.SQL</code>. The SQL statements
     * that were run to install this database version.
     */
    final TableField<HistoryRecord, String> SQL = createField(DSL.name("SQL"), SQLDataType.CLOB, this, "The SQL statements that were run to install this database version.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.SQL_COUNT</code>. The number of
     * SQL statements that were run to install this database version.
     */
    final TableField<HistoryRecord, Integer> SQL_COUNT = createField(DSL.name("SQL_COUNT"), SQLDataType.INTEGER.nullable(false), this, "The number of SQL statements that were run to install this database version.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.STATUS</code>. The database
     * version installation status.
     */
    final TableField<HistoryRecord, HistoryStatus> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(10).nullable(false).asEnumDataType(HistoryStatus.class), this, "The database version installation status.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.STATUS_MESSAGE</code>. Any info
     * or error message explaining the status.
     */
    final TableField<HistoryRecord, String> STATUS_MESSAGE = createField(DSL.name("STATUS_MESSAGE"), SQLDataType.CLOB, this, "Any info or error message explaining the status.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.RESOLUTION</code>. The error
     * resolution, if any.
     */
    final TableField<HistoryRecord, HistoryResolution> RESOLUTION = createField(DSL.name("RESOLUTION"), SQLDataType.VARCHAR(10).asEnumDataType(HistoryResolution.class), this, "The error resolution, if any.");

    /**
     * The column <code>JOOQ_MIGRATION_HISTORY.RESOLUTION_MESSAGE</code>. Any
     * info or error message explaining the resolution.
     */
    final TableField<HistoryRecord, String> RESOLUTION_MESSAGE = createField(DSL.name("RESOLUTION_MESSAGE"), SQLDataType.CLOB, this, "Any info or error message explaining the resolution.");

    private History(Name alias, Table<HistoryRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private History(Name alias, Table<HistoryRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("The migration history of jOOQ Migrations."), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>JOOQ_MIGRATION_HISTORY</code> table reference
     */
    History(String alias) {
        this(DSL.name(alias), HISTORY);
    }

    /**
     * Create an aliased <code>JOOQ_MIGRATION_HISTORY</code> table reference
     */
    History(Name alias) {
        this(alias, HISTORY);
    }

    /**
     * Create a <code>JOOQ_MIGRATION_HISTORY</code> table reference
     */
    History() {
        this(DSL.name("JOOQ_MIGRATION_HISTORY"), null);
    }

    @Override
    public Identity<HistoryRecord, Integer> getIdentity() {
        return (Identity<HistoryRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HistoryRecord> getPrimaryKey() {
        return Internal.createUniqueKey(History.HISTORY, DSL.name("JOOQ_MIGR_HIST_PK"), new TableField[] { History.HISTORY.ID }, true);
    }

    @Override
    public List<Check<HistoryRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("JOOQ_MIGR_HIST_CHK1"), "\"STATUS\" IN('STARTING', 'REVERTING', 'MIGRATING', 'SUCCESS', 'FAILURE')", true),
            Internal.createCheck(this, DSL.name("JOOQ_MIGR_HIST_CHK2"), "\"RESOLUTION\" IN('OPEN', 'RESOLVED', 'IGNORED')", true)
        );
    }

    @Override
    public History as(String alias) {
        return new History(DSL.name(alias), this);
    }

    @Override
    public History as(Name alias) {
        return new History(alias, this);
    }

    @Override
    public History as(Table<?> alias) {
        return new History(alias.getQualifiedName(), this);
    }
}
