package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

public class Library extends Zone {
    public Library() {
        super(ZoneEnum.LIBRARY);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Library clone = new Library();
        for (Card card : this.getCards()) {
            clone.putOnTop((Card) card.clone());
        }
        return clone;
    }
}
