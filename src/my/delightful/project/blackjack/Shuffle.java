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
    
     Shuffle(){
         System.out.println("Shuffle Type " + this.getClass().getSimpleName());
     }
    static Shuffle getType(int i) {
        switch(i){
            case 1:return new BasicShuffle();
            case 2:return new AnotherShuffle();
            default:
                return new BasicShuffle();
             
        }
        
    }
    
    public abstract ArrayList doIt(Deck[] decks);
    
    
    
}
