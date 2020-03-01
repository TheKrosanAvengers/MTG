package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

public class Hand extends Zone {

    public Hand() {
        super(ZoneEnum.HAND);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Hand clone = new Hand();
        for (Card card : this.getCards()) {
            clone.putOnTop((Card) card.clone());
        }
        return clone;
    }
}
