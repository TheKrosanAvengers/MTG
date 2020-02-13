package com.company.player;

import com.company.boardstate.BoardState;
import com.company.zones.*;

import java.util.HashMap;
import java.util.Map;

public class Player {
    public Map<ZoneEnum,Zone> zoneMap = new HashMap<>();
    public int life = 20;
    Player next;

    public Player(Player next) {

    }


    public void moveCardFromZone(){

    }

    public void check(BoardState boardState){

    }

    public Player next() {
        return next;
    }
}
