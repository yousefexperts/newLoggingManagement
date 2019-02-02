/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.BankServices;

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
public class BankServicesRecord extends UpdatableRecordImpl<BankServicesRecord> implements Record15<Long, Timestamp, String, Timestamp, String, String, String, byte[], Integer, Timestamp, String, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = 846128873;

    /**
     * Setter for <code>public.bank_services.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bank_services.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.bank_services.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bank_services.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.bank_services.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bank_services.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.bank_services.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bank_services.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.bank_services.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bank_services.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.bank_services.arabic_name</code>.
     */
    public void setArabicName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bank_services.arabic_name</code>.
     */
    public String getArabicName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.bank_services.arabic_short_name</code>.
     */
    public void setArabicShortName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bank_services.arabic_short_name</code>.
     */
    public String getArabicShortName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.bank_services.catogrey</code>.
     */
    public void setCatogrey(byte... value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.bank_services.catogrey</code>.
     */
    public byte[] getCatogrey() {
        return (byte[]) get(7);
    }

    /**
     * Setter for <code>public.bank_services.cost</code>.
     */
    public void setCost(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.bank_services.cost</code>.
     */
    public Integer getCost() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.bank_services.end_date</code>.
     */
    public void setEndDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.bank_services.end_date</code>.
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>public.bank_services.english_name</code>.
     */
    public void setEnglishName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.bank_services.english_name</code>.
     */
    public String getEnglishName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.bank_services.english_short_name</code>.
     */
    public void setEnglishShortName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.bank_services.english_short_name</code>.
     */
    public String getEnglishShortName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.bank_services.name</code>.
     */
    public void setName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.bank_services.name</code>.
     */
    public String getName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.bank_services.start_date</code>.
     */
    public void setStartDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.bank_services.start_date</code>.
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>public.bank_services.version</code>.
     */
    public void setVersion(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.bank_services.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(14);
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
    public Row15<Long, Timestamp, String, Timestamp, String, String, String, byte[], Integer, Timestamp, String, String, String, Timestamp, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Timestamp, String, Timestamp, String, String, String, byte[], Integer, Timestamp, String, String, String, Timestamp, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BankServices.BANK_SERVICES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return BankServices.BANK_SERVICES.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BankServices.BANK_SERVICES.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return BankServices.BANK_SERVICES.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BankServices.BANK_SERVICES.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BankServices.BANK_SERVICES.ARABIC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BankServices.BANK_SERVICES.ARABIC_SHORT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field8() {
        return BankServices.BANK_SERVICES.CATOGREY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return BankServices.BANK_SERVICES.COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return BankServices.BANK_SERVICES.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BankServices.BANK_SERVICES.ENGLISH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return BankServices.BANK_SERVICES.ENGLISH_SHORT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return BankServices.BANK_SERVICES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return BankServices.BANK_SERVICES.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return BankServices.BANK_SERVICES.VERSION;
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
        return getArabicName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getArabicShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component8() {
        return getCatogrey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getEnglishName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getEnglishShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
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
        return getArabicName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getArabicShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value8() {
        return getCatogrey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getEnglishName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getEnglishShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value6(String value) {
        setArabicName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value7(String value) {
        setArabicShortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value8(byte... value) {
        setCatogrey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value9(Integer value) {
        setCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value10(Timestamp value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value11(String value) {
        setEnglishName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value12(String value) {
        setEnglishShortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value13(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value14(Timestamp value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord value15(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServicesRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6, String value7, byte[] value8, Integer value9, Timestamp value10, String value11, String value12, String value13, Timestamp value14, Integer value15) {
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
     * Create a detached BankServicesRecord
     */
    public BankServicesRecord() {
        super(BankServices.BANK_SERVICES);
    }

    /**
     * Create a detached, initialised BankServicesRecord
     */
    public BankServicesRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, String arabicName, String arabicShortName, byte[] catogrey, Integer cost, Timestamp endDate, String englishName, String englishShortName, String name, Timestamp startDate, Integer version) {
        super(BankServices.BANK_SERVICES);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, arabicName);
        set(6, arabicShortName);
        set(7, catogrey);
        set(8, cost);
        set(9, endDate);
        set(10, englishName);
        set(11, englishShortName);
        set(12, name);
        set(13, startDate);
        set(14, version);
    }
}