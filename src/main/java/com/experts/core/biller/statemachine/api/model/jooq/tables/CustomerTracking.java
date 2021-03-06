/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables;


import com.experts.core.biller.statemachine.api.model.jooq.Indexes;
import com.experts.core.biller.statemachine.api.model.jooq.Keys;
import com.experts.core.biller.statemachine.api.model.jooq.Public;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.CustomtrackingrevisionentityRecord;

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
public class CustomerTracking extends TableImpl<CustomtrackingrevisionentityRecord> {

    private static final long serialVersionUID = -912222517;

    /**
     * The reference instance of <code>public.customtrackingrevisionentity</code>
     */
    public static final CustomerTracking CUSTOMER_TRACKING = new CustomerTracking();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomtrackingrevisionentityRecord> getRecordType() {
        return CustomtrackingrevisionentityRecord.class;
    }

    /**
     * The column <code>public.customtrackingrevisionentity.customid</code>.
     */
    public final TableField<CustomtrackingrevisionentityRecord, Integer> CUSTOMID = createField("customid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.customtrackingrevisionentity.customtimestamp</code>.
     */
    public final TableField<CustomtrackingrevisionentityRecord, Long> CUSTOMTIMESTAMP = createField("customtimestamp", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.customtrackingrevisionentity.username</code>.
     */
    public final TableField<CustomtrackingrevisionentityRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.customtrackingrevisionentity</code> table reference
     */
    public CustomerTracking() {
        this(DSL.name("customtrackingrevisionentity"), null);
    }

    /**
     * Create an aliased <code>public.customtrackingrevisionentity</code> table reference
     */
    public CustomerTracking(String alias) {
        this(DSL.name(alias), CUSTOMER_TRACKING);
    }

    /**
     * Create an aliased <code>public.customtrackingrevisionentity</code> table reference
     */
    public CustomerTracking(Name alias) {
        this(alias, CUSTOMER_TRACKING);
    }

    private CustomerTracking(Name alias, Table<CustomtrackingrevisionentityRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerTracking(Name alias, Table<CustomtrackingrevisionentityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CustomerTracking(Table<O> child, ForeignKey<O, CustomtrackingrevisionentityRecord> key) {
        super(child, key, CUSTOMER_TRACKING);
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
        return Arrays.<Index>asList(Indexes.CUSTOMTRACKINGREVISIONENTITY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomtrackingrevisionentityRecord> getPrimaryKey() {
        return Keys.CUSTOMTRACKINGREVISIONENTITY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomtrackingrevisionentityRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomtrackingrevisionentityRecord>>asList(Keys.CUSTOMTRACKINGREVISIONENTITY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerTracking as(String alias) {
        return new CustomerTracking(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerTracking as(Name alias) {
        return new CustomerTracking(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerTracking rename(String name) {
        return new CustomerTracking(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerTracking rename(Name name) {
        return new CustomerTracking(name, null);
    }
}
