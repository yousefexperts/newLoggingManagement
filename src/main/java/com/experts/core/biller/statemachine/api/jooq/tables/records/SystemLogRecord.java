/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.SystemLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemLogRecord extends UpdatableRecordImpl<SystemLogRecord> implements Record10<Long, Timestamp, String, Timestamp, String, String, Timestamp, String, String, Integer> {

    private static final long serialVersionUID = 1050174894;

    /**
     * Setter for <code>public.system_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.system_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.system_log.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.system_log.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.system_log.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.system_log.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.system_log.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.system_log.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.system_log.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.system_log.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.system_log.exception</code>.
     */
    public void setException(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.system_log.exception</code>.
     */
    public String getException() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.system_log.happend_date</code>.
     */
    public void setHappendDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.system_log.happend_date</code>.
     */
    public Timestamp getHappendDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>public.system_log.message</code>.
     */
    public void setMessage(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.system_log.message</code>.
     */
    public String getMessage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.system_log.name</code>.
     */
    public void setName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.system_log.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.system_log.version</code>.
     */
    public void setVersion(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.system_log.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Timestamp, String, Timestamp, String, String, Timestamp, String, String, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Timestamp, String, Timestamp, String, String, Timestamp, String, String, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SystemLog.SYSTEM_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SystemLog.SYSTEM_LOG.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemLog.SYSTEM_LOG.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SystemLog.SYSTEM_LOG.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SystemLog.SYSTEM_LOG.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SystemLog.SYSTEM_LOG.EXCEPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return SystemLog.SYSTEM_LOG.HAPPEND_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SystemLog.SYSTEM_LOG.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SystemLog.SYSTEM_LOG.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SystemLog.SYSTEM_LOG.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastmodifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getHappendDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastmodifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getHappendDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value6(String value) {
        setException(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value7(Timestamp value) {
        setHappendDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value8(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value9(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord value10(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemLogRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6, Timestamp value7, String value8, String value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemLogRecord
     */
    public SystemLogRecord() {
        super(SystemLog.SYSTEM_LOG);
    }

    /**
     * Create a detached, initialised SystemLogRecord
     */
    public SystemLogRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, String exception, Timestamp happendDate, String message, String name, Integer version) {
        super(SystemLog.SYSTEM_LOG);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, exception);
        set(6, happendDate);
        set(7, message);
        set(8, name);
        set(9, version);
    }
}