package org.krosanavengers.mtg.bot.cards;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.util.GsonUtil;

import java.util.List;

public class Card implements Cloneable {
    @Expose
    protected String name;
    @Expose
    protected List<String> cost;
    @Expose
    protected List<String> superTypes;
    @Expose
    protected List<String> types;
    @Expose
    protected List<String> subTypes;
    @Expose
    protected List<String> abilities;
    @Expose
    protected int power;
    @Expose
    protected int toughness;
    @Expose
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

    @Override
    public String toString() {
        return toJson();
    }

    public String toJson() {
        return GsonUtil.toJson(this);
    }
}
