package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;
public class PaperTest {

    @Test
    public void test_is_a_Paper () {
       Paper paper  = new Paper();
        assertTrue(paper instanceof Paper);
        assertEquals( "Paper", paper.getType());
    }

   
}
