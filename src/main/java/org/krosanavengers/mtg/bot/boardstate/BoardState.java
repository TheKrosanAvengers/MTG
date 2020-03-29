package org.krosanavengers.mtg.bot.boardstate;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.player.Player;
import org.krosanavengers.mtg.bot.util.GsonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardState {
    @Expose
    int depth;
    @Expose
    List<Player> players;
    @Expose
    Stack stack;
    @Expose
    PriorityManager priorityManager;
    @Expose
    PhaseStep phaseStep;
    @Expose
    Player currentPlayer;
    @Expose
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
        return toJson();
    }

    public String toJson() {
        return GsonUtil.toJson(this);
    }
}