/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.TransactionThreadCapcityRecord;

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
public class TransactionThreadCapcity extends TableImpl<TransactionThreadCapcityRecord> {

    private static final long serialVersionUID = 764073932;

    /**
     * The reference instance of <code>public.transaction_thread_capcity</code>
     */
    public static final TransactionThreadCapcity TRANSACTION_THREAD_CAPCITY = new TransactionThreadCapcity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionThreadCapcityRecord> getRecordType() {
        return TransactionThreadCapcityRecord.class;
    }

    /**
     * The column <code>public.transaction_thread_capcity.id</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.transaction_thread_capcity.createddate</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.transaction_thread_capcity.lastmodifiedby</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.transaction_thread_capcity.modifieddate</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.transaction_thread_capcity.username</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.transaction_thread_capcity.high_priority</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Boolean> HIGH_PRIORITY = createField("high_priority", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.transaction_thread_capcity.max</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Integer> MAX = createField("max", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.transaction_thread_capcity.min</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Integer> MIN = createField("min", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.transaction_thread_capcity.version</code>.
     */
    public final TableField<TransactionThreadCapcityRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.transaction_thread_capcity</code> table reference
     */
    public TransactionThreadCapcity() {
        this(DSL.name("transaction_thread_capcity"), null);
    }

    /**
     * Create an aliased <code>public.transaction_thread_capcity</code> table reference
     */
    public TransactionThreadCapcity(String alias) {
        this(DSL.name(alias), TRANSACTION_THREAD_CAPCITY);
    }

    /**
     * Create an aliased <code>public.transaction_thread_capcity</code> table reference
     */
    public TransactionThreadCapcity(Name alias) {
        this(alias, TRANSACTION_THREAD_CAPCITY);
    }

    private TransactionThreadCapcity(Name alias, Table<TransactionThreadCapcityRecord> aliased) {
        this(alias, aliased, null);
    }

    private TransactionThreadCapcity(Name alias, Table<TransactionThreadCapcityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TransactionThreadCapcity(Table<O> child, ForeignKey<O, TransactionThreadCapcityRecord> key) {
        super(child, key, TRANSACTION_THREAD_CAPCITY);
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
        return Arrays.<Index>asList(Indexes.TRANSACTION_THREAD_CAPCITY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TransactionThreadCapcityRecord> getPrimaryKey() {
        return Keys.TRANSACTION_THREAD_CAPCITY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TransactionThreadCapcityRecord>> getKeys() {
        return Arrays.<UniqueKey<TransactionThreadCapcityRecord>>asList(Keys.TRANSACTION_THREAD_CAPCITY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcity as(String alias) {
        return new TransactionThreadCapcity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionThreadCapcity as(Name alias) {
        return new TransactionThreadCapcity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TransactionThreadCapcity rename(String name) {
        return new TransactionThreadCapcity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TransactionThreadCapcity rename(Name name) {
        return new TransactionThreadCapcity(name, null);
    }
}
