package org.krosanavengers.mtg.bot.boardstate;

import org.krosanavengers.mtg.bot.player.Player;

import java.util.HashMap;
import java.util.Map;

public class PriorityManager {
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
        check(player.next());
    }


}
