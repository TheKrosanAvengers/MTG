package org.krosanavengers.mtg.bot.boardstate;

import org.krosanavengers.mtg.bot.player.Player;

import java.util.ArrayList;
import java.util.List;

public class BoardState {
    int depth;
    List<Player> players;
    Stack stack;
    PriorityManager priorityManager;
    PhaseStep phaseStep = new PhaseStep(PhaseEnum.BEGINNING, PhaseEnum.StepEnum.UNTAP);
    Player currentPlayer;

    public BoardState(Player... players) {
        priorityManager = new PriorityManager(this);
        this.players = new ArrayList();
        for (Player player : players) {
            this.players.add(player);
        }
        stack = new Stack();
    }
}