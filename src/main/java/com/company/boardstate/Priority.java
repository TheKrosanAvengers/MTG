package com.company.boardstate;

import com.company.player.Player;

import java.util.HashMap;
import java.util.Map;

public class Priority {
    Map<Player, Boolean> priority = new HashMap<>();

    public void addPlayer(Player... players) {
        for (Player player : players) {
            priority.put(player, false);
        }
    }

    public void resetPriority(Player player) {

    }

    public void
}
