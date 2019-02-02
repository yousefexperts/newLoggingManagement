/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.TransactionRecord;

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
public class Transaction extends TableImpl<TransactionRecord> {

    private static final long serialVersionUID = -1975437968;

    /**
     * The reference instance of <code>public.transaction</code>
     */
    public static final Transaction TRANSACTION = new Transaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionRecord> getRecordType() {
        return TransactionRecord.class;
    }

    /**
     * The column <code>public.transaction.id</code>.
     */
    public final TableField<TransactionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.transaction.createddate</code>.
     */
    public final TableField<TransactionRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.transaction.lastmodifiedby</code>.
     */
    public final TableField<TransactionRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.transaction.modifieddate</code>.
     */
    public final TableField<TransactionRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.transaction.username</code>.
     */
    public final TableField<TransactionRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.transaction.version</code>.
     */
    public final TableField<TransactionRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.transaction.state_process_id</code>.
     */
    public final TableField<TransactionRecord, Long> STATE_PROCESS_ID = createField("state_process_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.transaction.state_id</code>.
     */
    public final TableField<TransactionRecord, Long> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.transaction.status_id</code>.
     */
    public final TableField<TransactionRecord, Long> STATUS_ID = createField("status_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.transaction</code> table reference
     */
    public Transaction() {
        this(DSL.name("transaction"), null);
    }

    /**
     * Create an aliased <code>public.transaction</code> table reference
     */
    public Transaction(String alias) {
        this(DSL.name(alias), TRANSACTION);
    }

    /**
     * Create an aliased <code>public.transaction</code> table reference
     */
    public Transaction(Name alias) {
        this(alias, TRANSACTION);
    }

    private Transaction(Name alias, Table<TransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Transaction(Name alias, Table<TransactionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Transaction(Table<O> child, ForeignKey<O, TransactionRecord> key) {
        super(child, key, TRANSACTION);
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
        return Arrays.<Index>asList(Indexes.TRANSACTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TransactionRecord> getPrimaryKey() {
        return Keys.TRANSACTION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TransactionRecord>> getKeys() {
        return Arrays.<UniqueKey<TransactionRecord>>asList(Keys.TRANSACTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TransactionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TransactionRecord, ?>>asList(Keys.TRANSACTION__FKOGUHH0OK9225YEN34X6KU72R0, Keys.TRANSACTION__FKP2VG4BMV4J0WXNOTQ7BP1R6TA, Keys.TRANSACTION__FK7R0BJRUJOGNGIXWI0DQ5325HN);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.TRANSACTION__FKOGUHH0OK9225YEN34X6KU72R0);
    }

    public PayState payState() {
        return new PayState(this, Keys.TRANSACTION__FKP2VG4BMV4J0WXNOTQ7BP1R6TA);
    }

    public Transactionstatus transactionstatus() {
        return new Transactionstatus(this, Keys.TRANSACTION__FK7R0BJRUJOGNGIXWI0DQ5325HN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Transaction as(String alias) {
        return new Transaction(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Transaction as(Name alias) {
        return new Transaction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(String name) {
        return new Transaction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(Name name) {
        return new Transaction(name, null);
    }
}
