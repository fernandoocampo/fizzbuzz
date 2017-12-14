/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fo.practice.service;

import org.fo.practice.model.PlayerMistakeException;

/**
 * Fizz buzz is a group word game for children to teach them about division.
 * Players take turns to count incrementally, replacing any number divisible 
 * by three with the word "Fizz", and any number divisible by five with the 
 * word "Buzz".
 * 
 * @author Fernando.Ocampo
 */
public interface FizzBuzzGame {
    
    /**
     * Player's play where some mechanism gives the next number in the sequence 
     * and the user gives a value that indicates if that next number is fizz, 
     * buzz or just the number.
     * 
     * @param nextnumber next number in the sequence.
     * @param playervalue the value given by the player to indicate if the next 
     * number is a normal number, Fizz or Buzz.
     * @return the given next number.
     * @throws PlayerMistakeException if the player made a mistake with the
     * playervalue.
     */
    int play(int nextnumber, String playervalue) 
        throws PlayerMistakeException;
    
}
