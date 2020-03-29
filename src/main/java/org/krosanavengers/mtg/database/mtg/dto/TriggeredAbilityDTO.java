package org.krosanavengers.mtg.database.mtg.dto;

public class TriggeredAbilityDTO extends IAbilityDTO {

    String trigger;

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
}
