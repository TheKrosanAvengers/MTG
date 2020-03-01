package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Zone implements Cloneable {

    //index 0 is 'top' of library, N'th is 'bottom'
    List<Card> cards;
    ZoneEnum zoneEnum;

    public Zone(ZoneEnum zoneEnum) {
        this.cards = new ArrayList<>();
        this.zoneEnum = zoneEnum;
    }

    public Zone(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(this.cards, new Random());
    }

    public void shuffle(List<Card> cards) {
        this.cards.addAll(cards);
        Collections.shuffle(this.cards, new Random());
    }

    public void shuffle(Card... cards) {
        shuffle(Arrays.asList(cards));
    }

    public void putOnTop(List<Card> cards) {
        this.cards.addAll(0, cards);
    }

    public void putOnTop(Card... cards) {
        putOnTop(Arrays.asList(cards));
    }

    public void putOnBottom(Card... cards) {
        this.cards.addAll(Arrays.asList(cards));
    }

    public Card peekTop() {
        if (this.cards.isEmpty()) {
            return null;
        }
        return this.cards.get(0);
    }

    public Card peekBottom() {
        if (this.cards.isEmpty()) {
            return null;
        }
        return this.cards.get(this.cards.size() - 1);
    }

    public Card popTop() {
        if (this.cards.isEmpty()) {
            return null;
        }
        Card card = this.cards.remove(0);
        return card;
    }

    public List<Card> popTop(int count) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Card poppedCard = popTop();
            if (poppedCard == null) {
                break;
            }
            cards.add(poppedCard);
        }
        return cards;
    }


    public Card popBottom() {
        return this.cards.remove(this.cards.size() - 1);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Zone{" +
                "name=" + zoneEnum +
                ", Cards{" + getCards().stream().map(Card::toString).collect(Collectors.joining(
                "\n, ")) +
                "}}";
    }


}
