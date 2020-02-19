package org.krosanavengers.mtg.bot.cards;

import java.util.Arrays;
import java.util.List;

public class CardBuilder extends Card {

    public CardBuilder(String name) {
        this.name = name;
    }

    public CardBuilder setCost(List<String> cost) {
        this.cost = cost;
        return this;
    }

    public CardBuilder setCost(String... cost) {
        return setCost(Arrays.asList(cost));
    }

    public CardBuilder setSuperTypes(List<String> superTypes) {
        this.superTypes = superTypes;
        return this;
    }

    public CardBuilder setTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public CardBuilder setTypes(String... types) {
        return setTypes(Arrays.asList(types));
    }

    public CardBuilder setSubTypes(List<String> subTypes) {
        this.subTypes = subTypes;
        return this;
    }

    public CardBuilder setAbilities(List<String> abilities) {
        this.abilities = abilities;
        return this;
    }

    public CardBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public CardBuilder setToughness(int toughness) {
        this.toughness = toughness;
        return this;
    }

    public Card build() {
        return this;
    }
}
