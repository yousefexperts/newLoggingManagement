/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables.records;


import com.experts.core.biller.statemachine.api.model.jooq.tables.TxAccount;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TxAccountRecord extends UpdatableRecordImpl<TxAccountRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = -734750136;

    /**
     * Setter for <code>public.tx_account.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tx_account.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tx_account.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tx_account.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TxAccount.TX_ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TxAccount.TX_ACCOUNT.USERNAME;
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
    public String component2() {
        return getUsername();
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
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxAccountRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxAccountRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxAccountRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxAccountRecord
     */
    public TxAccountRecord() {
        super(TxAccount.TX_ACCOUNT);
    }

    /**
     * Create a detached, initialised TxAccountRecord
     */
    public TxAccountRecord(Long id, String username) {
        super(TxAccount.TX_ACCOUNT);

        set(0, id);
        set(1, username);
    }
}