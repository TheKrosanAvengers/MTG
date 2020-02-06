/*
 * This file is generated by jOOQ.
 */
package com.mtgjson.tables.records;


import com.mtgjson.tables.Prices;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PricesRecord extends UpdatableRecordImpl<PricesRecord> implements Record5<Integer, String, Float, String, String> {

    private static final long serialVersionUID = -273804905;

    /**
     * Setter for <code>prices.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>prices.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>prices.date</code>.
     */
    public void setDate(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>prices.date</code>.
     */
    public String getDate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>prices.price</code>.
     */
    public void setPrice(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>prices.price</code>.
     */
    public Float getPrice() {
        return (Float) get(2);
    }

    /**
     * Setter for <code>prices.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>prices.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>prices.uuid</code>.
     */
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>prices.uuid</code>.
     */
    public String getUuid() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Float, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Float, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Prices.PRICES.ID;
    }

    @Override
    public Field<String> field2() {
        return Prices.PRICES.DATE;
    }

    @Override
    public Field<Float> field3() {
        return Prices.PRICES.PRICE;
    }

    @Override
    public Field<String> field4() {
        return Prices.PRICES.TYPE;
    }

    @Override
    public Field<String> field5() {
        return Prices.PRICES.UUID;
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
    public Float component3() {
        return getPrice();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
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
    public Float value3() {
        return getPrice();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getUuid();
    }

    @Override
    public PricesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PricesRecord value2(String value) {
        setDate(value);
        return this;
    }

    @Override
    public PricesRecord value3(Float value) {
        setPrice(value);
        return this;
    }

    @Override
    public PricesRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public PricesRecord value5(String value) {
        setUuid(value);
        return this;
    }

    @Override
    public PricesRecord values(Integer value1, String value2, Float value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PricesRecord
     */
    public PricesRecord() {
        super(Prices.PRICES);
    }

    /**
     * Create a detached, initialised PricesRecord
     */
    public PricesRecord(Integer id, String date, Float price, String type, String uuid) {
        super(Prices.PRICES);

        set(0, id);
        set(1, date);
        set(2, price);
        set(3, type);
        set(4, uuid);
    }
}