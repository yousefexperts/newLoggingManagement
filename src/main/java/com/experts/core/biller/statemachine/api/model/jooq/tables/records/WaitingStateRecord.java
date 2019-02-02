/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables.records;


import com.experts.core.biller.statemachine.api.model.jooq.tables.WaitingState;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class WaitingStateRecord extends UpdatableRecordImpl<WaitingStateRecord> implements Record12<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Long> {

    private static final long serialVersionUID = -332513825;

    /**
     * Setter for <code>public.waiting_state.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.waiting_state.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.waiting_state.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.waiting_state.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.waiting_state.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.waiting_state.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.waiting_state.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.waiting_state.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.waiting_state.bank_code</code>.
     */
    public void setBankCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.waiting_state.bank_code</code>.
     */
    public String getBankCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.waiting_state.bill_code</code>.
     */
    public void setBillCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.waiting_state.bill_code</code>.
     */
    public String getBillCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.waiting_state.bill_name</code>.
     */
    public void setBillName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.waiting_state.bill_name</code>.
     */
    public String getBillName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.waiting_state.biller_code</code>.
     */
    public void setBillerCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.waiting_state.biller_code</code>.
     */
    public String getBillerCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.waiting_state.period</code>.
     */
    public void setPeriod(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.waiting_state.period</code>.
     */
    public String getPeriod() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.waiting_state.transaction_id</code>.
     */
    public void setTransactionId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.waiting_state.transaction_id</code>.
     */
    public String getTransactionId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.waiting_state.waiting_ops_name</code>.
     */
    public void setWaitingOpsName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.waiting_state.waiting_ops_name</code>.
     */
    public String getWaitingOpsName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.waiting_state.process_id</code>.
     */
    public void setProcessId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.waiting_state.process_id</code>.
     */
    public Long getProcessId() {
        return (Long) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return WaitingState.WAITING_STATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return WaitingState.WAITING_STATE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return WaitingState.WAITING_STATE.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WaitingState.WAITING_STATE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WaitingState.WAITING_STATE.BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WaitingState.WAITING_STATE.BILL_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return WaitingState.WAITING_STATE.BILL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return WaitingState.WAITING_STATE.BILLER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return WaitingState.WAITING_STATE.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return WaitingState.WAITING_STATE.TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return WaitingState.WAITING_STATE.WAITING_OPS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return WaitingState.WAITING_STATE.PROCESS_ID;
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
    public Timestamp component3() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBillCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBillName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBillerCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getWaitingOpsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getProcessId();
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
    public Timestamp value3() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBillCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBillName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBillerCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getWaitingOpsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getProcessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value3(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value5(String value) {
        setBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value6(String value) {
        setBillCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value7(String value) {
        setBillName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value8(String value) {
        setBillerCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value9(String value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value10(String value) {
        setTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value11(String value) {
        setWaitingOpsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord value12(Long value) {
        setProcessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingStateRecord values(Long value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Long value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WaitingStateRecord
     */
    public WaitingStateRecord() {
        super(WaitingState.WAITING_STATE);
    }

    /**
     * Create a detached, initialised WaitingStateRecord
     */
    public WaitingStateRecord(Long id, Timestamp createddate, Timestamp modifieddate, String username, String bankCode, String billCode, String billName, String billerCode, String period, String transactionId, String waitingOpsName, Long processId) {
        super(WaitingState.WAITING_STATE);

        set(0, id);
        set(1, createddate);
        set(2, modifieddate);
        set(3, username);
        set(4, bankCode);
        set(5, billCode);
        set(6, billName);
        set(7, billerCode);
        set(8, period);
        set(9, transactionId);
        set(10, waitingOpsName);
        set(11, processId);
    }
}
