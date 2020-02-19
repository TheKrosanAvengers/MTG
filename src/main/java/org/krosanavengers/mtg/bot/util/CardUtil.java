package org.krosanavengers.mtg.bot.util;

import org.krosanavengers.mtg.bot.cards.Card;
import org.krosanavengers.mtg.bot.zones.Zone;

public class CardUtil {

    public static void insertCardCopies(Zone zone, Card card, int count) {
        for (int i = 0; i < count; i++) {
            zone.putOnTop((Card) card.clone());
        }
    }

    public static Card getLand(Zone zone) {
        for (Card card : zone.getCards()) {
            if (card.checkType("Land")) {
                zone.getCards().remove(card);
                return card;
            }
        }
        return null;
    }
}
