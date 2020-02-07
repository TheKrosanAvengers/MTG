package com.company.player;

import com.company.zones.*;

public class Player {
    public Hand hand = new Hand();
    public Battlefield battlefield = new Battlefield();
    public Library library = new Library();
    public Graveyard graveyard = new Graveyard();
    public Exile exile = new Exile();
    public Command command = new Command();
    public int life = 20;

    public Player() {

    }


}
