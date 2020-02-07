package com.main;

public interface Constant {
    String cardName = "[card name]";
    int PlayerStartingHandSize = 7;
    int PlayerLandPerTurn = 1;
    boolean FirstTurnDraw = true;
    String betweenQuotes = "\"(.*?)\"";

    String sqliteURL = "jdbc:sqlite:AllPrintings.sqlite";
    String h2URL = "jdbc:h2:tcp://localhost/mtg";
}
