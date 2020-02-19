package org.krosanavengers.mtg.bot.boardstate;

public enum PhaseEnum {

    //In Reverse Order
    ENDPHASE(null, StepEnum.END, StepEnum.CLEANUP),
    SECOND_MAIN(ENDPHASE, StepEnum.MAIN),
    COMBAT(SECOND_MAIN, StepEnum.DECLARE_ATTACKERS, StepEnum.DECLARE_ATTACKERS, StepEnum.FIRST_DAMAGE, StepEnum.SECOND_DAMAGE, StepEnum.END_COMBAT),
    FIRST_MAIN(COMBAT, StepEnum.MAIN),
    BEGINNING(FIRST_MAIN, StepEnum.UNTAP, StepEnum.UPKEEP, StepEnum.DRAW);

    PhaseEnum next;
    StepEnum[] steps;

    PhaseEnum(PhaseEnum nextPhase, StepEnum... steps) {
        this.next = nextPhase;
        this.steps = steps;
    }

    public enum StepEnum {
        //In reverse order
        CLEANUP(null),
        END(CLEANUP),
        END_COMBAT(null),
        SECOND_DAMAGE(END_COMBAT),
        FIRST_DAMAGE(SECOND_DAMAGE),
        DECLARE_BLOCKS(FIRST_DAMAGE),
        DECLARE_ATTACKERS(DECLARE_BLOCKS),
        BEING_COMBAT(DECLARE_ATTACKERS),
        MAIN(null),
        DRAW(null),
        UPKEEP(DRAW),
        UNTAP(UPKEEP);

        StepEnum next;

        StepEnum(StepEnum next) {
            this.next = next;
        }
    }
}
