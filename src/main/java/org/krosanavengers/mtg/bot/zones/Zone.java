package org.krosanavengers.mtg.bot.zones;

import org.krosanavengers.mtg.bot.cards.Card;

import java.util.*;

public abstract class Zone {

    //index 0 is 'top' of library, N'th is 'bottom'
    List<Card> cards;

    public Zone() {
        cards = new ArrayList<>();
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
        return this.cards.get(0);
    }

    public Card peekBottom() {
        return this.cards.get(this.cards.size() - 1);
    }

    public Card popTop() {
        Card card = this.cards.remove(0);
        System.out.println("Popping " + card.getName());
        return card;
    }

    public Card popBottom() {
        return this.cards.remove(this.cards.size() - 1);
    }

    public List<Card> getCards() {
        return cards;
    }
}
