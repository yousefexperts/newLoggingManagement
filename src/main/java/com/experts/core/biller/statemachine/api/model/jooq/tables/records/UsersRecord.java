/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables.records;


import com.experts.core.biller.statemachine.api.model.jooq.tables.Users;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record6<Long, Boolean, Boolean, Boolean, String, String> {

    private static final long serialVersionUID = -249588660;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.users.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>public.users.expired</code>.
     */
    public void setExpired(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.expired</code>.
     */
    public Boolean getExpired() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.users.locked</code>.
     */
    public void setLocked(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.locked</code>.
     */
    public Boolean getLocked() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.users.password</code>.
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.password</code>.
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.users.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.name</code>.
     */
    public String getName() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Boolean, Boolean, Boolean, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Boolean, Boolean, Boolean, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Users.USERS.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Users.USERS.EXPIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Users.USERS.LOCKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Users.USERS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Users.USERS.NAME;
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
    public Boolean component2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getLocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
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
    public Boolean value2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getLocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(Boolean value) {
        setExpired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(Boolean value) {
        setLocked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Long value1, Boolean value2, Boolean value3, Boolean value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, Boolean enabled, Boolean expired, Boolean locked, String password, String name) {
        super(Users.USERS);

        set(0, id);
        set(1, enabled);
        set(2, expired);
        set(3, locked);
        set(4, password);
        set(5, name);
    }
}
