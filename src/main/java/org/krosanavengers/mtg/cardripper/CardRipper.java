package org.krosanavengers.mtg.cardripper;

import org.apache.commons.lang3.StringUtils;
import org.jooq.Record9;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.krosanavengers.mtg.Constant;
import org.krosanavengers.mtg.jooq.h2.public_.tables.Cardnonstaticabilities;
import org.krosanavengers.mtg.jooq.h2.public_.tables.Nonstaticabilities;
import org.krosanavengers.mtg.jooq.h2.public_.tables.records.CardsRecord;
import org.krosanavengers.mtg.jooq.h2.public_.tables.records.NonstaticabilitiesRecord;
import org.krosanavengers.mtg.jooq.mtgjson.tables.Cards;
import org.krosanavengers.mtg.jooq.mtgjson.tables.Legalities;
import org.krosanavengers.mtg.utilities.DatabaseFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardRipper {
    public static void main(String[] args) {
        try {
            DatabaseFactory.start();
            Result<Record9<String, String, Float, String, String, String, String, String, String>> cards = DatabaseFactory.getSqliteDSL().selectDistinct(
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

                CardsRecord cardsRecord = DatabaseFactory.getH2DSL().insertInto(org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS,
                        org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS.NAME,
                        org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS.CMC,
                        org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS.COST,
                        org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS.POWER,
                        org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS.TOUGHNESS).values(name,
                        convertedManaCost, manaCost, power, toughness).onDuplicateKeyIgnore().returning(org.krosanavengers.mtg.jooq.h2.public_.tables.Cards.CARDS.ID)
                        .fetchOne();

                if (cardsRecord != null) {

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
                            NonstaticabilitiesRecord nonstaticabilitiesRecord = DatabaseFactory.getH2DSL().selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(ability)).fetchOne();
                            if (nonstaticabilitiesRecord == null) {
                                DatabaseFactory.getH2DSL().insertInto(Nonstaticabilities.NONSTATICABILITIES, Nonstaticabilities.NONSTATICABILITIES.TEXT).values(ability).execute();
                                nonstaticabilitiesRecord = DatabaseFactory.getH2DSL().selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(ability)).fetchOne();
                            } else {
                                count++;
                            }
                            DatabaseFactory.getH2DSL().insertInto(Cardnonstaticabilities.CARDNONSTATICABILITIES,
                                    Cardnonstaticabilities.CARDNONSTATICABILITIES.CARD,
                                    Cardnonstaticabilities.CARDNONSTATICABILITIES.COST,
                                    Cardnonstaticabilities.CARDNONSTATICABILITIES.NONSTATICABILITY).values(cardsRecord.value1(), cost, nonstaticabilitiesRecord.getId()).onDuplicateKeyIgnore().execute();
                        } else {
                            String[] strings = Abilities.parseStaticAbilities(line);
                            for (String string : strings) {
                                if (!StringUtils.isBlank(string)) {
                                    NonstaticabilitiesRecord nonstaticabilitiesRecord = DatabaseFactory.getH2DSL().selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(string)).fetchOne();
                                    if (nonstaticabilitiesRecord == null) {
                                        DatabaseFactory.getH2DSL().insertInto(Nonstaticabilities.NONSTATICABILITIES, Nonstaticabilities.NONSTATICABILITIES.TEXT).values(string).execute();
                                        nonstaticabilitiesRecord = DatabaseFactory.getH2DSL().selectFrom(Nonstaticabilities.NONSTATICABILITIES).where(Nonstaticabilities.NONSTATICABILITIES.TEXT.like(string)).fetchOne();
                                    } else {
                                        count++;
                                    }
                                    DatabaseFactory.getH2DSL().insertInto(Cardnonstaticabilities.CARDNONSTATICABILITIES,
                                            Cardnonstaticabilities.CARDNONSTATICABILITIES.CARD,
                                            Cardnonstaticabilities.CARDNONSTATICABILITIES.NONSTATICABILITY).values(cardsRecord.value1(), nonstaticabilitiesRecord.getId()).onDuplicateKeyIgnore().execute();
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        DatabaseFactory.stop();
    }

}
