package org.krosanavengers.mtg.bot.util;

import org.krosanavengers.mtg.bot.cards.Card;
import org.krosanavengers.mtg.bot.zones.Zone;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class ZoneUtil {

    public static boolean isEmptyOrNull(final Zone zone) {
        return zone == null || zone.getCards() == null || zone.getCards().isEmpty();
    }

    public static int countCardTypeInZone(final Zone zone, String... cardTypes){
        int cardCount = 0;
        if (!isEmptyOrNull(zone) && cardTypes.length > 0){
            List<String> cardTypesList = Arrays.asList(cardTypes);

            for (Card card: zone.getCards()) {
                if (card.getTypes().containsAll(cardTypesList)){
                    cardCount++;
                }
            }
        }
        return cardCount;
    }

    public static void untapAllCards(Zone zone){
        if (!isEmptyOrNull(zone)){
            for (Card zoneCard : zone.getCards()) {
                if (zoneCard.isCanUntap()){
                    zoneCard.setTapped(false);
                }
            }
        }
    }
}
