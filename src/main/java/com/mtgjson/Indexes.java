/*
 * This file is generated by jOOQ.
 */
package com.mtgjson;


import com.mtgjson.tables.Cards;
import com.mtgjson.tables.Sets;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SQLITE_AUTOINDEX_CARDS_1 = Indexes0.SQLITE_AUTOINDEX_CARDS_1;
    public static final Index SQLITE_AUTOINDEX_SETS_1 = Indexes0.SQLITE_AUTOINDEX_SETS_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SQLITE_AUTOINDEX_CARDS_1 = Internal.createIndex("sqlite_autoindex_cards_1", Cards.CARDS, new OrderField[] { Cards.CARDS.UUID }, true);
        public static Index SQLITE_AUTOINDEX_SETS_1 = Internal.createIndex("sqlite_autoindex_sets_1", Sets.SETS, new OrderField[] { Sets.SETS.CODE }, true);
    }
}