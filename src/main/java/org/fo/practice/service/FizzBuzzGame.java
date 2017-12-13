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
 * by three with the word "fizz", and any number divisible by five with the 
 * word "buzz".
 * 
 * @author Fernando.Ocampo
 */
public interface FizzBuzzGame {
    
    /**
     * Player's turn to play giving the next number in the sequence and if the
     * the number is fizz or buzz.
     * 
     * @param nextnumber next number in the sequence.
     * @param playervalue the value given by the player to indicate if the next 
     * number is a normal number, Fizz or Buzz.
     * @return the given next number.
     * @throws PlayerMistakeException if the player made a mistake with the
     * playervalue.
     */
    Integer play(Integer nextnumber, String playervalue) 
        throws PlayerMistakeException;
    
}
