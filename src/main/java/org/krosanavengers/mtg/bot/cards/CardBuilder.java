package org.krosanavengers.mtg.bot.cards;

import com.google.gson.annotations.Expose;

import java.util.Arrays;
import java.util.List;

public class CardBuilder {

    @Expose
    private String name;
    @Expose
    private List<String> cost;
    @Expose
    private List<String> superTypes;
    @Expose
    private List<String> types;
    @Expose
    private List<String> subTypes;
    @Expose
    private List<String> abilities;
    @Expose
    private String power;
    @Expose
    private String toughness;
    @Expose
    boolean tapped = false;

    public CardBuilder(final String name) {
        this.name = name;
    }

    public CardBuilder setCost(final List<String> cost) {
        this.cost = cost;
        return this;
    }

    public CardBuilder setCost(final String... cost) {
        return setCost(Arrays.asList(cost));
    }

    public CardBuilder setSuperTypes(final List<String> superTypes) {
        this.superTypes = superTypes;
        return this;
    }

    public CardBuilder setSuperTypes(final String... types) {
        return setSuperTypes(Arrays.asList(types));
    }

    public CardBuilder setTypes(final List<String> types) {
        this.types = types;
        return this;
    }

    public CardBuilder setTypes(final String... types) {
        return setTypes(Arrays.asList(types));
    }

    public CardBuilder setSubTypes(final List<String> subTypes) {
        this.subTypes = subTypes;
        return this;
    }

    public CardBuilder setSubTypes(final String... types) {
        return setSubTypes(Arrays.asList(types));
    }

    public CardBuilder setAbilities(final List<String> abilities) {
        this.abilities = abilities;
        return this;
    }

    public CardBuilder setPower(final String power) {
        this.power = power;
        return this;
    }

    public CardBuilder setToughness(final String toughness) {
        this.toughness = toughness;
        return this;
    }

    public CardBuilder setPower(final int power) {
        setPower(String.valueOf(power));
        return this;
    }

    public CardBuilder setToughness(final int toughness) {
        setToughness(String.valueOf(toughness));
        return this;
    }

    public Card build() {
        return new Card(this.name, this.cost, this.superTypes,this.types, this.subTypes, this.abilities, this.power, this.toughness);
    }
}
