package com.company;

import com.company.cards.Card;
import com.company.player.Player;
import com.company.util.CardUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bot {
    int playerIndex = 0;
    int turn = 0;
    List<Player> players = new ArrayList<>();

    public Bot(Player... players) {
        this.players = Arrays.asList(players);
    }

    public void start() {
        System.out.println("=== Draw ===");
        for (Player player1 : players) {
            System.out.println("\nPlayer " + playerIndex);
            List<Card> hand = new ArrayList<>();
            hand.add(player1.library.popTop());
            hand.add(player1.library.popTop());
            hand.add(player1.library.popTop());
            hand.add(player1.library.popTop());
            hand.add(player1.library.popTop());
            hand.add(player1.library.popTop());
            hand.add(player1.library.popTop());
            player1.hand.putOnTop(hand);

        }

        System.out.println("=== Start Game ===");
        boolean play = true;
        while (play) {
            Player player = players.get(playerIndex);
            System.out.println("=== Start Player " + playerIndex + " Draw ===");
            player.hand.putOnTop(player.library.popTop());

            System.out.println("=== Start Player " + playerIndex + " Main 1 ===");
            Card land = CardUtil.getLand(player.hand);
            if (land != null) {
                System.out.println("Playing land");
                player.battlefield.putOnTop(land);
            }

            System.out.println("=== Start Player " + playerIndex + " Combat ===");

            System.out.println("=== Start Player " + playerIndex + " Main 2 ===");

            System.out.println("=== Start Player " + playerIndex + " End ===");

            incrementTurn();
            if (turn > 10) {
                play = false;
            }
        }

    }

    public void incrementTurn() {
        playerIndex++;
        if (playerIndex >= players.size()) {
            playerIndex = 0;
            turn++;
        }
    }
}
