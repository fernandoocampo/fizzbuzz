/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fo.practice.service.impl;

import org.fo.practice.model.PlayerMistakeException;
import org.fo.practice.service.FizzBuzzGame;

/**
 * Mades a basic implementation of {@link FizzBuzzGame} 
 * @author Fernando.Ocampo
 */
public class BasicFizzBuzzGame implements FizzBuzzGame {

    /**
     * Basic implementation of FizzBuzz game.
     * 
     * @see FizzBuzzGame#play(java.lang.Integer, java.lang.String) 
     * @throws PlayerMistakeException if the player mades a mistake.
     */
    @Override
    public int play(int nextnumber, String playervalue) throws PlayerMistakeException {
        return nextnumber;
    }
    
}
