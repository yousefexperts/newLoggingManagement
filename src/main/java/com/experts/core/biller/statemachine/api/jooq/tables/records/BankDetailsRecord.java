/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.BankDetails;

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
public class BankDetailsRecord extends UpdatableRecordImpl<BankDetailsRecord> implements Record12<Long, Timestamp, String, Timestamp, String, String, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = 1346116308;

    /**
     * Setter for <code>public.bank_details.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bank_details.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.bank_details.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bank_details.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.bank_details.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bank_details.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.bank_details.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bank_details.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.bank_details.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bank_details.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.bank_details.bank_address</code>.
     */
    public void setBankAddress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bank_details.bank_address</code>.
     */
    public String getBankAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.bank_details.bank_address_street</code>.
     */
    public void setBankAddressStreet(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bank_details.bank_address_street</code>.
     */
    public String getBankAddressStreet() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.bank_details.bank_code</code>.
     */
    public void setBankCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.bank_details.bank_code</code>.
     */
    public String getBankCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.bank_details.bank_email</code>.
     */
    public void setBankEmail(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.bank_details.bank_email</code>.
     */
    public String getBankEmail() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.bank_details.bank_name</code>.
     */
    public void setBankName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.bank_details.bank_name</code>.
     */
    public String getBankName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.bank_details.bank_phone</code>.
     */
    public void setBankPhone(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.bank_details.bank_phone</code>.
     */
    public String getBankPhone() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.bank_details.version</code>.
     */
    public void setVersion(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.bank_details.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(11);
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
    public Row12<Long, Timestamp, String, Timestamp, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Timestamp, String, Timestamp, String, String, String, String, String, String, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BankDetails.BANK_DETAILS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return BankDetails.BANK_DETAILS.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BankDetails.BANK_DETAILS.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return BankDetails.BANK_DETAILS.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BankDetails.BANK_DETAILS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BankDetails.BANK_DETAILS.BANK_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BankDetails.BANK_DETAILS.BANK_ADDRESS_STREET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return BankDetails.BANK_DETAILS.BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return BankDetails.BANK_DETAILS.BANK_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return BankDetails.BANK_DETAILS.BANK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BankDetails.BANK_DETAILS.BANK_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return BankDetails.BANK_DETAILS.VERSION;
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
        return getBankAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBankAddressStreet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBankEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBankPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
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
        return getBankAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBankAddressStreet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBankEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBankPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value6(String value) {
        setBankAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value7(String value) {
        setBankAddressStreet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value8(String value) {
        setBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value9(String value) {
        setBankEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value10(String value) {
        setBankName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value11(String value) {
        setBankPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord value12(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetailsRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Integer value12) {
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
     * Create a detached BankDetailsRecord
     */
    public BankDetailsRecord() {
        super(BankDetails.BANK_DETAILS);
    }

    /**
     * Create a detached, initialised BankDetailsRecord
     */
    public BankDetailsRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, String bankAddress, String bankAddressStreet, String bankCode, String bankEmail, String bankName, String bankPhone, Integer version) {
        super(BankDetails.BANK_DETAILS);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, bankAddress);
        set(6, bankAddressStreet);
        set(7, bankCode);
        set(8, bankEmail);
        set(9, bankName);
        set(10, bankPhone);
        set(11, version);
    }
}
