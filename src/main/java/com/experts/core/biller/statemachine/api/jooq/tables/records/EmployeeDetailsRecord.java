/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.EmployeeDetails;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class EmployeeDetailsRecord extends UpdatableRecordImpl<EmployeeDetailsRecord> implements Record13<Long, Timestamp, String, Timestamp, String, String, String, Boolean, Boolean, Boolean, String, String, Integer> {

    private static final long serialVersionUID = 1931194918;

    /**
     * Setter for <code>public.employee_details.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employee_details.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.employee_details.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employee_details.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.employee_details.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employee_details.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employee_details.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employee_details.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.employee_details.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employee_details.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.employee_details.first_name</code>.
     */
    public void setFirstName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.employee_details.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.employee_details.full_name</code>.
     */
    public void setFullName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.employee_details.full_name</code>.
     */
    public String getFullName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.employee_details.blocked</code>.
     */
    public void setBlocked(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.employee_details.blocked</code>.
     */
    public Boolean getBlocked() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.employee_details.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.employee_details.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.employee_details.password_expired</code>.
     */
    public void setPasswordExpired(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.employee_details.password_expired</code>.
     */
    public Boolean getPasswordExpired() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.employee_details.second_name</code>.
     */
    public void setSecondName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.employee_details.second_name</code>.
     */
    public String getSecondName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.employee_details.third_name</code>.
     */
    public void setThirdName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.employee_details.third_name</code>.
     */
    public String getThirdName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.employee_details.version</code>.
     */
    public void setVersion(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.employee_details.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Timestamp, String, Timestamp, String, String, String, Boolean, Boolean, Boolean, String, String, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Timestamp, String, Timestamp, String, String, String, Boolean, Boolean, Boolean, String, String, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EmployeeDetails.EMPLOYEE_DETAILS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return EmployeeDetails.EMPLOYEE_DETAILS.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployeeDetails.EMPLOYEE_DETAILS.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return EmployeeDetails.EMPLOYEE_DETAILS.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmployeeDetails.EMPLOYEE_DETAILS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmployeeDetails.EMPLOYEE_DETAILS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EmployeeDetails.EMPLOYEE_DETAILS.FULL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return EmployeeDetails.EMPLOYEE_DETAILS.BLOCKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return EmployeeDetails.EMPLOYEE_DETAILS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return EmployeeDetails.EMPLOYEE_DETAILS.PASSWORD_EXPIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EmployeeDetails.EMPLOYEE_DETAILS.SECOND_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return EmployeeDetails.EMPLOYEE_DETAILS.THIRD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return EmployeeDetails.EMPLOYEE_DETAILS.VERSION;
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
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getBlocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getPasswordExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSecondName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getThirdName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
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
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getBlocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getPasswordExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSecondName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getThirdName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value6(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value7(String value) {
        setFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value8(Boolean value) {
        setBlocked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value9(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value10(Boolean value) {
        setPasswordExpired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value11(String value) {
        setSecondName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value12(String value) {
        setThirdName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord value13(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailsRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6, String value7, Boolean value8, Boolean value9, Boolean value10, String value11, String value12, Integer value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeDetailsRecord
     */
    public EmployeeDetailsRecord() {
        super(EmployeeDetails.EMPLOYEE_DETAILS);
    }

    /**
     * Create a detached, initialised EmployeeDetailsRecord
     */
    public EmployeeDetailsRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, String firstName, String fullName, Boolean blocked, Boolean deleted, Boolean passwordExpired, String secondName, String thirdName, Integer version) {
        super(EmployeeDetails.EMPLOYEE_DETAILS);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, firstName);
        set(6, fullName);
        set(7, blocked);
        set(8, deleted);
        set(9, passwordExpired);
        set(10, secondName);
        set(11, thirdName);
        set(12, version);
    }
}