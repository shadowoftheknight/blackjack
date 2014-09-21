/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.Deck;

/**
 *
 * @author lv29967
 */
public class AnotherShuffle extends Shuffle{

    @Override
    public ArrayList doIt(Deck[] decks) {
       for(Deck deck:decks){
          cards.addAll(deck.getCards());
       }
       Collections.shuffle(cards);
       
       return cards;
    }

 
    
}
