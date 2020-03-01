package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

public class Battlefield extends Zone {

    public Battlefield() {
        super(ZoneEnum.BATTLEFIELD);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Battlefield clone = new Battlefield();
        for (Card card : this.getCards()) {
            clone.putOnTop((Card) card.clone());
        }
        return clone;
    }


}
