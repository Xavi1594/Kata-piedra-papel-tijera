package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Player;

public class Game {

<<<<<<< HEAD
    public Game() {
        
    }
     
=======
    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String checkWinner() {
        return null;
    }

>>>>>>> 2a7552ce60fb4193a337f3c70c4afe3f3974647d
}
