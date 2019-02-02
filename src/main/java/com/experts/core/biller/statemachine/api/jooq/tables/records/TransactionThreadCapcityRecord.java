/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.TransactionThreadCapcity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class TransactionThreadCapcityRecord extends UpdatableRecordImpl<TransactionThreadCapcityRecord> implements Record9<Long, Timestamp, String, Timestamp, String, Boolean, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1234783267;

    /**
     * Setter for <code>public.transaction_thread_capcity.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.high_priority</code>.
     */
    public void setHighPriority(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.high_priority</code>.
     */
    public Boolean getHighPriority() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.max</code>.
     */
    public void setMax(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.max</code>.
     */
    public Integer getMax() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.min</code>.
     */
    public void setMin(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.min</code>.
     */
    public Integer getMin() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.transaction_thread_capcity.version</code>.
     */
    public void setVersion(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.transaction_thread_capcity.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Timestamp, String, Timestamp, String, Boolean, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Timestamp, String, Timestamp, String, Boolean, Integer, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.HIGH_PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY.VERSION;
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
    public Boolean component6() {
        return getHighPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
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
    public Boolean value6() {
        return getHighPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value6(Boolean value) {
        setHighPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value7(Integer value) {
        setMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value8(Integer value) {
        setMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord value9(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcityRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, Boolean value6, Integer value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionThreadCapcityRecord
     */
    public TransactionThreadCapcityRecord() {
        super(TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY);
    }

    /**
     * Create a detached, initialised TransactionThreadCapcityRecord
     */
    public TransactionThreadCapcityRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, Boolean highPriority, Integer max, Integer min, Integer version) {
        super(TransactionThreadCapcity.TRANSACTION_THREAD_CAPCITY);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, highPriority);
        set(6, max);
        set(7, min);
        set(8, version);
    }
}