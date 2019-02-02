/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables;


import com.experts.core.biller.statemachine.api.model.jooq.Indexes;
import com.experts.core.biller.statemachine.api.model.jooq.Keys;
import com.experts.core.biller.statemachine.api.model.jooq.Public;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TasksVaribleRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TasksVarible extends TableImpl<TasksVaribleRecord> {

    private static final long serialVersionUID = 680532395;

    /**
     * The reference instance of <code>public.tasks_varible</code>
     */
    public static final TasksVarible TASKS_VARIBLE = new TasksVarible();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TasksVaribleRecord> getRecordType() {
        return TasksVaribleRecord.class;
    }

    /**
     * The column <code>public.tasks_varible.id</code>.
     */
    public final TableField<TasksVaribleRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tasks_varible.createddate</code>.
     */
    public final TableField<TasksVaribleRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.tasks_varible.modifieddate</code>.
     */
    public final TableField<TasksVaribleRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.tasks_varible.username</code>.
     */
    public final TableField<TasksVaribleRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tasks_varible.type</code>.
     */
    public final TableField<TasksVaribleRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tasks_varible.value</code>.
     */
    public final TableField<TasksVaribleRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.tasks_varible.name</code>.
     */
    public final TableField<TasksVaribleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.tasks_varible.task_id</code>.
     */
    public final TableField<TasksVaribleRecord, Long> TASK_ID = createField("task_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.tasks_varible</code> table reference
     */
    public TasksVarible() {
        this(DSL.name("tasks_varible"), null);
    }

    /**
     * Create an aliased <code>public.tasks_varible</code> table reference
     */
    public TasksVarible(String alias) {
        this(DSL.name(alias), TASKS_VARIBLE);
    }

    /**
     * Create an aliased <code>public.tasks_varible</code> table reference
     */
    public TasksVarible(Name alias) {
        this(alias, TASKS_VARIBLE);
    }

    private TasksVarible(Name alias, Table<TasksVaribleRecord> aliased) {
        this(alias, aliased, null);
    }

    private TasksVarible(Name alias, Table<TasksVaribleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TasksVarible(Table<O> child, ForeignKey<O, TasksVaribleRecord> key) {
        super(child, key, TASKS_VARIBLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TASKS_VARIBLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TasksVaribleRecord> getPrimaryKey() {
        return Keys.TASKS_VARIBLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TasksVaribleRecord>> getKeys() {
        return Arrays.<UniqueKey<TasksVaribleRecord>>asList(Keys.TASKS_VARIBLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TasksVaribleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TasksVaribleRecord, ?>>asList(Keys.TASKS_VARIBLE__FK8H0F1B32O348T1FD09YQG4C92);
    }

    public Tasks tasks() {
        return new Tasks(this, Keys.TASKS_VARIBLE__FK8H0F1B32O348T1FD09YQG4C92);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksVarible as(String alias) {
        return new TasksVarible(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksVarible as(Name alias) {
        return new TasksVarible(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TasksVarible rename(String name) {
        return new TasksVarible(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TasksVarible rename(Name name) {
        return new TasksVarible(name, null);
    }
}
