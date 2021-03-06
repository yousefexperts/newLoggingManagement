/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.MuleEsbIntegration;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class MuleEsbIntegrationRecord extends UpdatableRecordImpl<MuleEsbIntegrationRecord> implements Record8<Long, Timestamp, String, Timestamp, String, String, String, Integer> {

    private static final long serialVersionUID = 1586636801;

    /**
     * Setter for <code>public.mule_esb_integration.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mule_esb_integration.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.mule_esb_integration.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.mule_esb_integration.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.mule_esb_integration.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.mule_esb_integration.mule_billpull</code>.
     */
    public void setMuleBillpull(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.mule_billpull</code>.
     */
    public String getMuleBillpull() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.mule_esb_integration.mule_payment_notification</code>.
     */
    public void setMulePaymentNotification(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.mule_payment_notification</code>.
     */
    public String getMulePaymentNotification() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.mule_esb_integration.version</code>.
     */
    public void setVersion(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.mule_esb_integration.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Timestamp, String, Timestamp, String, String, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Timestamp, String, Timestamp, String, String, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.MULE_BILLPULL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.MULE_PAYMENT_NOTIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return MuleEsbIntegration.MULE_ESB_INTEGRATION.VERSION;
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
        return getMuleBillpull();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMulePaymentNotification();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
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
        return getMuleBillpull();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMulePaymentNotification();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value6(String value) {
        setMuleBillpull(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value7(String value) {
        setMulePaymentNotification(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord value8(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuleEsbIntegrationRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6, String value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MuleEsbIntegrationRecord
     */
    public MuleEsbIntegrationRecord() {
        super(MuleEsbIntegration.MULE_ESB_INTEGRATION);
    }

    /**
     * Create a detached, initialised MuleEsbIntegrationRecord
     */
    public MuleEsbIntegrationRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, String muleBillpull, String mulePaymentNotification, Integer version) {
        super(MuleEsbIntegration.MULE_ESB_INTEGRATION);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, muleBillpull);
        set(6, mulePaymentNotification);
        set(7, version);
    }
}
