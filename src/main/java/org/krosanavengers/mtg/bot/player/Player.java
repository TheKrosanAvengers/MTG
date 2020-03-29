package org.krosanavengers.mtg.bot.player;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.Constant;
import org.krosanavengers.mtg.bot.boardstate.BoardState;
import org.krosanavengers.mtg.bot.boardstate.PhaseEnum;
import org.krosanavengers.mtg.bot.util.CardUtil;
import org.krosanavengers.mtg.bot.util.GsonUtil;
import org.krosanavengers.mtg.bot.util.ZoneUtil;
import org.krosanavengers.mtg.bot.zones.*;
import org.krosanavengers.mtg.exceptions.InsufficientCardsInZone;

import java.util.HashMap;
import java.util.Map;

public class Player implements Cloneable {
    @Expose
    private Map<ZoneEnum, Zone> zoneMap = new HashMap<>();
    @Expose
    private int life = 20;
    @Expose
    private Player next;
    @Expose
    private String name;
    @Expose
    private int maxHandSize = 7;
    @Expose
    private int drawStepAmount = 1;
    @Expose
    private boolean untapOnOtherPlayersTurn = false;

    public Player(final String name) {
        this.name = name;
        this.zoneMap.put(ZoneEnum.HAND, new Hand());
        this.zoneMap.put(ZoneEnum.GRAVEYARD, new Graveyard());
        this.zoneMap.put(ZoneEnum.LIBRARY, new Library());
        this.zoneMap.put(ZoneEnum.EXILE, new Exile());
        this.zoneMap.put(ZoneEnum.BATTLEFIELD, new Battlefield());
    }


    public void moveCardFromZone() {

    }

    public void check(BoardState boardState) {
        if (boardState.getCurrentPlayer() == this) {
            if (boardState.getPhaseStep().getPhaseEnum() == PhaseEnum.BEGINNING && boardState.getPhaseStep().getStepEnum() == PhaseEnum.StepEnum.UNTAP) {
                doUntapStep();
            } else if (boardState.getPhaseStep().getPhaseEnum() == PhaseEnum.BEGINNING && boardState.getPhaseStep().getStepEnum() == PhaseEnum.StepEnum.UPKEEP) {
                doUpkeep();
            } else if (boardState.getPhaseStep().getPhaseEnum() == PhaseEnum.BEGINNING && boardState.getPhaseStep().getStepEnum() == PhaseEnum.StepEnum.DRAW) {
                doDraw();
            }
        }
    }

    public void doUntapStep() {
        ZoneUtil.untapAllCards(getZone(ZoneEnum.BATTLEFIELD));
    }

    public void doUpkeep() {
    }

    public void doDraw() {
        try {
            CardUtil.playerDrawFromLibrary(this, this.drawStepAmount);
        } catch (InsufficientCardsInZone insufficientCardsInZone) {
            insufficientCardsInZone.printStackTrace();
        }
    }

    public boolean checkVictory() {
        boolean victory = false;
        if (ZoneUtil.countCardTypeInZone(this.zoneMap.get(ZoneEnum.BATTLEFIELD), Constant.landCardType) == 10) {
            victory = true;
        }
        return victory;
    }

    public void addZone(ZoneEnum zoneEnum, final Zone zone) {
        try {
            this.zoneMap.put(zoneEnum, (Zone) zone.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Zone getZone(ZoneEnum zoneEnum) {
        return this.zoneMap.get(zoneEnum);
    }

    public void startGame() {
        //Shuffle Library
        this.zoneMap.get(ZoneEnum.LIBRARY).shuffle();

        //todo muligan

        //Draw Seven
        try {
            CardUtil.playerDrawFromLibrary(this, this.maxHandSize);
        } catch (InsufficientCardsInZone insufficientCardsInZone) {
            insufficientCardsInZone.printStackTrace();
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(final int life) {
        this.life = life;
    }

    public Player getNext() {
        return this.next;
    }

    public void setNext(final Player next) {
        this.next = next;
    }

    public Map<ZoneEnum, Zone> getZoneMap() {
        return zoneMap;
    }

    public void setZoneMap(final Map<ZoneEnum, Zone> zoneMap) {
        this.zoneMap = zoneMap;
    }

    public int getMaxHandSize() {
        return this.maxHandSize;
    }

    public void setMaxHandSize(final int maxHandSize) {
        this.maxHandSize = maxHandSize;
    }

    public boolean isUntapOnOtherPlayersTurn() {
        return this.untapOnOtherPlayersTurn;
    }

    public void setUntapOnOtherPlayersTurn(final boolean untapOnOtherPlayersTurn) {
        this.untapOnOtherPlayersTurn = untapOnOtherPlayersTurn;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Player clone = new Player(this.name);
        for (ZoneEnum zoneEnum : this.zoneMap.keySet()) {
            Zone zone = this.zoneMap.get(zoneEnum);
            clone.zoneMap.put(zoneEnum, (Zone) zone.clone());
        }
        return clone;
    }


    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
