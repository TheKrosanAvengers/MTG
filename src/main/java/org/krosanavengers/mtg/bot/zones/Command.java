package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

public class Command extends Zone {

    public Command() {
        super(ZoneEnum.COMMAND);
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
