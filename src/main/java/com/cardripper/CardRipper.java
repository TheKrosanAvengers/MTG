package com.cardripper;

import com.cards.public_.tables.Cardnonstaticabilities;
import com.cards.public_.tables.Nonstaticabilities;
import com.cards.public_.tables.records.CardsRecord;
import com.cards.public_.tables.records.NonstaticabilitiesRecord;
import com.main.Abilities;
import com.main.Constant;
import com.mtgjson.tables.Cards;
import com.mtgjson.tables.Legalities;
import org.apache.commons.lang3.StringUtils;
import org.jooq.DSLContext;
import org.jooq.Record9;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardRipper {
    public static void main(String[] args) {
        Connection sqliteConn = null;
        Connection h2Conn = null;
        try {
            // db parameters
            String sqliteURL = "jdbc:sqlite:AllPrintings.sqlite";
            String h2URL = "jdbc:h2:tcp://localhost:9092/mtg";
            // create a connection to the database
            sqliteConn = DriverManager.getConnection(sqliteURL);
            h2Conn = DriverManager.getConnection(h2URL, "sa", "");

            DSLContext sqliteDSL = DSL.using(sqliteConn, SQLDialect.SQLITE);
            DSLContext h2DSL = DSL.using(h2Conn, SQLDialect.H2);
            Result<Record9<String, String, Float, String, String, String, String, String, String>> cards = sqliteDSL.selectDistinct(
                    Cards.CARDS.NAME,
                    Cards.CARDS.MANACOST,
                    Cards.CARDS.CONVERTEDMANACOST,
                    Cards.CARDS.SUPERTYPES, Cards.CARDS.TYPES,
                    Cards.CARDS.SUBTYPES,
                    Cards.CARDS.TEXT,
                    Cards.CARDS.POWER,
                    Cards.CARDS.TOUGHNESS).from(Cards.CARDS)
                    .innerJoin(Legalities.LEGALITIES).on(Legalities.LEGALITIES.UUID.eq(Cards.CARDS.UUID))
                    .where(Legalities.LEGALITIES.FORMAT.eq("brawl"))
                    .orderBy(Cards.CARDS.NAME)
                    //.limit(100)
                    .fetch();
            int count = 0;
            for (Record9<String, String, Float, String, String, String, String, String, String> card : cards) {
                String name = card.component1();
                String manaCost = card.component2();
                int convertedManaCost = card.component3().intValue();
                String[] superTypes = card.component4() == null ? new String[]{} : card.component4().split(",");
                String[] types = card.component5() == null ? new String[]{} : card.component5().split(",");
                String[] subTypes = card.component6() == null ? new String[]{} : card.component6().split(",");
                String text = card.component7() == null ? "" : card.component7().replace("—", "-").replace(name, Constant.cardName);
                Integer power = Integer.getInteger(card.component8());
                Integer toughness = Integer.getInteger(card.component9());

                text = text.replaceAll("\u2014", "-").replaceAll("\u2022", ">")
                        .replaceAll("\n>", ">");
                String[] paragraphs = text.split("\n");

                CardsRecord cardsRecord = h2DSL.insertInto(com.cards.public_.tables.Cards.CARDS,
                        com.cards.public_.tables.Cards.CARDS.NAME,
                        com.cards.public_.tables.Cards.CARDS.CMC,
                        com.cards.public_.tables.Cards.CARDS.COST,
                        com.cards.public_.tables.Cards.CARDS.POWER,
                        com.cards.public_.tables.Cards.CARDS.TOUGHNESS).values(name,
                        convertedManaCost, manaCost, power, toughness).onDuplicateKeyIgnore().returning(com.cards.public_.tables.Cards.CARDS.ID)
                        .fetchOne();


                for (String paragraph : paragraphs) {
                    String line = Abilities.removeReminders(paragraph).trim();
                    String deQuoted = line;
                    Matcher m = Pattern.compile(Constant.betweenQuotes)
                            .matcher(line);
                    while (m.find()) {
                        deQuoted = deQuoted.replace(m.group(), "");
                    }

                    if (line.startsWith("(")) {
                        line = line.substring(1);
                    }
                    if (line.endsWith(")")) {
                        line = line.substring(0, line.length() - 2);
                    }
                    if (deQuoted.contains(":")) {
                        String[] split = line.split(":");
                        String cost = split[0].trim();
                        String ability = split[1].trim();
                        NonstaticabilitiesRecord nonstaticabilitiesRecord = h2DSL.selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(ability)).fetchOne();
                        if (nonstaticabilitiesRecord == null) {
                            h2DSL.insertInto(Nonstaticabilities.NONSTATICABILITIES, Nonstaticabilities.NONSTATICABILITIES.TEXT).values(ability).execute();
                            nonstaticabilitiesRecord = h2DSL.selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(ability)).fetchOne();
                        } else {
                            count++;
                        }
                        h2DSL.insertInto(Cardnonstaticabilities.CARDNONSTATICABILITIES,
                                Cardnonstaticabilities.CARDNONSTATICABILITIES.CARD,
                                Cardnonstaticabilities.CARDNONSTATICABILITIES.COST,
                                Cardnonstaticabilities.CARDNONSTATICABILITIES.NONSTATICABILITY).values(cardsRecord.value1(), cost, nonstaticabilitiesRecord.getId()).onDuplicateKeyIgnore().execute();
                    } else {
                        String[] strings = Abilities.parseStaticAbilities(line);
                        for (String string : strings) {
                            if (!StringUtils.isBlank(string)) {
                                NonstaticabilitiesRecord nonstaticabilitiesRecord = h2DSL.selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(string)).fetchOne();
                                if (nonstaticabilitiesRecord == null) {
                                    h2DSL.insertInto(Nonstaticabilities.NONSTATICABILITIES, Nonstaticabilities.NONSTATICABILITIES.TEXT).values(string).execute();
                                    nonstaticabilitiesRecord = h2DSL.selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(string)).fetchOne();
                                } else {
                                    count++;
                                }
                                h2DSL.insertInto(Cardnonstaticabilities.CARDNONSTATICABILITIES,
                                        Cardnonstaticabilities.CARDNONSTATICABILITIES.CARD,
                                        Cardnonstaticabilities.CARDNONSTATICABILITIES.NONSTATICABILITY).values(cardsRecord.value1(), nonstaticabilitiesRecord.getId()).onDuplicateKeyIgnore().execute();
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (sqliteConn != null) {
                    sqliteConn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}