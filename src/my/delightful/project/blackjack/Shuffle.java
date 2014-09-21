/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import java.util.ArrayList;
import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.Deck;

/**
 *
 * @author shadowknight
 */
abstract class Shuffle {
     ArrayList<Card> cards = new ArrayList<>(52);
     
    static Shuffle getType(int i) {
        return new BasicShuffle();
    }
    
    public abstract ArrayList doIt(Deck[] decks);
    
    
    
}
