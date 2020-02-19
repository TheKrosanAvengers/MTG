package org.krosanavengers.mtg.bot.boardstate;

public class PhaseStep {
    private PhaseEnum phaseEnum;
    private PhaseEnum.StepEnum stepEnum;

    public PhaseStep(PhaseEnum phaseEnum, PhaseEnum.StepEnum stepEnum) {
        this.phaseEnum = phaseEnum;
        this.stepEnum = stepEnum;
    }

    public PhaseEnum getPhaseEnum() {
        return phaseEnum;
    }

    public PhaseEnum.StepEnum getStepEnum() {
        return stepEnum;
    }

    public void next() {

    }
}
