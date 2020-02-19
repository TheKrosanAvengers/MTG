package org.krosanavengers.mtg.bot.player;

import org.krosanavengers.mtg.bot.boardstate.BoardState;
import org.krosanavengers.mtg.bot.zones.Zone;
import org.krosanavengers.mtg.bot.zones.ZoneEnum;

import java.util.HashMap;
import java.util.Map;

public class Player {
    public Map<ZoneEnum, Zone> zoneMap = new HashMap<>();
    public int life = 20;
    Player next;

    public Player(Player next) {

    }


    public void moveCardFromZone() {

    }

    public void check(BoardState boardState) {

    }

    public Player next() {
        return next;
    }
}
