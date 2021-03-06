/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.BankServiceCatogeryRecord;

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
public class BankServiceCatogery extends TableImpl<BankServiceCatogeryRecord> {

    private static final long serialVersionUID = -370754830;

    /**
     * The reference instance of <code>public.bank_service_catogery</code>
     */
    public static final BankServiceCatogery BANK_SERVICE_CATOGERY = new BankServiceCatogery();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankServiceCatogeryRecord> getRecordType() {
        return BankServiceCatogeryRecord.class;
    }

    /**
     * The column <code>public.bank_service_catogery.id</code>.
     */
    public final TableField<BankServiceCatogeryRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.bank_service_catogery.createddate</code>.
     */
    public final TableField<BankServiceCatogeryRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bank_service_catogery.lastmodifiedby</code>.
     */
    public final TableField<BankServiceCatogeryRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bank_service_catogery.modifieddate</code>.
     */
    public final TableField<BankServiceCatogeryRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bank_service_catogery.username</code>.
     */
    public final TableField<BankServiceCatogeryRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bank_service_catogery.deleted</code>.
     */
    public final TableField<BankServiceCatogeryRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.bank_service_catogery.service_name</code>.
     */
    public final TableField<BankServiceCatogeryRecord, String> SERVICE_NAME = createField("service_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bank_service_catogery.type</code>.
     */
    public final TableField<BankServiceCatogeryRecord, byte[]> TYPE = createField("type", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>public.bank_service_catogery.version</code>.
     */
    public final TableField<BankServiceCatogeryRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.bank_service_catogery</code> table reference
     */
    public BankServiceCatogery() {
        this(DSL.name("bank_service_catogery"), null);
    }

    /**
     * Create an aliased <code>public.bank_service_catogery</code> table reference
     */
    public BankServiceCatogery(String alias) {
        this(DSL.name(alias), BANK_SERVICE_CATOGERY);
    }

    /**
     * Create an aliased <code>public.bank_service_catogery</code> table reference
     */
    public BankServiceCatogery(Name alias) {
        this(alias, BANK_SERVICE_CATOGERY);
    }

    private BankServiceCatogery(Name alias, Table<BankServiceCatogeryRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankServiceCatogery(Name alias, Table<BankServiceCatogeryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BankServiceCatogery(Table<O> child, ForeignKey<O, BankServiceCatogeryRecord> key) {
        super(child, key, BANK_SERVICE_CATOGERY);
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
        return Arrays.<Index>asList(Indexes.BANK_SERVICE_CATOGERY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BankServiceCatogeryRecord> getPrimaryKey() {
        return Keys.BANK_SERVICE_CATOGERY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BankServiceCatogeryRecord>> getKeys() {
        return Arrays.<UniqueKey<BankServiceCatogeryRecord>>asList(Keys.BANK_SERVICE_CATOGERY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServiceCatogery as(String alias) {
        return new BankServiceCatogery(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankServiceCatogery as(Name alias) {
        return new BankServiceCatogery(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankServiceCatogery rename(String name) {
        return new BankServiceCatogery(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankServiceCatogery rename(Name name) {
        return new BankServiceCatogery(name, null);
    }
}
