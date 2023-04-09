package com.factoriaf5.rps.application;
import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Player;


public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String whoWin(Figure figure1, Figure figure2) {
        if (figure1.getType().equals(figure2.getType())) {
            return "players draws using " + figure1.getType() + " vs " + figure2.getType();
        } else if (figure1.getType().equals("Rock")) {
            if (figure2.getType().equals("Scissors")) {
                return "player1 wins using " + figure1.getType() + " vs " + figure2.getType();
            } else {
                return "player2 wins using " + figure2.getType() + " vs " + figure1.getType();
            }
        } else if (figure1.getType().equals("Paper")) {
            if (figure2.getType().equals("Rock")) {
                return "player1 wins using " + figure1.getType() + " vs " + figure2.getType();
            } else {
                return "player2 wins using " + figure2.getType() + " vs " + figure1.getType();
            }
        } else { // Scissors
            if (figure2.getType().equals("Paper")) {
                return "player1 wins using " + figure1.getType() + " vs " + figure2.getType();
            } else {
                return "player2 wins using " + figure2.getType() + " vs " + figure1.getType();
            }
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
