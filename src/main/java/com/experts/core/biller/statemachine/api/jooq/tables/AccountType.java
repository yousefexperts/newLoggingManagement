/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.AccountTypeRecord;

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
public class AccountType extends TableImpl<AccountTypeRecord> {

    private static final long serialVersionUID = 2120767616;

    /**
     * The reference instance of <code>public.account_type</code>
     */
    public static final AccountType ACCOUNT_TYPE = new AccountType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountTypeRecord> getRecordType() {
        return AccountTypeRecord.class;
    }

    /**
     * The column <code>public.account_type.id</code>.
     */
    public final TableField<AccountTypeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.account_type.createddate</code>.
     */
    public final TableField<AccountTypeRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.account_type.lastmodifiedby</code>.
     */
    public final TableField<AccountTypeRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.account_type.modifieddate</code>.
     */
    public final TableField<AccountTypeRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.account_type.username</code>.
     */
    public final TableField<AccountTypeRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.account_type.account_type</code>.
     */
    public final TableField<AccountTypeRecord, String> ACCOUNT_TYPE_ = createField("account_type", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.account_type.version</code>.
     */
    public final TableField<AccountTypeRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.account_type</code> table reference
     */
    public AccountType() {
        this(DSL.name("account_type"), null);
    }

    /**
     * Create an aliased <code>public.account_type</code> table reference
     */
    public AccountType(String alias) {
        this(DSL.name(alias), ACCOUNT_TYPE);
    }

    /**
     * Create an aliased <code>public.account_type</code> table reference
     */
    public AccountType(Name alias) {
        this(alias, ACCOUNT_TYPE);
    }

    private AccountType(Name alias, Table<AccountTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountType(Name alias, Table<AccountTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AccountType(Table<O> child, ForeignKey<O, AccountTypeRecord> key) {
        super(child, key, ACCOUNT_TYPE);
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
        return Arrays.<Index>asList(Indexes.ACCOUNT_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountTypeRecord> getPrimaryKey() {
        return Keys.ACCOUNT_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountTypeRecord>>asList(Keys.ACCOUNT_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountType as(String alias) {
        return new AccountType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountType as(Name alias) {
        return new AccountType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountType rename(String name) {
        return new AccountType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountType rename(Name name) {
        return new AccountType(name, null);
    }
}
