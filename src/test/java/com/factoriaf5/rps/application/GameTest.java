package com.factoriaf5.rps.application;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;



public class GameTest {
    
    Player player1 = new Player();
    Player player2 = new Player();
    Game game = new Game(player1, player2);

    @Test
    public void game_start_with_2_players() {
        assertEquals(true, game.getPlayer1() instanceof Player);
        assertEquals(true, game.getPlayer2() instanceof Player);
    }

    @Test
    public void player1_chooses_paper_and_player2_chooses_rock() {
        Figure rock = player2.choose("rock");
        Figure paper = player1.choose("paper");

        assertTrue(rock instanceof Rock);
        assertTrue(paper instanceof Paper);
    }


    @Test
    public void ckecked_type_scissors(){
        Scissors scissors = new Scissors();
        assertEquals("scissors", scissors.getType());
    }

    @Test public void paper_win_rock(){
        player1.setFigure(player1.choose("paper"));
        player2.setFigure(player2.choose("rock"));
        assertEquals("player2 wins using rock vs paper", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    
    @Test public void paper_loss_scissors(){
        player1.setFigure(player1.choose("paper"));
        player2.setFigure(player2.choose("scissors"));
        assertEquals("player2 wins using scissors vs paper", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void paper_draw_paper(){
        player1.setFigure(player1.choose("paper"));
        player2.setFigure(player2.choose("paper"));
        assertEquals("players draws using paper vs paper", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void rock_win_scissors(){
        player1.setFigure(player1.choose("rock"));
        player2.setFigure(player2.choose("scissors"));
        assertEquals("player2 wins using scissors vs rock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void rock_loss_paper(){
        player1.setFigure(player1.choose("rock"));
        player2.setFigure(player2.choose("paper"));
        assertEquals("player2 wins using paper vs rock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void rock_draw_rock(){
        player1.setFigure(player1.choose("rock"));
        player2.setFigure(player2.choose("rock"));
        assertEquals("players draws using rock vs rock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void scissors_win_paper(){
        player1.setFigure(player1.choose("scissors"));
        player2.setFigure(player2.choose("paper"));
        assertEquals("player2 wins using paper vs scissors", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void scissors_loss_rock(){
        player1.setFigure(player1.choose("scissors"));
        player2.setFigure(player2.choose("rock"));
        assertEquals("player2 wins using rock vs scissors", game.whoWin(player1.getFigure(), player2.getFigure()));
    }
    @Test public void scissors_draw_scissors(){
        player1.setFigure(player1.choose("scissors"));
        player2.setFigure(player2.choose("scissors"));
        assertEquals("players draws using scissors vs scissors", game.whoWin(player1.getFigure(), player2.getFigure()));
    }
}