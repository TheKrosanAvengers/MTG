package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

public class Exile extends Zone {

    public Exile() {
        super(ZoneEnum.EXILE);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Exile clone = new Exile();
        for (Card card : this.getCards()) {
            clone.putOnTop((Card) card.clone());
        }
        return clone;
    }
}
