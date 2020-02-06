/*
 * This file is generated by jOOQ.
 */
package com.cards.public_.tables;


import com.cards.public_.Indexes;
import com.cards.public_.Keys;
import com.cards.public_.Public;
import com.cards.public_.tables.records.CardnonstaticabilitiesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Cardnonstaticabilities extends TableImpl<CardnonstaticabilitiesRecord> {

    private static final long serialVersionUID = 1677427621;

    /**
     * The reference instance of <code>PUBLIC.CARDNONSTATICABILITIES</code>
     */
    public static final Cardnonstaticabilities CARDNONSTATICABILITIES = new Cardnonstaticabilities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardnonstaticabilitiesRecord> getRecordType() {
        return CardnonstaticabilitiesRecord.class;
    }

    /**
     * The column <code>PUBLIC.CARDNONSTATICABILITIES.ID</code>.
     */
    public final TableField<CardnonstaticabilitiesRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.CARDNONSTATICABILITIES.NONSTATICABILITY</code>.
     */
    public final TableField<CardnonstaticabilitiesRecord, Long> NONSTATICABILITY = createField(DSL.name("NONSTATICABILITY"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.CARDNONSTATICABILITIES.CARD</code>.
     */
    public final TableField<CardnonstaticabilitiesRecord, Long> CARD = createField(DSL.name("CARD"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.CARDNONSTATICABILITIES.COST</code>.
     */
    public final TableField<CardnonstaticabilitiesRecord, String> COST = createField(DSL.name("COST"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>PUBLIC.CARDNONSTATICABILITIES</code> table reference
     */
    public Cardnonstaticabilities() {
        this(DSL.name("CARDNONSTATICABILITIES"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CARDNONSTATICABILITIES</code> table reference
     */
    public Cardnonstaticabilities(String alias) {
        this(DSL.name(alias), CARDNONSTATICABILITIES);
    }

    /**
     * Create an aliased <code>PUBLIC.CARDNONSTATICABILITIES</code> table reference
     */
    public Cardnonstaticabilities(Name alias) {
        this(alias, CARDNONSTATICABILITIES);
    }

    private Cardnonstaticabilities(Name alias, Table<CardnonstaticabilitiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cardnonstaticabilities(Name alias, Table<CardnonstaticabilitiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Cardnonstaticabilities(Table<O> child, ForeignKey<O, CardnonstaticabilitiesRecord> key) {
        super(child, key, CARDNONSTATICABILITIES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_8, Indexes.CONSTRAINT_INDEX_80, Indexes.PRIMARY_KEY_8);
    }

    @Override
    public Identity<CardnonstaticabilitiesRecord, Long> getIdentity() {
        return Keys.IDENTITY_CARDNONSTATICABILITIES;
    }

    @Override
    public UniqueKey<CardnonstaticabilitiesRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8;
    }

    @Override
    public List<UniqueKey<CardnonstaticabilitiesRecord>> getKeys() {
        return Arrays.<UniqueKey<CardnonstaticabilitiesRecord>>asList(Keys.CONSTRAINT_8);
    }

    @Override
    public List<ForeignKey<CardnonstaticabilitiesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CardnonstaticabilitiesRecord, ?>>asList(Keys.CONSTRAINT_80, Keys.CONSTRAINT_801);
    }

    public Nonstaticabilities nonstaticabilities() {
        return new Nonstaticabilities(this, Keys.CONSTRAINT_80);
    }

    public Cards cards() {
        return new Cards(this, Keys.CONSTRAINT_801);
    }

    @Override
    public Cardnonstaticabilities as(String alias) {
        return new Cardnonstaticabilities(DSL.name(alias), this);
    }

    @Override
    public Cardnonstaticabilities as(Name alias) {
        return new Cardnonstaticabilities(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cardnonstaticabilities rename(String name) {
        return new Cardnonstaticabilities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Cardnonstaticabilities rename(Name name) {
        return new Cardnonstaticabilities(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
