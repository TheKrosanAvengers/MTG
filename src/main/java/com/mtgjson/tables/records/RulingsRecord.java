/*
 * This file is generated by jOOQ.
 */
package com.mtgjson.tables.records;


import com.mtgjson.tables.Rulings;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class RulingsRecord extends UpdatableRecordImpl<RulingsRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 447894160;

    /**
     * Setter for <code>rulings.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rulings.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rulings.date</code>.
     */
    public void setDate(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rulings.date</code>.
     */
    public String getDate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rulings.text</code>.
     */
    public void setText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>rulings.text</code>.
     */
    public String getText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>rulings.uuid</code>.
     */
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rulings.uuid</code>.
     */
    public String getUuid() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Rulings.RULINGS.ID;
    }

    @Override
    public Field<String> field2() {
        return Rulings.RULINGS.DATE;
    }

    @Override
    public Field<String> field3() {
        return Rulings.RULINGS.TEXT;
    }

    @Override
    public Field<String> field4() {
        return Rulings.RULINGS.UUID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getText();
    }

    @Override
    public String component4() {
        return getUuid();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getText();
    }

    @Override
    public String value4() {
        return getUuid();
    }

    @Override
    public RulingsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RulingsRecord value2(String value) {
        setDate(value);
        return this;
    }

    @Override
    public RulingsRecord value3(String value) {
        setText(value);
        return this;
    }

    @Override
    public RulingsRecord value4(String value) {
        setUuid(value);
        return this;
    }

    @Override
    public RulingsRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RulingsRecord
     */
    public RulingsRecord() {
        super(Rulings.RULINGS);
    }

    /**
     * Create a detached, initialised RulingsRecord
     */
    public RulingsRecord(Integer id, String date, String text, String uuid) {
        super(Rulings.RULINGS);

        set(0, id);
        set(1, date);
        set(2, text);
        set(3, uuid);
    }
}
