/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq.tables;


import com.experts.core.biller.statemachine.api.model.jooq.Indexes;
import com.experts.core.biller.statemachine.api.model.jooq.Keys;
import com.experts.core.biller.statemachine.api.model.jooq.Public;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxRolYetkiRecord;

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
public class TxRolYetki extends TableImpl<TxRolYetkiRecord> {

    private static final long serialVersionUID = 294465037;

    /**
     * The reference instance of <code>public.tx_rol_yetki</code>
     */
    public static final TxRolYetki TX_ROL_YETKI = new TxRolYetki();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TxRolYetkiRecord> getRecordType() {
        return TxRolYetkiRecord.class;
    }

    /**
     * The column <code>public.tx_rol_yetki.id</code>.
     */
    public final TableField<TxRolYetkiRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tx_rol_yetki.role_id</code>.
     */
    public final TableField<TxRolYetkiRecord, Long> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tx_rol_yetki.yetki_id</code>.
     */
    public final TableField<TxRolYetkiRecord, Long> YETKI_ID = createField("yetki_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.tx_rol_yetki</code> table reference
     */
    public TxRolYetki() {
        this(DSL.name("tx_rol_yetki"), null);
    }

    /**
     * Create an aliased <code>public.tx_rol_yetki</code> table reference
     */
    public TxRolYetki(String alias) {
        this(DSL.name(alias), TX_ROL_YETKI);
    }

    /**
     * Create an aliased <code>public.tx_rol_yetki</code> table reference
     */
    public TxRolYetki(Name alias) {
        this(alias, TX_ROL_YETKI);
    }

    private TxRolYetki(Name alias, Table<TxRolYetkiRecord> aliased) {
        this(alias, aliased, null);
    }

    private TxRolYetki(Name alias, Table<TxRolYetkiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TxRolYetki(Table<O> child, ForeignKey<O, TxRolYetkiRecord> key) {
        super(child, key, TX_ROL_YETKI);
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
        return Arrays.<Index>asList(Indexes.TX_ROL_YETKI_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TxRolYetkiRecord> getPrimaryKey() {
        return Keys.TX_ROL_YETKI_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TxRolYetkiRecord>> getKeys() {
        return Arrays.<UniqueKey<TxRolYetkiRecord>>asList(Keys.TX_ROL_YETKI_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TxRolYetkiRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TxRolYetkiRecord, ?>>asList(Keys.TX_ROL_YETKI__FK86F9OLGXPYWSWCM7CTBOOBJDE, Keys.TX_ROL_YETKI__FK2WVPJW8UEJY8MM7H4Q6M6YKUX);
    }

    public TxRol txRol() {
        return new TxRol(this, Keys.TX_ROL_YETKI__FK86F9OLGXPYWSWCM7CTBOOBJDE);
    }

    public TxYetki txYetki() {
        return new TxYetki(this, Keys.TX_ROL_YETKI__FK2WVPJW8UEJY8MM7H4Q6M6YKUX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxRolYetki as(String alias) {
        return new TxRolYetki(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxRolYetki as(Name alias) {
        return new TxRolYetki(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TxRolYetki rename(String name) {
        return new TxRolYetki(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TxRolYetki rename(Name name) {
        return new TxRolYetki(name, null);
    }
}
