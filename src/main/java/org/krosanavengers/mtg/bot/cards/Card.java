package org.krosanavengers.mtg.bot.cards;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.util.GsonUtil;

import java.util.List;

public class Card implements Cloneable {
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
    @Expose
    boolean canUntap = true;

    public Card() {
    }


    public Card(final String name, final List<String> cost, final List<String> superTypes, final List<String> types, final List<String> subTypes, final List<String> abilities, final String power, final String toughness) {
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
        return this.name;
    }

    public boolean checkType(final String type) {
        return types.contains(type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCost() {
        return cost;
    }

    public void setCost(List<String> cost) {
        this.cost = cost;
    }

    public List<String> getSuperTypes() {
        return superTypes;
    }

    public void setSuperTypes(List<String> superTypes) {
        this.superTypes = superTypes;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(List<String> subTypes) {
        this.subTypes = subTypes;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public boolean isTapped() {
        return tapped;
    }

    public boolean isCanUntap() {
        return this.canUntap;
    }

    public void setCanUntap(final boolean canUntap) {
        this.canUntap = canUntap;
    }

    public void setTapped(boolean tapped) {
        this.tapped = tapped;
    }

    @Override
    public Object clone() {
        return new Card(this.name, this.cost, this.superTypes, this.types
                , this.subTypes, this.abilities, this.power, this.toughness);
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
