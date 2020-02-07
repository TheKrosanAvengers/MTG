package com.company;

import com.company.cards.Card;
import com.company.cards.CardBuilder;
import com.company.player.Player;
import com.company.util.CardUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Card land = new CardBuilder("Land").setTypes("Land").build();
        Card smlCreature = new CardBuilder("Small Creature").setTypes("Creature").setCost("1").setPower(1).setToughness(1).build();
        Card medCreature = new CardBuilder("Medium Creature").setTypes("Creature").setCost("2").setPower(1).setToughness(2).build();
        Card lgCreature = new CardBuilder("Large Creature").setTypes("Creature").setCost("3").setPower(2).setToughness(2).build();

        List<Card> deck = new ArrayList<>();


        Player p1 = new Player();
        CardUtil.insertCardCopies(p1.library, land, 10);
        CardUtil.insertCardCopies(p1.library, smlCreature, 5);
        CardUtil.insertCardCopies(p1.library, medCreature, 4);
        CardUtil.insertCardCopies(p1.library, lgCreature, 3);
        p1.library.shuffle();

        Player p2 = new Player();
        CardUtil.insertCardCopies(p2.library, land, 10);
        CardUtil.insertCardCopies(p2.library, smlCreature, 5);
        CardUtil.insertCardCopies(p2.library, medCreature, 4);
        CardUtil.insertCardCopies(p2.library, lgCreature, 3);
        p2.library.shuffle();

        Bot bot = new Bot(p1, p2);
        bot.start();

    }
}
