package org.krosanavengers.mtg.bot.boardstate;

public class PhaseStep {
    private PhaseEnum phaseEnum;
    private PhaseEnum.StepEnum stepEnum;

    public PhaseStep(PhaseEnum phaseEnum, PhaseEnum.StepEnum stepEnum) {
        this.phaseEnum = phaseEnum;
        this.stepEnum = stepEnum;
    }

    public PhaseEnum getPhaseEnum() {
        return this.phaseEnum;
    }

    public PhaseEnum.StepEnum getStepEnum() {
        return this.stepEnum;
    }

    public void next() {
        //todo
    }
}
