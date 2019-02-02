/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.BankDetailsRecord;

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
public class BankDetails extends TableImpl<BankDetailsRecord> {

    private static final long serialVersionUID = -462910912;

    /**
     * The reference instance of <code>public.bank_details</code>
     */
    public static final BankDetails BANK_DETAILS = new BankDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankDetailsRecord> getRecordType() {
        return BankDetailsRecord.class;
    }

    /**
     * The column <code>public.bank_details.id</code>.
     */
    public final TableField<BankDetailsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.bank_details.createddate</code>.
     */
    public final TableField<BankDetailsRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bank_details.lastmodifiedby</code>.
     */
    public final TableField<BankDetailsRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bank_details.modifieddate</code>.
     */
    public final TableField<BankDetailsRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bank_details.username</code>.
     */
    public final TableField<BankDetailsRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bank_details.bank_address</code>.
     */
    public final TableField<BankDetailsRecord, String> BANK_ADDRESS = createField("bank_address", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bank_details.bank_address_street</code>.
     */
    public final TableField<BankDetailsRecord, String> BANK_ADDRESS_STREET = createField("bank_address_street", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bank_details.bank_code</code>.
     */
    public final TableField<BankDetailsRecord, String> BANK_CODE = createField("bank_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bank_details.bank_email</code>.
     */
    public final TableField<BankDetailsRecord, String> BANK_EMAIL = createField("bank_email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bank_details.bank_name</code>.
     */
    public final TableField<BankDetailsRecord, String> BANK_NAME = createField("bank_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bank_details.bank_phone</code>.
     */
    public final TableField<BankDetailsRecord, String> BANK_PHONE = createField("bank_phone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bank_details.version</code>.
     */
    public final TableField<BankDetailsRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.bank_details</code> table reference
     */
    public BankDetails() {
        this(DSL.name("bank_details"), null);
    }

    /**
     * Create an aliased <code>public.bank_details</code> table reference
     */
    public BankDetails(String alias) {
        this(DSL.name(alias), BANK_DETAILS);
    }

    /**
     * Create an aliased <code>public.bank_details</code> table reference
     */
    public BankDetails(Name alias) {
        this(alias, BANK_DETAILS);
    }

    private BankDetails(Name alias, Table<BankDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankDetails(Name alias, Table<BankDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BankDetails(Table<O> child, ForeignKey<O, BankDetailsRecord> key) {
        super(child, key, BANK_DETAILS);
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
        return Arrays.<Index>asList(Indexes.BANK_DETAILS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BankDetailsRecord> getPrimaryKey() {
        return Keys.BANK_DETAILS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BankDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<BankDetailsRecord>>asList(Keys.BANK_DETAILS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetails as(String alias) {
        return new BankDetails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankDetails as(Name alias) {
        return new BankDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankDetails rename(String name) {
        return new BankDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankDetails rename(Name name) {
        return new BankDetails(name, null);
    }
}
