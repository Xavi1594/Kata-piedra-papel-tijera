package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;
public class ScissorsTest {

    @Test
    public void test_is_a_Scissors () {
    Scissors scissors  = new Scissors();
        assertTrue(scissors instanceof Scissors);
        assertEquals( "Scissors", scissors.getType());
    }

   
}
