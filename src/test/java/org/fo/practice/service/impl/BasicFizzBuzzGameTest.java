/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fo.practice.service.impl;

import org.fo.practice.model.PlayerMistakeException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando.Ocampo
 */
public class BasicFizzBuzzGameTest {
    
    public BasicFizzBuzzGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible by 3 the user gives the word: FIZZ.
     */
    @Test
    public void do_play_fizzbuzz_with_fizz() throws Exception {
        System.out.println("play with a number that must be fizz");
        int nextnumber = 3;
        String playervalue = "FIZZ";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        int expResult = 3;
        int result = instance.play(nextnumber, playervalue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible by 5 the user gives the word: BUZZ.
     */
    @Test
    public void do_play_fizzbuzz_with_buzz() throws Exception {
        System.out.println("play with a number that must be buzz");
        int nextnumber = 5;
        String playervalue = "BUZZ";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        int expResult = 5;
        int result = instance.play(nextnumber, playervalue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible by 5 and 3 the user gives the word: FIZ BUZZ.
     */
    @Test
    public void do_play_fizzbuzz_with_fizzbuzz() throws Exception {
        System.out.println("play with a number that must be fizz buzz");
        int nextnumber = 15;
        String playervalue = "FIZZ BUZZ";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        int expResult = 15;
        int result = instance.play(nextnumber, playervalue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is not divisible by 5 neither 3 the user must give the 
     * number value as it comes.
     */
    @Test
    public void do_play_fizzbuzz_with_number() throws Exception {
        System.out.println("play with a number that must not be buzz neither fizz");
        int nextnumber = 4;
        String playervalue = "4";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        int expResult = 4;
        int result = instance.play(nextnumber, playervalue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible 3 the user must give the value FIZZ and not
     * a number.
     */
    @Test
    public void do_play_fizzbuzz_with_number_when_fizz_expected() throws Exception {
        System.out.println("play with a number that must be fizz and user gave a number");
        int nextnumber = 6;
        String playervalue = "6";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        try {
            int result = instance.play(nextnumber, playervalue);
            fail("a PlayerMistakeException must be threw because it must be FIZZ but it was not, it returned " + result + " instead");
        } catch(PlayerMistakeException pmex) {
            assertTrue(true);
        }
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible 3 the user must give the value FIZZ and not
     * BUZZ.
     */
    @Test
    public void do_play_fizzbuzz_with_buzz_when_fizz_expected() throws Exception {
        System.out.println("play with a number that must be fizz and user gave a buzz");
        int nextnumber = 6;
        String playervalue = "BUZZ";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        try {
            int result = instance.play(nextnumber, playervalue);
            fail("a PlayerMistakeException must be threw because it must be FIZZ but it was not, it returned " + result + " instead");
        } catch(PlayerMistakeException pmex) {
            assertTrue(true);
        }
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible by 5 and the user must give the value BUZZ
     * and not another value.
     */
    @Test
    public void do_play_fizzbuzz_with_number_when_buzz_expected() throws Exception {
        System.out.println("play with a number that must be buzz and user gave a number");
        int nextnumber = 10;
        String playervalue = "10";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        try {
            int result = instance.play(nextnumber, playervalue);
            fail("a PlayerMistakeException must be threw because it must be BUZZ but it was not, it returned " + result + " instead");
        } catch(PlayerMistakeException pmex) {
            assertTrue(true);
        }
    }
    
    /**
     * Test of play method, of class BasicFizzBuzzGame. To make sure that when
     * the next number is divisible 5 the user must give the value BUZZ and not
     * BUZZ.
     */
    @Test
    public void do_play_fizzbuzz_with_fizz_when_buzz_expected() throws Exception {
        System.out.println("play with a number that must be buzz and user gave a fizz");
        int nextnumber = 6;
        String playervalue = "BUZZ";
        BasicFizzBuzzGame instance = new BasicFizzBuzzGame();
        try {
            int result = instance.play(nextnumber, playervalue);
            fail("a PlayerMistakeException must be threw because it must be BUZZ but it was not, it returned " + result + " instead");
        } catch(PlayerMistakeException pmex) {
            assertTrue(true);
        }
    }
    
}
