/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import java.util.ArrayList;
import java.util.Random;
import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.Deck;

/**
 *
 * @author shadowknight
 */
class BasicShuffle extends Shuffle {

    public BasicShuffle() {
    }

    @Override
    public ArrayList doIt(Deck[] decks) {
 
     for(Deck deck:decks){
          cards.addAll(deck.getCards());
       }
      Random r =  new Random();
      for(int i=0; i< 52;i++){
        int selection = r.nextInt(52);
        Card selectedCard = cards.get(selection);
        Card orginalCard = cards.get(i);
        cards.set(i,selectedCard);
        cards.set(selection, orginalCard);
      }
      
      return cards;
    }
    
    
}
