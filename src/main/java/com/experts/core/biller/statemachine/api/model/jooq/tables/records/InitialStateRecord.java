/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables.records;


import com.experts.core.biller.statemachine.api.model.jooq.tables.InitialState;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class InitialStateRecord extends UpdatableRecordImpl<InitialStateRecord> implements Record15<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -2049511656;

    /**
     * Setter for <code>public.initial_state.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.initial_state.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.initial_state.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.initial_state.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.initial_state.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.initial_state.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.initial_state.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.initial_state.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.initial_state.bank_addrs</code>.
     */
    public void setBankAddrs(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.initial_state.bank_addrs</code>.
     */
    public String getBankAddrs() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.initial_state.bank_code</code>.
     */
    public void setBankCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.initial_state.bank_code</code>.
     */
    public String getBankCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.initial_state.bank_id</code>.
     */
    public void setBankId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.initial_state.bank_id</code>.
     */
    public String getBankId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.initial_state.bank_name</code>.
     */
    public void setBankName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.initial_state.bank_name</code>.
     */
    public String getBankName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.initial_state.bill_code</code>.
     */
    public void setBillCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.initial_state.bill_code</code>.
     */
    public String getBillCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.initial_state.billname</code>.
     */
    public void setBillname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.initial_state.billname</code>.
     */
    public String getBillname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.initial_state.biller_address</code>.
     */
    public void setBillerAddress(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.initial_state.biller_address</code>.
     */
    public String getBillerAddress() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.initial_state.biller_code</code>.
     */
    public void setBillerCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.initial_state.biller_code</code>.
     */
    public String getBillerCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.initial_state.biller_name</code>.
     */
    public void setBillerName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.initial_state.biller_name</code>.
     */
    public String getBillerName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.initial_state.client_id</code>.
     */
    public void setClientId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.initial_state.client_id</code>.
     */
    public String getClientId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.initial_state.service_used</code>.
     */
    public void setServiceUsed(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.initial_state.service_used</code>.
     */
    public String getServiceUsed() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return InitialState.INITIAL_STATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return InitialState.INITIAL_STATE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return InitialState.INITIAL_STATE.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InitialState.INITIAL_STATE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InitialState.INITIAL_STATE.BANK_ADDRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InitialState.INITIAL_STATE.BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InitialState.INITIAL_STATE.BANK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return InitialState.INITIAL_STATE.BANK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return InitialState.INITIAL_STATE.BILL_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return InitialState.INITIAL_STATE.BILLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return InitialState.INITIAL_STATE.BILLER_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return InitialState.INITIAL_STATE.BILLER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return InitialState.INITIAL_STATE.BILLER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return InitialState.INITIAL_STATE.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return InitialState.INITIAL_STATE.SERVICE_USED;
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
        return getBankAddrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBankId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBillCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBillname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBillerAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getBillerCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getBillerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getServiceUsed();
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
        return getBankAddrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBankId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBillCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBillname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBillerAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getBillerCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBillerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getServiceUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value3(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value5(String value) {
        setBankAddrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value6(String value) {
        setBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value7(String value) {
        setBankId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value8(String value) {
        setBankName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value9(String value) {
        setBillCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value10(String value) {
        setBillname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value11(String value) {
        setBillerAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value12(String value) {
        setBillerCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value13(String value) {
        setBillerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value14(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord value15(String value) {
        setServiceUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialStateRecord values(Long value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15) {
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
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InitialStateRecord
     */
    public InitialStateRecord() {
        super(InitialState.INITIAL_STATE);
    }

    /**
     * Create a detached, initialised InitialStateRecord
     */
    public InitialStateRecord(Long id, Timestamp createddate, Timestamp modifieddate, String username, String bankAddrs, String bankCode, String bankId, String bankName, String billCode, String billname, String billerAddress, String billerCode, String billerName, String clientId, String serviceUsed) {
        super(InitialState.INITIAL_STATE);

        set(0, id);
        set(1, createddate);
        set(2, modifieddate);
        set(3, username);
        set(4, bankAddrs);
        set(5, bankCode);
        set(6, bankId);
        set(7, bankName);
        set(8, billCode);
        set(9, billname);
        set(10, billerAddress);
        set(11, billerCode);
        set(12, billerName);
        set(13, clientId);
        set(14, serviceUsed);
    }
}
