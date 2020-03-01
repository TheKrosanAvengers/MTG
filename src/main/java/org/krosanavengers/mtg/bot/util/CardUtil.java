package org.krosanavengers.mtg.bot.util;

import org.krosanavengers.mtg.bot.cards.Card;
import org.krosanavengers.mtg.bot.player.Player;
import org.krosanavengers.mtg.bot.zones.Zone;
import org.krosanavengers.mtg.bot.zones.ZoneEnum;
import org.krosanavengers.mtg.exceptions.InsufficientCardsInZone;

import java.util.List;

public class CardUtil {

    public static void insertCardCopies(Zone zone, Card card, int count) {
        for (int i = 0; i < count; i++) {
            zone.putOnTop((Card) card.clone());
        }
    }

    public static List<Card> playerDrawFromZone(Player player, ZoneEnum zone,
                                                int count) {
        return player.getZone(zone).popTop(count);
    }

    public static void playerDrawFromLibrary(Player player,
                                             int count) throws InsufficientCardsInZone {
        List<Card> cards = playerDrawFromZone(player, ZoneEnum.LIBRARY, count);
        if (cards.size() != count) {
            throw new InsufficientCardsInZone(ZoneEnum.LIBRARY);
        }
        player.getZone(ZoneEnum.HAND).putOnTop(cards);
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
