/*
 * This file is generated by jOOQ.
 */
package com.cards.information_schema.tables;


import com.cards.information_schema.InformationSchema;
import com.cards.information_schema.tables.records.ColumnPrivilegesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnPrivileges extends TableImpl<ColumnPrivilegesRecord> {

    private static final long serialVersionUID = -699308369;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code>
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = new ColumnPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnPrivilegesRecord> getRecordType() {
        return ColumnPrivilegesRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTOR</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> GRANTOR = createField(DSL.name("GRANTOR"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTEE</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_NAME</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("PRIVILEGE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code> table reference
     */
    public ColumnPrivileges() {
        this(DSL.name("COLUMN_PRIVILEGES"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code> table reference
     */
    public ColumnPrivileges(String alias) {
        this(DSL.name(alias), COLUMN_PRIVILEGES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code> table reference
     */
    public ColumnPrivileges(Name alias) {
        this(alias, COLUMN_PRIVILEGES);
    }

    private ColumnPrivileges(Name alias, Table<ColumnPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnPrivileges(Name alias, Table<ColumnPrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ColumnPrivileges(Table<O> child, ForeignKey<O, ColumnPrivilegesRecord> key) {
        super(child, key, COLUMN_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnPrivileges as(String alias) {
        return new ColumnPrivileges(DSL.name(alias), this);
    }

    @Override
    public ColumnPrivileges as(Name alias) {
        return new ColumnPrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnPrivileges rename(String name) {
        return new ColumnPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnPrivileges rename(Name name) {
        return new ColumnPrivileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
