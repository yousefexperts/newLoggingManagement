/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables.records;


import com.experts.core.biller.statemachine.api.model.jooq.tables.Tasks;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TasksRecord extends UpdatableRecordImpl<TasksRecord> implements Record7<Long, Timestamp, Timestamp, String, String, String, Integer> {

    private static final long serialVersionUID = 162973159;

    /**
     * Setter for <code>public.tasks.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tasks.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tasks.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tasks.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.tasks.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tasks.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.tasks.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tasks.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tasks.task_id</code>.
     */
    public void setTaskId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tasks.task_id</code>.
     */
    public String getTaskId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tasks.task_name</code>.
     */
    public void setTaskName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tasks.task_name</code>.
     */
    public String getTaskName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tasks.type</code>.
     */
    public void setType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tasks.type</code>.
     */
    public Integer getType() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Timestamp, Timestamp, String, String, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Timestamp, Timestamp, String, String, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Tasks.TASKS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Tasks.TASKS.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Tasks.TASKS.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tasks.TASKS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tasks.TASKS.TASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Tasks.TASKS.TASK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Tasks.TASKS.TYPE;
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
        return getTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTaskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getType();
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
        return getTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTaskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value3(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value5(String value) {
        setTaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value6(String value) {
        setTaskName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord value7(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksRecord values(Long value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TasksRecord
     */
    public TasksRecord() {
        super(Tasks.TASKS);
    }

    /**
     * Create a detached, initialised TasksRecord
     */
    public TasksRecord(Long id, Timestamp createddate, Timestamp modifieddate, String username, String taskId, String taskName, Integer type) {
        super(Tasks.TASKS);

        set(0, id);
        set(1, createddate);
        set(2, modifieddate);
        set(3, username);
        set(4, taskId);
        set(5, taskName);
        set(6, type);
    }
}
