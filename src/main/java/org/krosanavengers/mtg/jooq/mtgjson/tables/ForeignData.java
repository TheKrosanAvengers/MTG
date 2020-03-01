/*
 * This file is generated by jOOQ.
 */
package org.krosanavengers.mtg.jooq.mtgjson.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.krosanavengers.mtg.jooq.mtgjson.DefaultSchema;
import org.krosanavengers.mtg.jooq.mtgjson.Keys;
import org.krosanavengers.mtg.jooq.mtgjson.tables.records.ForeignDataRecord;


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
public class ForeignData extends TableImpl<ForeignDataRecord> {

    private static final long serialVersionUID = 758718460;

    /**
     * The reference instance of <code>foreign_data</code>
     */
    public static final ForeignData FOREIGN_DATA = new ForeignData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignDataRecord> getRecordType() {
        return ForeignDataRecord.class;
    }

    /**
     * The column <code>foreign_data.id</code>.
     */
    public final TableField<ForeignDataRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>foreign_data.flavorText</code>.
     */
    public final TableField<ForeignDataRecord, String> FLAVORTEXT = createField(DSL.name("flavorText"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>foreign_data.language</code>.
     */
    public final TableField<ForeignDataRecord, String> LANGUAGE = createField(DSL.name("language"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>foreign_data.multiverseId</code>.
     */
    public final TableField<ForeignDataRecord, Integer> MULTIVERSEID = createField(DSL.name("multiverseId"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>foreign_data.name</code>.
     */
    public final TableField<ForeignDataRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>foreign_data.text</code>.
     */
    public final TableField<ForeignDataRecord, String> TEXT = createField(DSL.name("text"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>foreign_data.type</code>.
     */
    public final TableField<ForeignDataRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>foreign_data.uuid</code>.
     */
    public final TableField<ForeignDataRecord, String> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>foreign_data</code> table reference
     */
    public ForeignData() {
        this(DSL.name("foreign_data"), null);
    }

    /**
     * Create an aliased <code>foreign_data</code> table reference
     */
    public ForeignData(String alias) {
        this(DSL.name(alias), FOREIGN_DATA);
    }

    /**
     * Create an aliased <code>foreign_data</code> table reference
     */
    public ForeignData(Name alias) {
        this(alias, FOREIGN_DATA);
    }

    private ForeignData(Name alias, Table<ForeignDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignData(Name alias, Table<ForeignDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignData(Table<O> child, ForeignKey<O, ForeignDataRecord> key) {
        super(child, key, FOREIGN_DATA);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<ForeignDataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FOREIGN_DATA;
    }

    @Override
    public UniqueKey<ForeignDataRecord> getPrimaryKey() {
        return Keys.PK_FOREIGN_DATA;
    }

    @Override
    public List<UniqueKey<ForeignDataRecord>> getKeys() {
        return Arrays.<UniqueKey<ForeignDataRecord>>asList(Keys.PK_FOREIGN_DATA);
    }

    @Override
    public List<ForeignKey<ForeignDataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ForeignDataRecord, ?>>asList(Keys.FK_FOREIGN_DATA_CARDS_1);
    }

    public Cards cards() {
        return new Cards(this, Keys.FK_FOREIGN_DATA_CARDS_1);
    }

    @Override
    public ForeignData as(String alias) {
        return new ForeignData(DSL.name(alias), this);
    }

    @Override
    public ForeignData as(Name alias) {
        return new ForeignData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignData rename(String name) {
        return new ForeignData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignData rename(Name name) {
        return new ForeignData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}