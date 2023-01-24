package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {

    @Test
    public void test_is_a_Rock () {
        Rock rock = new Rock();
        assertTrue(rock instanceof Rock);
        assertEquals( "Rock", rock.getType());
    }

   
}
