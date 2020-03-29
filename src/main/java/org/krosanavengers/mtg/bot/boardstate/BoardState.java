package org.krosanavengers.mtg.bot.boardstate;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.player.Player;
import org.krosanavengers.mtg.bot.util.GsonUtil;
import org.krosanavengers.mtg.bot.util.ZoneUtil;
import org.krosanavengers.mtg.bot.zones.ZoneEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardState {
    @Expose
    private int depth;
    @Expose
    private List<Player> players;
    @Expose
    private Stack stack;
    @Expose
    private PriorityManager priorityManager;
    @Expose
    private PhaseStep phaseStep;
    @Expose
    private Player currentPlayer;
    @Expose
    private Player startingPlayer;


    public BoardState(final Player... players) {
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

    public void execute(){
        for (Player player : this.players) {
            doTurn(player);
        }
        checkVictory();
//        execute();
    }

    public Player checkVictory(){
        for (Player player : this.players) {
            if(player.checkVictory()){
                return player;
            }
        }
        return null;
    }

    public void doTurn(Player player){

        if (this.phaseStep.getPhaseEnum() == PhaseEnum.BEGINNING && this.getPhaseStep().getStepEnum() == PhaseEnum.StepEnum.UNTAP){
            doUntapStep(player);

        }
    }


    public void doUntapStep(Player player){
        ZoneUtil.untapAllCards(player.getZone(ZoneEnum.BATTLEFIELD));
    }



    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Stack getStack() {
        return this.stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public PriorityManager getPriorityManager() {
        return this.priorityManager;
    }

    public void setPriorityManager(PriorityManager priorityManager) {
        this.priorityManager = priorityManager;
    }

    public PhaseStep getPhaseStep() {
        return this.phaseStep;
    }

    public void setPhaseStep(PhaseStep phaseStep) {
        this.phaseStep = phaseStep;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getStartingPlayer() {
        return startingPlayer;
    }

    public void setStartingPlayer(Player startingPlayer) {
        this.startingPlayer = startingPlayer;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}