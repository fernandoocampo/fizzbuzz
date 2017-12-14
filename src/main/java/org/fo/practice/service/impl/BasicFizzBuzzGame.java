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
    
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZBUZZ = "fizzbuzz";

    /**
     * Basic implementation of FizzBuzz game.
     * 
     * @see FizzBuzzGame#play(java.lang.Integer, java.lang.String) 
     * @throws PlayerMistakeException if the player mades a mistake.
     */
    @Override
    public int play(int nextnumber, String playervalue) throws PlayerMistakeException {
        boolean result;
        if(playervalue == null) {
            throw new PlayerMistakeException("Please try again with a valid value");
        }
        
        String playvalue = preparePlayerValue(playervalue);
        
        
        // when it should be fizzbuzz
        if(isDivisibleBy(nextnumber,3) && isDivisibleBy(nextnumber,5)) {
            result = isFizzBuzz(nextnumber, playvalue);
        } else {
            if(isDivisibleBy(nextnumber,3)) {
                result = isFizz(nextnumber, playvalue);
            } else {
                if(isDivisibleBy(nextnumber,5)) {
                    result = isBuzz(nextnumber, playvalue);
                } else {
                    result = isValidNumber(nextnumber, playvalue);
                }
            }
        }
        
        if(!result) {
            throw new PlayerMistakeException("Given value: " + playervalue + " is not a valid answer, try again.");
        }
        
        return nextnumber;
    }
    
    /**
     * Return true if the given player value is a valid integer number.
     * 
     * @param nextnumber next number in the sequence of the game.
     * @param playervalue the given answer of the player against the next 
     * number sequence.
     * @return true if the given player value is a valid integer number.
     */
    private boolean isValidNumber(int nextnumber, String playervalue) {
        boolean result = false;
        int intvalue = Integer.parseInt(playervalue);
        if (intvalue == nextnumber) {
            result = true;
        }
        return result;
    }
    
    /**
     * Returns true if the given player value is fizz and the nextnumber is 
     * divisible by 3 and 5 as well. This implementation lowers the player 
     * input, remove left, center and right spaces and compare it with the 
     * word "fizzbuzz".
     * 
     * @param nextnumber next number in the sequence of the game.
     * @param playervalue value given by the player in her turn.
     * @return true if the given value match fizz word.
     */
    private boolean isFizzBuzz(int nextnumber, String playervalue) {
        if(isDivisibleBy(nextnumber,3) && isDivisibleBy(nextnumber,5) && 
                playervalue.equals(FIZBUZZ)) {
            return true;
        }
        return false;
    }
    
    /**
     * Returns true if the given player value is fizz and the nextnumber is 
     * divisible by 3. This implementation lowers the player input, remove left, 
     * center and right spaces and compare it with the word "fizz".
     * 
     * @param nextnumber next number in the sequence of the game.
     * @param playervalue value given by the player in her turn.
     * @return true if the given value match fizz word.
     */
    private boolean isFizz(int nextnumber, String playervalue) {
        if(isDivisibleBy(nextnumber,3) && playervalue.equals(FIZZ)) {
            return true;
        }
        return false;
    }
    
    /**
     * Returns true if the given player value is buzz and the nextnumber is 
     * divisible by 5. This implementation lowers the player input, remove left, 
     * center and right spaces and compare it with the word "buzz".
     * 
     * @param nextnumber next number in the sequence of the game.
     * @param playervalue value given by the player in her turn.
     * @return true if the given value match fizz word.
     */
    private boolean isBuzz(int nextnumber, String playervalue) {
        if(isDivisibleBy(nextnumber,5) && playervalue.equals(BUZZ)) {
            return true;
        }
        return false;
    }
    
    /**
     * Returns true if the given dividend value is divisible by the given 
     * divisor value.
     * 
     * @param nextnumber next number in the sequence of the game.
     * @return true if the given dividend value is divisible by the given 
     * divisor value.
     */
    private boolean isDivisibleBy(int dividend, int divisor) {
        return (dividend % divisor == 0);
    }

    /**
     * Removes spaces and put the player's input value in lowercase.
     * 
     * @param playervalue User's given value.
     * @return the given value in lowercase and without spaces.
     */
    private String preparePlayerValue(String playervalue) {
        
        // put player value to lowercase.
        String result = playervalue.toLowerCase();
        // remove spaces
        result = result.replaceAll("\\s","");
        return result;
    }
    
    
    
}
