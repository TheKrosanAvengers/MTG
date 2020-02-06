/*
 * This file is generated by jOOQ.
 */
package com.cards.public_.tables;


import com.cards.public_.Indexes;
import com.cards.public_.Keys;
import com.cards.public_.Public;
import com.cards.public_.tables.records.CardstaticabilitiesRecord;

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
public class Cardstaticabilities extends TableImpl<CardstaticabilitiesRecord> {

    private static final long serialVersionUID = -657511506;

    /**
     * The reference instance of <code>PUBLIC.CARDSTATICABILITIES</code>
     */
    public static final Cardstaticabilities CARDSTATICABILITIES = new Cardstaticabilities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardstaticabilitiesRecord> getRecordType() {
        return CardstaticabilitiesRecord.class;
    }

    /**
     * The column <code>PUBLIC.CARDSTATICABILITIES.ID</code>.
     */
    public final TableField<CardstaticabilitiesRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.CARDSTATICABILITIES.STATICABILITY</code>.
     */
    public final TableField<CardstaticabilitiesRecord, Long> STATICABILITY = createField(DSL.name("STATICABILITY"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.CARDSTATICABILITIES.CARD</code>.
     */
    public final TableField<CardstaticabilitiesRecord, Long> CARD = createField(DSL.name("CARD"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>PUBLIC.CARDSTATICABILITIES</code> table reference
     */
    public Cardstaticabilities() {
        this(DSL.name("CARDSTATICABILITIES"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CARDSTATICABILITIES</code> table reference
     */
    public Cardstaticabilities(String alias) {
        this(DSL.name(alias), CARDSTATICABILITIES);
    }

    /**
     * Create an aliased <code>PUBLIC.CARDSTATICABILITIES</code> table reference
     */
    public Cardstaticabilities(Name alias) {
        this(alias, CARDSTATICABILITIES);
    }

    private Cardstaticabilities(Name alias, Table<CardstaticabilitiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cardstaticabilities(Name alias, Table<CardstaticabilitiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Cardstaticabilities(Table<O> child, ForeignKey<O, CardstaticabilitiesRecord> key) {
        super(child, key, CARDSTATICABILITIES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_3F, Indexes.CONSTRAINT_INDEX_3FA, Indexes.PRIMARY_KEY_3F);
    }

    @Override
    public Identity<CardstaticabilitiesRecord, Long> getIdentity() {
        return Keys.IDENTITY_CARDSTATICABILITIES;
    }

    @Override
    public UniqueKey<CardstaticabilitiesRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3F;
    }

    @Override
    public List<UniqueKey<CardstaticabilitiesRecord>> getKeys() {
        return Arrays.<UniqueKey<CardstaticabilitiesRecord>>asList(Keys.CONSTRAINT_3F);
    }

    @Override
    public List<ForeignKey<CardstaticabilitiesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CardstaticabilitiesRecord, ?>>asList(Keys.CONSTRAINT_3FA, Keys.CONSTRAINT_3FA3);
    }

    public Staticabilities staticabilities() {
        return new Staticabilities(this, Keys.CONSTRAINT_3FA);
    }

    public Cards cards() {
        return new Cards(this, Keys.CONSTRAINT_3FA3);
    }

    @Override
    public Cardstaticabilities as(String alias) {
        return new Cardstaticabilities(DSL.name(alias), this);
    }

    @Override
    public Cardstaticabilities as(Name alias) {
        return new Cardstaticabilities(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cardstaticabilities rename(String name) {
        return new Cardstaticabilities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Cardstaticabilities rename(Name name) {
        return new Cardstaticabilities(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}