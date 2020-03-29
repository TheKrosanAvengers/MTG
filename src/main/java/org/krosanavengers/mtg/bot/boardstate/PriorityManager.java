package org.krosanavengers.mtg.bot.boardstate;

import com.google.gson.annotations.Expose;
import org.krosanavengers.mtg.bot.player.Player;
import org.krosanavengers.mtg.bot.util.GsonUtil;

import java.util.HashMap;
import java.util.Map;

public class PriorityManager {
    @Expose
    private Map<Player, Boolean> priority = new HashMap<>();

    private BoardState boardState;

    public PriorityManager(final BoardState boardState) {
        this.boardState = boardState;
    }

    public void addPlayer(final Player... players) {
        for (Player player : players) {
            this.priority.put(player, false);
        }
    }

    public void resetPriority(final Player player) {
        for (Boolean value : this.priority.values()) {
            value = false;
        }
        check(player);
    }

    public void check(Player player) {
        player.check(this.boardState);
    }

    public void passPriority(final Player player) {
        this.priority.put(player, true);
        check(player.getNext());
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);

    }



}
