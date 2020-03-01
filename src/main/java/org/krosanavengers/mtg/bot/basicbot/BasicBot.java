package org.krosanavengers.mtg.bot.basicbot;

import org.krosanavengers.mtg.bot.boardstate.BoardState;
import org.krosanavengers.mtg.bot.cards.Card;
import org.krosanavengers.mtg.bot.cards.CardBuilder;
import org.krosanavengers.mtg.bot.player.Player;
import org.krosanavengers.mtg.bot.util.CardUtil;
import org.krosanavengers.mtg.bot.zones.Library;
import org.krosanavengers.mtg.bot.zones.ZoneEnum;

public class BasicBot {

    public static void main(String[] args) throws CloneNotSupportedException {

        Card forest = new CardBuilder("Forest").setSuperTypes("Basic").setTypes("Land").setTypes(
                "Forest").setCost("{0}").build();

        //5x
        Card dionsAcolyteCard =
                new CardBuilder("Dions Acolyte").setCost("{1}").setTypes("Creature").setSubTypes("Human").setPower(1).setToughness(1).build();

        //9x
        Card adrianosPetBoar =
                new CardBuilder("Adrianos Pet Boar").setCost("{2}").setTypes("Creature").setSubTypes("Boar").setPower(2).setToughness(2).build();

        //8x
        Card dionElk =
                new CardBuilder("Dions Elk").setCost("{3}").setTypes("Creature").setSubTypes("Elk").setPower(3).setToughness(3).build();

        //4x
        Card adrianosHangryBoar =
                new CardBuilder("Adrianos Hangry Boar").setCost("{4}").setTypes(
                        "Creature").setSubTypes("Boar").setPower(4).setToughness(4).build();

        //3x
        Card dionsDragon =
                new CardBuilder("Dions Dragon").setCost("{5}").setTypes(
                        "Creature").setSubTypes("Dragon").setPower(5).setToughness(5).build();

        //3x
        Card adrianosTerrastompoer =
                new CardBuilder("Adrianos Terrastomper").setCost("{6}").setTypes(
                        "Creature").setSubTypes("Beast").setPower(6).setToughness(6).build();

        //2x
        Card dionsHydra =
                new CardBuilder("Dions Hydra").setCost("{7}").setTypes(
                        "Creature").setSubTypes("Hydra").setPower(7).setToughness(7).build();

        //1x
        Card calmDev =
                new CardBuilder("The Calm Dev").setCost("{8}").setSubTypes("Legendary").setTypes(
                        "Creature").setSubTypes("Human", "Wizard").setPower(8).setToughness(8).build();

        //1x
        Card angryDev =
                new CardBuilder("The Angry Dev").setCost("{10}").setSubTypes("Legendary").setTypes(
                        "Creature").setSubTypes("Human", "Barbarian").setPower(10).setToughness(10).build();


        Player player1 = new Player("Adriano");

        Library libraryZone = new Library();
        CardUtil.insertCardCopies(libraryZone, dionsAcolyteCard, 5);
        CardUtil.insertCardCopies(libraryZone, adrianosPetBoar, 9);
        CardUtil.insertCardCopies(libraryZone, dionElk, 8);
        CardUtil.insertCardCopies(libraryZone, adrianosHangryBoar, 4);
        CardUtil.insertCardCopies(libraryZone, dionsDragon, 3);
        CardUtil.insertCardCopies(libraryZone, adrianosTerrastompoer, 3);
        CardUtil.insertCardCopies(libraryZone, dionsHydra, 2);
        CardUtil.insertCardCopies(libraryZone, calmDev, 1);
        CardUtil.insertCardCopies(libraryZone, angryDev, 1);
        CardUtil.insertCardCopies(libraryZone, forest, 24);

        player1.addZone(ZoneEnum.LIBRARY, libraryZone);

        Player player2 = (Player) player1.clone();
        player2.setName("Dion");

        player1.setNext(player2);


        //THE MEAT AND POTATOS
        BoardState boardState = new BoardState(player1, player2);

        boardState.prepare();

        System.out.println(boardState.toString());
    }
}
