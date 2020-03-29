package org.krosanavengers.mtg.database.mtg.dto;

import java.util.List;

public class ActivatedAbilityDTO extends IAbilityDTO {

    List<String> costs;
    List<String> parameters;

    public List<String> getCosts() {
        return costs;
    }

    public void setCosts(List<String> costs) {
        this.costs = costs;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }
}
