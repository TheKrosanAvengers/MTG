package org.krosanavengers.mtg.bot.boardstate;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.player.Player;
import org.krosanavengers.mtg.bot.util.GsonUtil;

import java.util.HashMap;
import java.util.Map;

public class PriorityManager {
    @Expose
    Map<Player, Boolean> priority = new HashMap<>();

    BoardState boardState;

    public PriorityManager(BoardState boardState) {
        this.boardState = boardState;
    }

    public void addPlayer(Player... players) {
        for (Player player : players) {
            priority.put(player, false);
        }
    }

    public void resetPriority(Player player) {
        for (Boolean value : priority.values()) {
            value = false;
        }
        check(player);
    }

    public void check(Player player) {
        player.check(boardState);
    }

    public void passPriority(Player player) {
        priority.put(player, true);
        check(player.getNext());
    }

    @Override
    public String toString() {
        return toJson();
    }

    public String toJson() {
        return GsonUtil.toJson(this);
    }


}
