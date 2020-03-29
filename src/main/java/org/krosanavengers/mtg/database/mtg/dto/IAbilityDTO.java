package org.krosanavengers.mtg.database.mtg.dto;

public abstract class IAbilityDTO {
    int id;
    String ability;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
