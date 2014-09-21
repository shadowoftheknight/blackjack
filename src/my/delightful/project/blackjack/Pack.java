/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.Deck;
import my.delightful.project.blackjack.suites.Clubs;
import my.delightful.project.blackjack.suites.Diamonds;
import my.delightful.project.blackjack.suites.Hearts;
import my.delightful.project.blackjack.suites.Spades;

/**
 *
 * @author shadowknight
 */
public class Pack {
    boolean shuffled = false;
    private Deck[] decks;
    
    public Pack(){
        this.decks = null;
        
        this.decks = new Deck[]{
                    new Deck(new Diamonds()),
                    new Deck(new Clubs()),
                    new Deck(new Hearts()),
                    new Deck(new Spades())
                    };
    }

    int countCard() {
        int total = 0;
        for(Deck deck:decks){
           total = deck.countCards() + total;
        }
        return total;
    }

    Deck[] getDecks() {
        return decks;
    }

}
