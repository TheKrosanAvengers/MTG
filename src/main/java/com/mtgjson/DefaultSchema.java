/*
 * This file is generated by jOOQ.
 */
package com.mtgjson;


import com.mtgjson.tables.Cards;
import com.mtgjson.tables.ForeignData;
import com.mtgjson.tables.Legalities;
import com.mtgjson.tables.Prices;
import com.mtgjson.tables.Rulings;
import com.mtgjson.tables.SetTranslations;
import com.mtgjson.tables.Sets;
import com.mtgjson.tables.SqliteSequence;
import com.mtgjson.tables.Tokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -146198790;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>cards</code>.
     */
    public final Cards CARDS = com.mtgjson.tables.Cards.CARDS;

    /**
     * The table <code>foreign_data</code>.
     */
    public final ForeignData FOREIGN_DATA = com.mtgjson.tables.ForeignData.FOREIGN_DATA;

    /**
     * The table <code>legalities</code>.
     */
    public final Legalities LEGALITIES = com.mtgjson.tables.Legalities.LEGALITIES;

    /**
     * The table <code>prices</code>.
     */
    public final Prices PRICES = com.mtgjson.tables.Prices.PRICES;

    /**
     * The table <code>rulings</code>.
     */
    public final Rulings RULINGS = com.mtgjson.tables.Rulings.RULINGS;

    /**
     * The table <code>set_translations</code>.
     */
    public final SetTranslations SET_TRANSLATIONS = com.mtgjson.tables.SetTranslations.SET_TRANSLATIONS;

    /**
     * The table <code>sets</code>.
     */
    public final Sets SETS = com.mtgjson.tables.Sets.SETS;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public final SqliteSequence SQLITE_SEQUENCE = com.mtgjson.tables.SqliteSequence.SQLITE_SEQUENCE;

    /**
     * The table <code>tokens</code>.
     */
    public final Tokens TOKENS = com.mtgjson.tables.Tokens.TOKENS;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Cards.CARDS,
            ForeignData.FOREIGN_DATA,
            Legalities.LEGALITIES,
            Prices.PRICES,
            Rulings.RULINGS,
            SetTranslations.SET_TRANSLATIONS,
            Sets.SETS,
            SqliteSequence.SQLITE_SEQUENCE,
            Tokens.TOKENS);
    }
}
