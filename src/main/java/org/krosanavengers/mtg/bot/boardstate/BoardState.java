package org.krosanavengers.mtg.bot.boardstate;

import org.krosanavengers.mtg.bot.player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardState {
    int depth;
    List<Player> players;
    Stack stack;
    PriorityManager priorityManager;
    PhaseStep phaseStep;
    Player currentPlayer;
    Player startingPlayer;

    public BoardState(Player... players) {
        this.priorityManager = new PriorityManager(this);
        this.phaseStep = new PhaseStep(PhaseEnum.BEGINNING, PhaseEnum.StepEnum.UNTAP);
        this.players = new ArrayList<>();
        this.players.addAll(Arrays.asList(players));
        this.startingPlayer = players[0];
        this.currentPlayer = this.startingPlayer;
        this.stack = new Stack();
    }

    public void prepare() {
        for (Player player : this.players) {
            player.startGame();
        }
    }

    @Override
    public String toString() {
        String str = "BoardState{ Players{ ";
        for (Player player : players) {
            str += player.toString();
        }
        str += "} }";
        return str;
    }
}