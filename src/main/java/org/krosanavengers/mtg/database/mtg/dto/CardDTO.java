package org.krosanavengers.mtg.database.mtg.dto;

import java.util.List;

public class CardDTO {

    int id;
    int multiVerseId;
    String name;
    int cmc;
    List<String> cost;
    List<String> identity;
    String power;
    String toughness;
    List<TypeDTO> superTypes;
    List<TypeDTO> types;
    List<TypeDTO> subTypes;
    List<IAbilityDTO> abilities;

    public CardDTO(int multiVerseId, String name, int cmc, List<String> cost, List<String> identity, String power, String toughness, List<TypeDTO> superTypes, List<TypeDTO> types, List<TypeDTO> subTypes, List<IAbilityDTO> abilities) {
        this.multiVerseId = multiVerseId;
        this.name = name;
        this.cmc = cmc;
        this.cost = cost;
        this.identity = identity;
        this.power = power;
        this.toughness = toughness;
        this.superTypes = superTypes;
        this.types = types;
        this.subTypes = subTypes;
        this.abilities = abilities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMultiVerseId() {
        return multiVerseId;
    }

    public void setMultiVerseId(int multiVerseId) {
        this.multiVerseId = multiVerseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCmc() {
        return cmc;
    }

    public void setCmc(int cmc) {
        this.cmc = cmc;
    }

    public List<String> getCost() {
        return cost;
    }

    public void setCost(List<String> cost) {
        this.cost = cost;
    }

    public List<String> getIdentity() {
        return identity;
    }

    public void setIdentity(List<String> identity) {
        this.identity = identity;
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

    public List<TypeDTO> getSuperTypes() {
        return superTypes;
    }

    public void setSuperTypes(List<TypeDTO> superTypes) {
        this.superTypes = superTypes;
    }

    public List<TypeDTO> getTypes() {
        return types;
    }

    public void setTypes(List<TypeDTO> types) {
        this.types = types;
    }

    public List<TypeDTO> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(List<TypeDTO> subTypes) {
        this.subTypes = subTypes;
    }

    public List<IAbilityDTO> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<IAbilityDTO> abilities) {
        this.abilities = abilities;
    }
}
