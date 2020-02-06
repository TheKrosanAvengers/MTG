/*
 * This file is generated by jOOQ.
 */
package com.cards.public_;


import com.cards.public_.tables.Cardnonstaticabilities;
import com.cards.public_.tables.Cards;
import com.cards.public_.tables.Cardstaticabilities;
import com.cards.public_.tables.Cardsubtypes;
import com.cards.public_.tables.Cardsupertypes;
import com.cards.public_.tables.Cardtypes;
import com.cards.public_.tables.Nonstaticabilities;
import com.cards.public_.tables.Staticabilities;
import com.cards.public_.tables.Subtypes;
import com.cards.public_.tables.Supertypes;
import com.cards.public_.tables.Types;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
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

    public static final Index CONSTRAINT_INDEX_8 = Indexes0.CONSTRAINT_INDEX_8;
    public static final Index CONSTRAINT_INDEX_80 = Indexes0.CONSTRAINT_INDEX_80;
    public static final Index PRIMARY_KEY_8 = Indexes0.PRIMARY_KEY_8;
    public static final Index CONSTRAINT_INDEX_3 = Indexes0.CONSTRAINT_INDEX_3;
    public static final Index PRIMARY_KEY_3 = Indexes0.PRIMARY_KEY_3;
    public static final Index CONSTRAINT_INDEX_3F = Indexes0.CONSTRAINT_INDEX_3F;
    public static final Index CONSTRAINT_INDEX_3FA = Indexes0.CONSTRAINT_INDEX_3FA;
    public static final Index PRIMARY_KEY_3F = Indexes0.PRIMARY_KEY_3F;
    public static final Index CONSTRAINT_INDEX_2 = Indexes0.CONSTRAINT_INDEX_2;
    public static final Index CONSTRAINT_INDEX_27 = Indexes0.CONSTRAINT_INDEX_27;
    public static final Index PRIMARY_KEY_2 = Indexes0.PRIMARY_KEY_2;
    public static final Index CONSTRAINT_INDEX_6 = Indexes0.CONSTRAINT_INDEX_6;
    public static final Index CONSTRAINT_INDEX_67 = Indexes0.CONSTRAINT_INDEX_67;
    public static final Index PRIMARY_KEY_6 = Indexes0.PRIMARY_KEY_6;
    public static final Index CONSTRAINT_INDEX_9 = Indexes0.CONSTRAINT_INDEX_9;
    public static final Index CONSTRAINT_INDEX_98 = Indexes0.CONSTRAINT_INDEX_98;
    public static final Index PRIMARY_KEY_9 = Indexes0.PRIMARY_KEY_9;
    public static final Index CONSTRAINT_INDEX_4 = Indexes0.CONSTRAINT_INDEX_4;
    public static final Index PRIMARY_KEY_4 = Indexes0.PRIMARY_KEY_4;
    public static final Index CONSTRAINT_INDEX_C = Indexes0.CONSTRAINT_INDEX_C;
    public static final Index CONSTRAINT_INDEX_C1 = Indexes0.CONSTRAINT_INDEX_C1;
    public static final Index PRIMARY_KEY_C = Indexes0.PRIMARY_KEY_C;
    public static final Index CONSTRAINT_INDEX_B3 = Indexes0.CONSTRAINT_INDEX_B3;
    public static final Index PRIMARY_KEY_B3 = Indexes0.PRIMARY_KEY_B3;
    public static final Index CONSTRAINT_INDEX_B = Indexes0.CONSTRAINT_INDEX_B;
    public static final Index PRIMARY_KEY_B = Indexes0.PRIMARY_KEY_B;
    public static final Index CONSTRAINT_INDEX_4C = Indexes0.CONSTRAINT_INDEX_4C;
    public static final Index PRIMARY_KEY_4C = Indexes0.PRIMARY_KEY_4C;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CONSTRAINT_INDEX_8 = Internal.createIndex("CONSTRAINT_INDEX_8", Cardnonstaticabilities.CARDNONSTATICABILITIES, new OrderField[] { Cardnonstaticabilities.CARDNONSTATICABILITIES.NONSTATICABILITY }, false);
        public static Index CONSTRAINT_INDEX_80 = Internal.createIndex("CONSTRAINT_INDEX_80", Cardnonstaticabilities.CARDNONSTATICABILITIES, new OrderField[] { Cardnonstaticabilities.CARDNONSTATICABILITIES.CARD }, false);
        public static Index PRIMARY_KEY_8 = Internal.createIndex("PRIMARY_KEY_8", Cardnonstaticabilities.CARDNONSTATICABILITIES, new OrderField[] { Cardnonstaticabilities.CARDNONSTATICABILITIES.ID }, true);
        public static Index CONSTRAINT_INDEX_3 = Internal.createIndex("CONSTRAINT_INDEX_3", Cards.CARDS, new OrderField[] { Cards.CARDS.NAME }, true);
        public static Index PRIMARY_KEY_3 = Internal.createIndex("PRIMARY_KEY_3", Cards.CARDS, new OrderField[] { Cards.CARDS.ID }, true);
        public static Index CONSTRAINT_INDEX_3F = Internal.createIndex("CONSTRAINT_INDEX_3F", Cardstaticabilities.CARDSTATICABILITIES, new OrderField[] { Cardstaticabilities.CARDSTATICABILITIES.STATICABILITY }, false);
        public static Index CONSTRAINT_INDEX_3FA = Internal.createIndex("CONSTRAINT_INDEX_3FA", Cardstaticabilities.CARDSTATICABILITIES, new OrderField[] { Cardstaticabilities.CARDSTATICABILITIES.CARD }, false);
        public static Index PRIMARY_KEY_3F = Internal.createIndex("PRIMARY_KEY_3F", Cardstaticabilities.CARDSTATICABILITIES, new OrderField[] { Cardstaticabilities.CARDSTATICABILITIES.ID }, true);
        public static Index CONSTRAINT_INDEX_2 = Internal.createIndex("CONSTRAINT_INDEX_2", Cardsubtypes.CARDSUBTYPES, new OrderField[] { Cardsubtypes.CARDSUBTYPES.SUBTYPE }, false);
        public static Index CONSTRAINT_INDEX_27 = Internal.createIndex("CONSTRAINT_INDEX_27", Cardsubtypes.CARDSUBTYPES, new OrderField[] { Cardsubtypes.CARDSUBTYPES.CARD }, false);
        public static Index PRIMARY_KEY_2 = Internal.createIndex("PRIMARY_KEY_2", Cardsubtypes.CARDSUBTYPES, new OrderField[] { Cardsubtypes.CARDSUBTYPES.ID }, true);
        public static Index CONSTRAINT_INDEX_6 = Internal.createIndex("CONSTRAINT_INDEX_6", Cardsupertypes.CARDSUPERTYPES, new OrderField[] { Cardsupertypes.CARDSUPERTYPES.SUPERTYPE }, false);
        public static Index CONSTRAINT_INDEX_67 = Internal.createIndex("CONSTRAINT_INDEX_67", Cardsupertypes.CARDSUPERTYPES, new OrderField[] { Cardsupertypes.CARDSUPERTYPES.CARD }, false);
        public static Index PRIMARY_KEY_6 = Internal.createIndex("PRIMARY_KEY_6", Cardsupertypes.CARDSUPERTYPES, new OrderField[] { Cardsupertypes.CARDSUPERTYPES.ID }, true);
        public static Index CONSTRAINT_INDEX_9 = Internal.createIndex("CONSTRAINT_INDEX_9", Cardtypes.CARDTYPES, new OrderField[] { Cardtypes.CARDTYPES.TYPE }, false);
        public static Index CONSTRAINT_INDEX_98 = Internal.createIndex("CONSTRAINT_INDEX_98", Cardtypes.CARDTYPES, new OrderField[] { Cardtypes.CARDTYPES.CARD }, false);
        public static Index PRIMARY_KEY_9 = Internal.createIndex("PRIMARY_KEY_9", Cardtypes.CARDTYPES, new OrderField[] { Cardtypes.CARDTYPES.ID }, true);
        public static Index CONSTRAINT_INDEX_4 = Internal.createIndex("CONSTRAINT_INDEX_4", Nonstaticabilities.NONSTATICABILITIES, new OrderField[] { Nonstaticabilities.NONSTATICABILITIES.TEXT }, true);
        public static Index PRIMARY_KEY_4 = Internal.createIndex("PRIMARY_KEY_4", Nonstaticabilities.NONSTATICABILITIES, new OrderField[] { Nonstaticabilities.NONSTATICABILITIES.ID }, true);
        public static Index CONSTRAINT_INDEX_C = Internal.createIndex("CONSTRAINT_INDEX_C", Staticabilities.STATICABILITIES, new OrderField[] { Staticabilities.STATICABILITIES.NAME }, true);
        public static Index CONSTRAINT_INDEX_C1 = Internal.createIndex("CONSTRAINT_INDEX_C1", Staticabilities.STATICABILITIES, new OrderField[] { Staticabilities.STATICABILITIES.TEXT }, true);
        public static Index PRIMARY_KEY_C = Internal.createIndex("PRIMARY_KEY_C", Staticabilities.STATICABILITIES, new OrderField[] { Staticabilities.STATICABILITIES.ID }, true);
        public static Index CONSTRAINT_INDEX_B3 = Internal.createIndex("CONSTRAINT_INDEX_B3", Subtypes.SUBTYPES, new OrderField[] { Subtypes.SUBTYPES.NAME }, true);
        public static Index PRIMARY_KEY_B3 = Internal.createIndex("PRIMARY_KEY_B3", Subtypes.SUBTYPES, new OrderField[] { Subtypes.SUBTYPES.ID }, true);
        public static Index CONSTRAINT_INDEX_B = Internal.createIndex("CONSTRAINT_INDEX_B", Supertypes.SUPERTYPES, new OrderField[] { Supertypes.SUPERTYPES.NAME }, true);
        public static Index PRIMARY_KEY_B = Internal.createIndex("PRIMARY_KEY_B", Supertypes.SUPERTYPES, new OrderField[] { Supertypes.SUPERTYPES.ID }, true);
        public static Index CONSTRAINT_INDEX_4C = Internal.createIndex("CONSTRAINT_INDEX_4C", Types.TYPES, new OrderField[] { Types.TYPES.NAME }, true);
        public static Index PRIMARY_KEY_4C = Internal.createIndex("PRIMARY_KEY_4C", Types.TYPES, new OrderField[] { Types.TYPES.ID }, true);
    }
}
