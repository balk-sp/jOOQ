/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.pg_catalog.Keys;
import org.jooq.meta.postgres.pg_catalog.PgCatalog;
import org.jooq.meta.postgres.pg_catalog.tables.PgNamespace.PgNamespacePath;
import org.jooq.meta.postgres.pg_catalog.tables.PgType.PgTypePath;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgProc extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_proc</code>
     */
    public static final PgProc PG_PROC = new PgProc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_proc.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proname</code>.
     */
    public final TableField<Record, String> PRONAME = createField(DSL.name("proname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.pronamespace</code>.
     */
    public final TableField<Record, Long> PRONAMESPACE = createField(DSL.name("pronamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proowner</code>.
     */
    public final TableField<Record, Long> PROOWNER = createField(DSL.name("proowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prolang</code>.
     */
    public final TableField<Record, Long> PROLANG = createField(DSL.name("prolang"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.procost</code>.
     */
    public final TableField<Record, Float> PROCOST = createField(DSL.name("procost"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prorows</code>.
     */
    public final TableField<Record, Float> PROROWS = createField(DSL.name("prorows"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.provariadic</code>.
     */
    public final TableField<Record, Long> PROVARIADIC = createField(DSL.name("provariadic"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prosupport</code>.
     */
    public final TableField<Record, String> PROSUPPORT = createField(DSL.name("prosupport"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prokind</code>.
     */
    public final TableField<Record, String> PROKIND = createField(DSL.name("prokind"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prosecdef</code>.
     */
    public final TableField<Record, Boolean> PROSECDEF = createField(DSL.name("prosecdef"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proleakproof</code>.
     */
    public final TableField<Record, Boolean> PROLEAKPROOF = createField(DSL.name("proleakproof"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proisstrict</code>.
     */
    public final TableField<Record, Boolean> PROISSTRICT = createField(DSL.name("proisstrict"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proretset</code>.
     */
    public final TableField<Record, Boolean> PRORETSET = createField(DSL.name("proretset"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.provolatile</code>.
     */
    public final TableField<Record, String> PROVOLATILE = createField(DSL.name("provolatile"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proparallel</code>.
     */
    public final TableField<Record, String> PROPARALLEL = createField(DSL.name("proparallel"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.pronargs</code>.
     */
    public final TableField<Record, Short> PRONARGS = createField(DSL.name("pronargs"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.pronargdefaults</code>.
     */
    public final TableField<Record, Short> PRONARGDEFAULTS = createField(DSL.name("pronargdefaults"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prorettype</code>.
     */
    public final TableField<Record, Long> PRORETTYPE = createField(DSL.name("prorettype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proargtypes</code>.
     */
    public final TableField<Record, Object[]> PROARGTYPES = createField(DSL.name("proargtypes"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proallargtypes</code>.
     */
    public final TableField<Record, Long[]> PROALLARGTYPES = createField(DSL.name("proallargtypes"), SQLDataType.BIGINT.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proargmodes</code>.
     */
    public final TableField<Record, String[]> PROARGMODES = createField(DSL.name("proargmodes"), SQLDataType.CHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proargnames</code>.
     */
    public final TableField<Record, String[]> PROARGNAMES = createField(DSL.name("proargnames"), SQLDataType.CLOB.array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> PROARGDEFAULTS = createField(DSL.name("proargdefaults"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.protrftypes</code>.
     */
    public final TableField<Record, Long[]> PROTRFTYPES = createField(DSL.name("protrftypes"), SQLDataType.BIGINT.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.prosrc</code>.
     */
    public final TableField<Record, String> PROSRC = createField(DSL.name("prosrc"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.probin</code>.
     */
    public final TableField<Record, String> PROBIN = createField(DSL.name("probin"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> PROSQLBODY = createField(DSL.name("prosqlbody"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proconfig</code>.
     */
    public final TableField<Record, String[]> PROCONFIG = createField(DSL.name("proconfig"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_proc.proacl</code>.
     */
    public final TableField<Record, String[]> PROACL = createField(DSL.name("proacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgProc(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgProc(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_proc</code> table reference
     */
    public PgProc(String alias) {
        this(DSL.name(alias), PG_PROC);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_proc</code> table reference
     */
    public PgProc(Name alias) {
        this(alias, PG_PROC);
    }

    /**
     * Create a <code>pg_catalog.pg_proc</code> table reference
     */
    public PgProc() {
        this(DSL.name("pg_proc"), null);
    }

    public <O extends Record> PgProc(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, PG_PROC);
    }

    public static class PgProcPath extends PgProc implements Path<Record> {
        public <O extends Record> PgProcPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_PROC_OID_INDEX;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PROC_PRONAME_ARGS_NSP_INDEX);
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_NAMESPACE, Keys.PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_TYPE);
    }

    private transient PgNamespacePath _pgNamespace;

    /**
     * Get the implicit join path to the <code>pg_catalog.pg_namespace</code>
     * table.
     */
    public PgNamespacePath pgNamespace() {
        if (_pgNamespace == null)
            _pgNamespace = new PgNamespacePath(this, Keys.PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_NAMESPACE, null);

        return _pgNamespace;
    }

    private transient PgTypePath _pgType;

    /**
     * Get the implicit join path to the <code>pg_catalog.pg_type</code> table.
     */
    public PgTypePath pgType() {
        if (_pgType == null)
            _pgType = new PgTypePath(this, Keys.PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_TYPE, null);

        return _pgType;
    }

    @Override
    public PgProc as(String alias) {
        return new PgProc(DSL.name(alias), this);
    }

    @Override
    public PgProc as(Name alias) {
        return new PgProc(alias, this);
    }

    @Override
    public PgProc as(Table<?> alias) {
        return new PgProc(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgProc rename(String name) {
        return new PgProc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgProc rename(Name name) {
        return new PgProc(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgProc rename(Table<?> name) {
        return new PgProc(name.getQualifiedName(), null);
    }
}
