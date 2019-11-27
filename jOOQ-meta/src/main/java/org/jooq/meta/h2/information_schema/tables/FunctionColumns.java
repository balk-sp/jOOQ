/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.h2.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FunctionColumns extends TableImpl<Record> {

    private static final long serialVersionUID = -228183332;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>
     */
    public static final FunctionColumns FUNCTION_COLUMNS = new FunctionColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>.
     */
    public static final TableField<Record, String> ALIAS_CATALOG = createField(DSL.name("ALIAS_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>.
     */
    public static final TableField<Record, String> ALIAS_SCHEMA = createField(DSL.name("ALIAS_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>.
     */
    public static final TableField<Record, String> ALIAS_NAME = createField(DSL.name("ALIAS_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>.
     */
    public static final TableField<Record, String> JAVA_CLASS = createField(DSL.name("JAVA_CLASS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>.
     */
    public static final TableField<Record, String> JAVA_METHOD = createField(DSL.name("JAVA_METHOD"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>.
     */
    public static final TableField<Record, Integer> COLUMN_COUNT = createField(DSL.name("COLUMN_COUNT"), org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>.
     */
    public static final TableField<Record, Integer> POS = createField(DSL.name("POS"), org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>.
     */
    public static final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>.
     */
    public static final TableField<Record, Integer> DATA_TYPE = createField(DSL.name("DATA_TYPE"), org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>.
     */
    public static final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>.
     */
    public static final TableField<Record, Integer> PRECISION = createField(DSL.name("PRECISION"), org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>.
     */
    public static final TableField<Record, Short> SCALE = createField(DSL.name("SCALE"), org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>.
     */
    public static final TableField<Record, Short> RADIX = createField(DSL.name("RADIX"), org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>.
     */
    public static final TableField<Record, Short> NULLABLE = createField(DSL.name("NULLABLE"), org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>.
     */
    public static final TableField<Record, Short> COLUMN_TYPE = createField(DSL.name("COLUMN_TYPE"), org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>.
     */
    public static final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>.
     */
    public static final TableField<Record, String> COLUMN_DEFAULT = createField(DSL.name("COLUMN_DEFAULT"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), FUNCTION_COLUMNS, "");

    /**
     * No further instances allowed
     */
    private FunctionColumns() {
        this(DSL.name("FUNCTION_COLUMNS"), null);
    }

    private FunctionColumns(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private FunctionColumns(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FunctionColumns(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, FUNCTION_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
