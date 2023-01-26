package com.factoriaf5.rps.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {

    Player player1;
    Player player2;
    Game game;

    public GameTest() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.game = new Game(player1, player2);
    }

    @Test
    public void test_game_init_with_two_players() {
        assertTrue(game.getPlayer1() instanceof Player);
        assertTrue(game.getPlayer2() instanceof Player);
    }

    @Test
    public void test_game_player1_choose_rock_player2_choose_scissors() {
        Figure rock = game.player1.choose("Rock");
        Figure scissors = game.player2.choose("Scissors");
        assertTrue(rock instanceof Rock);
        assertTrue(scissors instanceof Scissors);
        assertEquals("Rock", rock.getType());
        assertEquals("Scissors", scissors.getType());
    }

    @Test
    public void test_Rock_beats_Scissors() {
        game.player1.choose("Rock");
        game.player2.choose("Scissors");

        String result = game.checkWinner();

        assertEquals("Rock beats Scissors", result);

    }
}
