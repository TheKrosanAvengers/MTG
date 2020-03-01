/*
 * This file is generated by jOOQ.
 */
package org.krosanavengers.mtg.jooq.h2.public_.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.krosanavengers.mtg.jooq.h2.public_.Indexes;
import org.krosanavengers.mtg.jooq.h2.public_.Keys;
import org.krosanavengers.mtg.jooq.h2.public_.Public;
import org.krosanavengers.mtg.jooq.h2.public_.tables.records.StaticabilitiesRecord;


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
public class Staticabilities extends TableImpl<StaticabilitiesRecord> {

    private static final long serialVersionUID = -498878069;

    /**
     * The reference instance of <code>PUBLIC.STATICABILITIES</code>
     */
    public static final Staticabilities STATICABILITIES = new Staticabilities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaticabilitiesRecord> getRecordType() {
        return StaticabilitiesRecord.class;
    }

    /**
     * The column <code>PUBLIC.STATICABILITIES.ID</code>.
     */
    public final TableField<StaticabilitiesRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.STATICABILITIES.NAME</code>.
     */
    public final TableField<StaticabilitiesRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>PUBLIC.STATICABILITIES.TEXT</code>.
     */
    public final TableField<StaticabilitiesRecord, String> TEXT = createField(DSL.name("TEXT"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>PUBLIC.STATICABILITIES</code> table reference
     */
    public Staticabilities() {
        this(DSL.name("STATICABILITIES"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.STATICABILITIES</code> table reference
     */
    public Staticabilities(String alias) {
        this(DSL.name(alias), STATICABILITIES);
    }

    /**
     * Create an aliased <code>PUBLIC.STATICABILITIES</code> table reference
     */
    public Staticabilities(Name alias) {
        this(alias, STATICABILITIES);
    }

    private Staticabilities(Name alias, Table<StaticabilitiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Staticabilities(Name alias, Table<StaticabilitiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Staticabilities(Table<O> child, ForeignKey<O, StaticabilitiesRecord> key) {
        super(child, key, STATICABILITIES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_C, Indexes.CONSTRAINT_INDEX_C1, Indexes.PRIMARY_KEY_C);
    }

    @Override
    public Identity<StaticabilitiesRecord, Long> getIdentity() {
        return Keys.IDENTITY_STATICABILITIES;
    }

    @Override
    public UniqueKey<StaticabilitiesRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_C;
    }

    @Override
    public List<UniqueKey<StaticabilitiesRecord>> getKeys() {
        return Arrays.<UniqueKey<StaticabilitiesRecord>>asList(Keys.CONSTRAINT_C, Keys.CONSTRAINT_C1, Keys.CONSTRAINT_C1D);
    }

    @Override
    public Staticabilities as(String alias) {
        return new Staticabilities(DSL.name(alias), this);
    }

    @Override
    public Staticabilities as(Name alias) {
        return new Staticabilities(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Staticabilities rename(String name) {
        return new Staticabilities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Staticabilities rename(Name name) {
        return new Staticabilities(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}