/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.ProcessState;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ProcessStateRecord extends UpdatableRecordImpl<ProcessStateRecord> implements Record11<Long, Timestamp, String, Timestamp, String, String, String, String, String, Integer, Long> {

    private static final long serialVersionUID = -1368764457;

    /**
     * Setter for <code>public.process_state.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.process_state.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.process_state.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.process_state.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.process_state.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.process_state.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.process_state.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.process_state.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.process_state.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.process_state.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.process_state.process_definition</code>.
     */
    public void setProcessDefinition(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.process_state.process_definition</code>.
     */
    public String getProcessDefinition() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.process_state.process_flow_id</code>.
     */
    public void setProcessFlowId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.process_state.process_flow_id</code>.
     */
    public String getProcessFlowId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.process_state.process_flow_execution_id</code>.
     */
    public void setProcessFlowExecutionId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.process_state.process_flow_execution_id</code>.
     */
    public String getProcessFlowExecutionId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.process_state.process_name</code>.
     */
    public void setProcessName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.process_state.process_name</code>.
     */
    public String getProcessName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.process_state.version</code>.
     */
    public void setVersion(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.process_state.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.process_state.state_id</code>.
     */
    public void setStateId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.process_state.state_id</code>.
     */
    public Long getStateId() {
        return (Long) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Timestamp, String, Timestamp, String, String, String, String, String, Integer, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Timestamp, String, Timestamp, String, String, String, String, String, Integer, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ProcessState.PROCESS_STATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ProcessState.PROCESS_STATE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ProcessState.PROCESS_STATE.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ProcessState.PROCESS_STATE.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ProcessState.PROCESS_STATE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ProcessState.PROCESS_STATE.PROCESS_DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProcessState.PROCESS_STATE.PROCESS_FLOW_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ProcessState.PROCESS_STATE.PROCESS_FLOW_EXECUTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ProcessState.PROCESS_STATE.PROCESS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ProcessState.PROCESS_STATE.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ProcessState.PROCESS_STATE.STATE_ID;
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
        return getProcessDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProcessFlowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProcessFlowExecutionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getProcessName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getStateId();
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
        return getProcessDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProcessFlowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProcessFlowExecutionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getProcessName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value3(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value4(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value6(String value) {
        setProcessDefinition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value7(String value) {
        setProcessFlowId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value8(String value) {
        setProcessFlowExecutionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value9(String value) {
        setProcessName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value10(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord value11(Long value) {
        setStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessStateRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6, String value7, String value8, String value9, Integer value10, Long value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcessStateRecord
     */
    public ProcessStateRecord() {
        super(ProcessState.PROCESS_STATE);
    }

    /**
     * Create a detached, initialised ProcessStateRecord
     */
    public ProcessStateRecord(Long id, Timestamp createddate, String lastmodifiedby, Timestamp modifieddate, String username, String processDefinition, String processFlowId, String processFlowExecutionId, String processName, Integer version, Long stateId) {
        super(ProcessState.PROCESS_STATE);

        set(0, id);
        set(1, createddate);
        set(2, lastmodifiedby);
        set(3, modifieddate);
        set(4, username);
        set(5, processDefinition);
        set(6, processFlowId);
        set(7, processFlowExecutionId);
        set(8, processName);
        set(9, version);
        set(10, stateId);
    }
}