package com.company.cards;

import java.util.List;

public class Card implements Cloneable {
    protected String name;
    protected List<String> cost;
    protected List<String> superTypes;
    protected List<String> types;
    protected List<String> subTypes;
    protected List<String> abilities;
    protected int power;
    protected int toughness;

    boolean tapped = false;

    public Card() {
    }


    private Card(String name, List<String> cost, List<String> superTypes, List<String> types, List<String> subTypes, List<String> abilities, int power, int toughness) {
        this.name = name;
        this.cost = cost;
        this.superTypes = superTypes;
        this.types = types;
        this.subTypes = subTypes;
        this.abilities = abilities;
        this.power = power;
        this.toughness = toughness;
    }

    public String getName() {
        return name;
    }

    public boolean checkType(String type) {
        return types.contains(type);
    }

    @Override
    public Object clone() {
        return new Card(name, cost, superTypes, types
                , subTypes, abilities, power, toughness);
    }
}
