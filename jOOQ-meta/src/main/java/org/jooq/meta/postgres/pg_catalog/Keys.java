/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.pg_catalog;


import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.meta.postgres.pg_catalog.tables.PgAttrdef;
import org.jooq.meta.postgres.pg_catalog.tables.PgAttribute;
import org.jooq.meta.postgres.pg_catalog.tables.PgClass;
import org.jooq.meta.postgres.pg_catalog.tables.PgCollation;
import org.jooq.meta.postgres.pg_catalog.tables.PgConstraint;
import org.jooq.meta.postgres.pg_catalog.tables.PgDescription;
import org.jooq.meta.postgres.pg_catalog.tables.PgEnum;
import org.jooq.meta.postgres.pg_catalog.tables.PgIndex;
import org.jooq.meta.postgres.pg_catalog.tables.PgInherits;
import org.jooq.meta.postgres.pg_catalog.tables.PgNamespace;
import org.jooq.meta.postgres.pg_catalog.tables.PgProc;
import org.jooq.meta.postgres.pg_catalog.tables.PgSequence;
import org.jooq.meta.postgres.pg_catalog.tables.PgType;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * pg_catalog.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> PG_ATTRDEF_ADRELID_ADNUM_INDEX = Internal.createUniqueKey(PgAttrdef.PG_ATTRDEF, DSL.name("pg_attrdef_adrelid_adnum_index"), new TableField[] { PgAttrdef.PG_ATTRDEF.ADRELID, PgAttrdef.PG_ATTRDEF.ADNUM }, true);
    public static final UniqueKey<Record> PG_ATTRDEF_OID_INDEX = Internal.createUniqueKey(PgAttrdef.PG_ATTRDEF, DSL.name("pg_attrdef_oid_index"), new TableField[] { PgAttrdef.PG_ATTRDEF.OID }, true);
    public static final UniqueKey<Record> PG_ATTRIBUTE_RELID_ATTNAM_INDEX = Internal.createUniqueKey(PgAttribute.PG_ATTRIBUTE, DSL.name("pg_attribute_relid_attnam_index"), new TableField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNAME }, true);
    public static final UniqueKey<Record> PG_ATTRIBUTE_RELID_ATTNUM_INDEX = Internal.createUniqueKey(PgAttribute.PG_ATTRIBUTE, DSL.name("pg_attribute_relid_attnum_index"), new TableField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNUM }, true);
    public static final UniqueKey<Record> PG_CLASS_OID_INDEX = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("pg_class_oid_index"), new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final UniqueKey<Record> PG_CLASS_RELNAME_NSP_INDEX = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("pg_class_relname_nsp_index"), new TableField[] { PgClass.PG_CLASS.RELNAME, PgClass.PG_CLASS.RELNAMESPACE }, true);
    public static final UniqueKey<Record> SYNTHETIC_PK_PG_CLASS = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("SYNTHETIC_PK_pg_class"), new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final UniqueKey<Record> PG_COLLATION_NAME_ENC_NSP_INDEX = Internal.createUniqueKey(PgCollation.PG_COLLATION, DSL.name("pg_collation_name_enc_nsp_index"), new TableField[] { PgCollation.PG_COLLATION.COLLNAME, PgCollation.PG_COLLATION.COLLENCODING, PgCollation.PG_COLLATION.COLLNAMESPACE }, true);
    public static final UniqueKey<Record> PG_COLLATION_OID_INDEX = Internal.createUniqueKey(PgCollation.PG_COLLATION, DSL.name("pg_collation_oid_index"), new TableField[] { PgCollation.PG_COLLATION.OID }, true);
    public static final UniqueKey<Record> PG_CONSTRAINT_CONRELID_CONTYPID_CONNAME_INDEX = Internal.createUniqueKey(PgConstraint.PG_CONSTRAINT, DSL.name("pg_constraint_conrelid_contypid_conname_index"), new TableField[] { PgConstraint.PG_CONSTRAINT.CONRELID, PgConstraint.PG_CONSTRAINT.CONTYPID, PgConstraint.PG_CONSTRAINT.CONNAME }, true);
    public static final UniqueKey<Record> PG_CONSTRAINT_OID_INDEX = Internal.createUniqueKey(PgConstraint.PG_CONSTRAINT, DSL.name("pg_constraint_oid_index"), new TableField[] { PgConstraint.PG_CONSTRAINT.OID }, true);
    public static final UniqueKey<Record> PG_DESCRIPTION_O_C_O_INDEX = Internal.createUniqueKey(PgDescription.PG_DESCRIPTION, DSL.name("pg_description_o_c_o_index"), new TableField[] { PgDescription.PG_DESCRIPTION.OBJOID, PgDescription.PG_DESCRIPTION.CLASSOID, PgDescription.PG_DESCRIPTION.OBJSUBID }, true);
    public static final UniqueKey<Record> PG_ENUM_OID_INDEX = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_oid_index"), new TableField[] { PgEnum.PG_ENUM.OID }, true);
    public static final UniqueKey<Record> PG_ENUM_TYPID_LABEL_INDEX = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_typid_label_index"), new TableField[] { PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMLABEL }, true);
    public static final UniqueKey<Record> PG_ENUM_TYPID_SORTORDER_INDEX = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_typid_sortorder_index"), new TableField[] { PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMSORTORDER }, true);
    public static final UniqueKey<Record> PG_INDEX_INDEXRELID_INDEX = Internal.createUniqueKey(PgIndex.PG_INDEX, DSL.name("pg_index_indexrelid_index"), new TableField[] { PgIndex.PG_INDEX.INDEXRELID }, true);
    public static final UniqueKey<Record> PG_INHERITS_RELID_SEQNO_INDEX = Internal.createUniqueKey(PgInherits.PG_INHERITS, DSL.name("pg_inherits_relid_seqno_index"), new TableField[] { PgInherits.PG_INHERITS.INHRELID, PgInherits.PG_INHERITS.INHSEQNO }, true);
    public static final UniqueKey<Record> PG_NAMESPACE_NSPNAME_INDEX = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("pg_namespace_nspname_index"), new TableField[] { PgNamespace.PG_NAMESPACE.NSPNAME }, true);
    public static final UniqueKey<Record> PG_NAMESPACE_OID_INDEX = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("pg_namespace_oid_index"), new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final UniqueKey<Record> SYNTHETIC_PK_PG_NAMESPACE = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("SYNTHETIC_PK_pg_namespace"), new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final UniqueKey<Record> PG_PROC_OID_INDEX = Internal.createUniqueKey(PgProc.PG_PROC, DSL.name("pg_proc_oid_index"), new TableField[] { PgProc.PG_PROC.OID }, true);
    public static final UniqueKey<Record> PG_PROC_PRONAME_ARGS_NSP_INDEX = Internal.createUniqueKey(PgProc.PG_PROC, DSL.name("pg_proc_proname_args_nsp_index"), new TableField[] { PgProc.PG_PROC.PRONAME, PgProc.PG_PROC.PROARGTYPES, PgProc.PG_PROC.PRONAMESPACE }, true);
    public static final UniqueKey<Record> PG_SEQUENCE_SEQRELID_INDEX = Internal.createUniqueKey(PgSequence.PG_SEQUENCE, DSL.name("pg_sequence_seqrelid_index"), new TableField[] { PgSequence.PG_SEQUENCE.SEQRELID }, true);
    public static final UniqueKey<Record> PG_TYPE_OID_INDEX = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("pg_type_oid_index"), new TableField[] { PgType.PG_TYPE.OID }, true);
    public static final UniqueKey<Record> PG_TYPE_TYPNAME_NSP_INDEX = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("pg_type_typname_nsp_index"), new TableField[] { PgType.PG_TYPE.TYPNAME, PgType.PG_TYPE.TYPNAMESPACE }, true);
    public static final UniqueKey<Record> SYNTHETIC_PK_PG_TYPE = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("SYNTHETIC_PK_pg_type"), new TableField[] { PgType.PG_TYPE.OID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Record, Record> PG_ATTRIBUTE__SYNTHETIC_FK_PG_ATTRIBUTE__SYNTHETIC_PK_PG_CLASS = Internal.createForeignKey(PgAttribute.PG_ATTRIBUTE, DSL.name("SYNTHETIC_FK_pg_attribute__SYNTHETIC_PK_pg_class"), new TableField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID }, Keys.SYNTHETIC_PK_PG_CLASS, new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final ForeignKey<Record, Record> PG_CLASS__SYNTHETIC_FK_PG_CLASS__SYNTHETIC_PK_PG_NAMESPACE = Internal.createForeignKey(PgClass.PG_CLASS, DSL.name("SYNTHETIC_FK_pg_class__SYNTHETIC_PK_pg_namespace"), new TableField[] { PgClass.PG_CLASS.RELNAMESPACE }, Keys.SYNTHETIC_PK_PG_NAMESPACE, new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final ForeignKey<Record, Record> PG_CONSTRAINT__SYNTHETIC_FK_PG_CONSTRAINT__SYNTHETIC_PK_PG_CLASS = Internal.createForeignKey(PgConstraint.PG_CONSTRAINT, DSL.name("SYNTHETIC_FK_pg_constraint__SYNTHETIC_PK_pg_class"), new TableField[] { PgConstraint.PG_CONSTRAINT.CONRELID }, Keys.SYNTHETIC_PK_PG_CLASS, new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final ForeignKey<Record, Record> PG_CONSTRAINT__SYNTHETIC_FK_PG_CONSTRAINT__SYNTHETIC_PK_PG_NAMESPACE = Internal.createForeignKey(PgConstraint.PG_CONSTRAINT, DSL.name("SYNTHETIC_FK_pg_constraint__SYNTHETIC_PK_pg_namespace"), new TableField[] { PgConstraint.PG_CONSTRAINT.CONNAMESPACE }, Keys.SYNTHETIC_PK_PG_NAMESPACE, new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final ForeignKey<Record, Record> PG_ENUM__SYNTHETIC_FK_PG_ENUM__SYNTHETIC_PK_PG_TYPE = Internal.createForeignKey(PgEnum.PG_ENUM, DSL.name("SYNTHETIC_FK_pg_enum__SYNTHETIC_PK_pg_type"), new TableField[] { PgEnum.PG_ENUM.ENUMTYPID }, Keys.SYNTHETIC_PK_PG_TYPE, new TableField[] { PgType.PG_TYPE.OID }, true);
    public static final ForeignKey<Record, Record> PG_INDEX__INDEX_CLASS = Internal.createForeignKey(PgIndex.PG_INDEX, DSL.name("INDEX_CLASS"), new TableField[] { PgIndex.PG_INDEX.INDEXRELID }, Keys.SYNTHETIC_PK_PG_CLASS, new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final ForeignKey<Record, Record> PG_INDEX__TABLE_CLASS = Internal.createForeignKey(PgIndex.PG_INDEX, DSL.name("TABLE_CLASS"), new TableField[] { PgIndex.PG_INDEX.INDRELID }, Keys.SYNTHETIC_PK_PG_CLASS, new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final ForeignKey<Record, Record> PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_NAMESPACE = Internal.createForeignKey(PgProc.PG_PROC, DSL.name("SYNTHETIC_FK_pg_proc__SYNTHETIC_PK_pg_namespace"), new TableField[] { PgProc.PG_PROC.PRONAMESPACE }, Keys.SYNTHETIC_PK_PG_NAMESPACE, new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final ForeignKey<Record, Record> PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_TYPE = Internal.createForeignKey(PgProc.PG_PROC, DSL.name("SYNTHETIC_FK_pg_proc__SYNTHETIC_PK_pg_type"), new TableField[] { PgProc.PG_PROC.PRORETTYPE }, Keys.SYNTHETIC_PK_PG_TYPE, new TableField[] { PgType.PG_TYPE.OID }, true);
    public static final ForeignKey<Record, Record> PG_SEQUENCE__SYNTHETIC_FK_PG_SEQUENCE__SYNTHETIC_PK_PG_CLASS = Internal.createForeignKey(PgSequence.PG_SEQUENCE, DSL.name("SYNTHETIC_FK_pg_sequence__SYNTHETIC_PK_pg_class"), new TableField[] { PgSequence.PG_SEQUENCE.SEQRELID }, Keys.SYNTHETIC_PK_PG_CLASS, new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final ForeignKey<Record, Record> PG_SEQUENCE__SYNTHETIC_FK_PG_SEQUENCE__SYNTHETIC_PK_PG_TYPE = Internal.createForeignKey(PgSequence.PG_SEQUENCE, DSL.name("SYNTHETIC_FK_pg_sequence__SYNTHETIC_PK_pg_type"), new TableField[] { PgSequence.PG_SEQUENCE.SEQTYPID }, Keys.SYNTHETIC_PK_PG_TYPE, new TableField[] { PgType.PG_TYPE.OID }, true);
    public static final ForeignKey<Record, Record> PG_TYPE__SYNTHETIC_FK_PG_TYPE__SYNTHETIC_PK_PG_NAMESPACE = Internal.createForeignKey(PgType.PG_TYPE, DSL.name("SYNTHETIC_FK_pg_type__SYNTHETIC_PK_pg_namespace"), new TableField[] { PgType.PG_TYPE.TYPNAMESPACE }, Keys.SYNTHETIC_PK_PG_NAMESPACE, new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
}
