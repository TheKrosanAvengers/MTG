/*
 * This file is generated by jOOQ.
 */
package com.cards.public_.tables.records;


import com.cards.public_.tables.Cardstaticabilities;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CardstaticabilitiesRecord extends UpdatableRecordImpl<CardstaticabilitiesRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = -602901563;

    /**
     * Setter for <code>PUBLIC.CARDSTATICABILITIES.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CARDSTATICABILITIES.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CARDSTATICABILITIES.STATICABILITY</code>.
     */
    public void setStaticability(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CARDSTATICABILITIES.STATICABILITY</code>.
     */
    public Long getStaticability() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CARDSTATICABILITIES.CARD</code>.
     */
    public void setCard(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CARDSTATICABILITIES.CARD</code>.
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
        return Cardstaticabilities.CARDSTATICABILITIES.ID;
    }

    @Override
    public Field<Long> field2() {
        return Cardstaticabilities.CARDSTATICABILITIES.STATICABILITY;
    }

    @Override
    public Field<Long> field3() {
        return Cardstaticabilities.CARDSTATICABILITIES.CARD;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getStaticability();
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
        return getStaticability();
    }

    @Override
    public Long value3() {
        return getCard();
    }

    @Override
    public CardstaticabilitiesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CardstaticabilitiesRecord value2(Long value) {
        setStaticability(value);
        return this;
    }

    @Override
    public CardstaticabilitiesRecord value3(Long value) {
        setCard(value);
        return this;
    }

    @Override
    public CardstaticabilitiesRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CardstaticabilitiesRecord
     */
    public CardstaticabilitiesRecord() {
        super(Cardstaticabilities.CARDSTATICABILITIES);
    }

    /**
     * Create a detached, initialised CardstaticabilitiesRecord
     */
    public CardstaticabilitiesRecord(Long id, Long staticability, Long card) {
        super(Cardstaticabilities.CARDSTATICABILITIES);

        set(0, id);
        set(1, staticability);
        set(2, card);
    }
}
