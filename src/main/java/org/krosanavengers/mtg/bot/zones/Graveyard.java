package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

public class Graveyard extends Zone {
    public Graveyard() {
        super(ZoneEnum.GRAVEYARD);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Graveyard clone = new Graveyard();
        for (Card card : this.getCards()) {
            clone.putOnTop((Card) card.clone());
        }
        return clone;
    }
}
