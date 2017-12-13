/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fo.practice.model;

/**
 * This exception indicates that the player made a mistake in the fizzbuzz count.
 * 
 * @author Fernando.Ocampo
 */
public class PlayerMistakeException extends Exception {

    public PlayerMistakeException() {
    }

    public PlayerMistakeException(String message) {
        super(message);
    }
    
}
