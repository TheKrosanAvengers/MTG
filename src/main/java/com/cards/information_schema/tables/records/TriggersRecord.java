/*
 * This file is generated by jOOQ.
 */
package com.cards.information_schema.tables.records;


import com.cards.information_schema.tables.Triggers;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


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
public class TriggersRecord extends TableRecordImpl<TriggersRecord> implements Record14<String, String, String, String, String, String, String, Boolean, String, Integer, Boolean, String, String, Integer> {

    private static final long serialVersionUID = -2090207469;

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_CATALOG</code>.
     */
    public void setTriggerCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_CATALOG</code>.
     */
    public String getTriggerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_SCHEMA</code>.
     */
    public void setTriggerSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_SCHEMA</code>.
     */
    public String getTriggerSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_NAME</code>.
     */
    public void setTriggerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_NAME</code>.
     */
    public String getTriggerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_TYPE</code>.
     */
    public void setTriggerType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_TYPE</code>.
     */
    public String getTriggerType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.BEFORE</code>.
     */
    public void setBefore(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.BEFORE</code>.
     */
    public Boolean getBefore() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.JAVA_CLASS</code>.
     */
    public void setJavaClass(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.JAVA_CLASS</code>.
     */
    public String getJavaClass() {
        return (String) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.QUEUE_SIZE</code>.
     */
    public void setQueueSize(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.QUEUE_SIZE</code>.
     */
    public Integer getQueueSize() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.NO_WAIT</code>.
     */
    public void setNoWait(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.NO_WAIT</code>.
     */
    public Boolean getNoWait() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(11);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.SQL</code>.
     */
    public void setSql(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.SQL</code>.
     */
    public String getSql() {
        return (String) get(12);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TRIGGERS.ID</code>.
     */
    public void setId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TRIGGERS.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, String, String, String, Boolean, String, Integer, Boolean, String, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, String, String, String, String, String, Boolean, String, Integer, Boolean, String, String, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Triggers.TRIGGERS.TRIGGER_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Triggers.TRIGGERS.TRIGGER_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Triggers.TRIGGERS.TRIGGER_NAME;
    }

    @Override
    public Field<String> field4() {
        return Triggers.TRIGGERS.TRIGGER_TYPE;
    }

    @Override
    public Field<String> field5() {
        return Triggers.TRIGGERS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return Triggers.TRIGGERS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return Triggers.TRIGGERS.TABLE_NAME;
    }

    @Override
    public Field<Boolean> field8() {
        return Triggers.TRIGGERS.BEFORE;
    }

    @Override
    public Field<String> field9() {
        return Triggers.TRIGGERS.JAVA_CLASS;
    }

    @Override
    public Field<Integer> field10() {
        return Triggers.TRIGGERS.QUEUE_SIZE;
    }

    @Override
    public Field<Boolean> field11() {
        return Triggers.TRIGGERS.NO_WAIT;
    }

    @Override
    public Field<String> field12() {
        return Triggers.TRIGGERS.REMARKS;
    }

    @Override
    public Field<String> field13() {
        return Triggers.TRIGGERS.SQL;
    }

    @Override
    public Field<Integer> field14() {
        return Triggers.TRIGGERS.ID;
    }

    @Override
    public String component1() {
        return getTriggerCatalog();
    }

    @Override
    public String component2() {
        return getTriggerSchema();
    }

    @Override
    public String component3() {
        return getTriggerName();
    }

    @Override
    public String component4() {
        return getTriggerType();
    }

    @Override
    public String component5() {
        return getTableCatalog();
    }

    @Override
    public String component6() {
        return getTableSchema();
    }

    @Override
    public String component7() {
        return getTableName();
    }

    @Override
    public Boolean component8() {
        return getBefore();
    }

    @Override
    public String component9() {
        return getJavaClass();
    }

    @Override
    public Integer component10() {
        return getQueueSize();
    }

    @Override
    public Boolean component11() {
        return getNoWait();
    }

    @Override
    public String component12() {
        return getRemarks();
    }

    @Override
    public String component13() {
        return getSql();
    }

    @Override
    public Integer component14() {
        return getId();
    }

    @Override
    public String value1() {
        return getTriggerCatalog();
    }

    @Override
    public String value2() {
        return getTriggerSchema();
    }

    @Override
    public String value3() {
        return getTriggerName();
    }

    @Override
    public String value4() {
        return getTriggerType();
    }

    @Override
    public String value5() {
        return getTableCatalog();
    }

    @Override
    public String value6() {
        return getTableSchema();
    }

    @Override
    public String value7() {
        return getTableName();
    }

    @Override
    public Boolean value8() {
        return getBefore();
    }

    @Override
    public String value9() {
        return getJavaClass();
    }

    @Override
    public Integer value10() {
        return getQueueSize();
    }

    @Override
    public Boolean value11() {
        return getNoWait();
    }

    @Override
    public String value12() {
        return getRemarks();
    }

    @Override
    public String value13() {
        return getSql();
    }

    @Override
    public Integer value14() {
        return getId();
    }

    @Override
    public TriggersRecord value1(String value) {
        setTriggerCatalog(value);
        return this;
    }

    @Override
    public TriggersRecord value2(String value) {
        setTriggerSchema(value);
        return this;
    }

    @Override
    public TriggersRecord value3(String value) {
        setTriggerName(value);
        return this;
    }

    @Override
    public TriggersRecord value4(String value) {
        setTriggerType(value);
        return this;
    }

    @Override
    public TriggersRecord value5(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public TriggersRecord value6(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public TriggersRecord value7(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TriggersRecord value8(Boolean value) {
        setBefore(value);
        return this;
    }

    @Override
    public TriggersRecord value9(String value) {
        setJavaClass(value);
        return this;
    }

    @Override
    public TriggersRecord value10(Integer value) {
        setQueueSize(value);
        return this;
    }

    @Override
    public TriggersRecord value11(Boolean value) {
        setNoWait(value);
        return this;
    }

    @Override
    public TriggersRecord value12(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public TriggersRecord value13(String value) {
        setSql(value);
        return this;
    }

    @Override
    public TriggersRecord value14(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TriggersRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Boolean value8, String value9, Integer value10, Boolean value11, String value12, String value13, Integer value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TriggersRecord
     */
    public TriggersRecord() {
        super(Triggers.TRIGGERS);
    }

    /**
     * Create a detached, initialised TriggersRecord
     */
    public TriggersRecord(String triggerCatalog, String triggerSchema, String triggerName, String triggerType, String tableCatalog, String tableSchema, String tableName, Boolean before, String javaClass, Integer queueSize, Boolean noWait, String remarks, String sql, Integer id) {
        super(Triggers.TRIGGERS);

        set(0, triggerCatalog);
        set(1, triggerSchema);
        set(2, triggerName);
        set(3, triggerType);
        set(4, tableCatalog);
        set(5, tableSchema);
        set(6, tableName);
        set(7, before);
        set(8, javaClass);
        set(9, queueSize);
        set(10, noWait);
        set(11, remarks);
        set(12, sql);
        set(13, id);
    }
}
