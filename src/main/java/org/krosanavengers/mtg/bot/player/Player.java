package org.krosanavengers.mtg.bot.player;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.boardstate.BoardState;
import org.krosanavengers.mtg.bot.util.CardUtil;
import org.krosanavengers.mtg.bot.util.GsonUtil;
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

    public Player(String name) {
        this.name = name;
        this.zoneMap.put(ZoneEnum.HAND, new Hand());
        this.zoneMap.put(ZoneEnum.GRAVEYARD, new Graveyard());
        this.zoneMap.put(ZoneEnum.LIBRARY, new Library());
        this.zoneMap.put(ZoneEnum.EXILE, new Exile());
    }


    public void moveCardFromZone() {

    }

    public void check(BoardState boardState) {

    }

    public void addZone(ZoneEnum zoneEnum, Zone zone) {
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
            CardUtil.playerDrawFromLibrary(this, 7);
        } catch (InsufficientCardsInZone insufficientCardsInZone) {
            insufficientCardsInZone.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Player getNext() {
        return next;
    }

    public void setNext(Player next) {
        this.next = next;
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
        return toJson();
    }

    public String toJson() {
        return GsonUtil.toJson(this);
    }
}
