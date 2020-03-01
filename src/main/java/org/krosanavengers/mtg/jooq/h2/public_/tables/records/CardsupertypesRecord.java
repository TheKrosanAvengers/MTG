/*
 * This file is generated by jOOQ.
 */
package org.krosanavengers.mtg.jooq.h2.public_.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.krosanavengers.mtg.jooq.h2.public_.tables.Cardsupertypes;


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
public class CardsupertypesRecord extends UpdatableRecordImpl<CardsupertypesRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 1994796415;

    /**
     * Setter for <code>PUBLIC.CARDSUPERTYPES.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CARDSUPERTYPES.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CARDSUPERTYPES.SUPERTYPE</code>.
     */
    public void setSupertype(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CARDSUPERTYPES.SUPERTYPE</code>.
     */
    public Long getSupertype() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CARDSUPERTYPES.CARD</code>.
     */
    public void setCard(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CARDSUPERTYPES.CARD</code>.
     */
    public Long getCard() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Cardsupertypes.CARDSUPERTYPES.ID;
    }

    @Override
    public Field<Long> field2() {
        return Cardsupertypes.CARDSUPERTYPES.SUPERTYPE;
    }

    @Override
    public Field<Long> field3() {
        return Cardsupertypes.CARDSUPERTYPES.CARD;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getSupertype();
    }

    @Override
    public Long component3() {
        return getCard();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getSupertype();
    }

    @Override
    public Long value3() {
        return getCard();
    }

    @Override
    public CardsupertypesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CardsupertypesRecord value2(Long value) {
        setSupertype(value);
        return this;
    }

    @Override
    public CardsupertypesRecord value3(Long value) {
        setCard(value);
        return this;
    }

    @Override
    public CardsupertypesRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CardsupertypesRecord
     */
    public CardsupertypesRecord() {
        super(Cardsupertypes.CARDSUPERTYPES);
    }

    /**
     * Create a detached, initialised CardsupertypesRecord
     */
    public CardsupertypesRecord(Long id, Long supertype, Long card) {
        super(Cardsupertypes.CARDSUPERTYPES);

        set(0, id);
        set(1, supertype);
        set(2, card);
    }
}