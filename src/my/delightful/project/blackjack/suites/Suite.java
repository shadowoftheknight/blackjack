/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack.suites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.CardType;
import static my.delightful.project.blackjack.stack.CardType.EIGHT;
import static my.delightful.project.blackjack.stack.CardType.FIVE;
import static my.delightful.project.blackjack.stack.CardType.FOUR;
import static my.delightful.project.blackjack.stack.CardType.JACK;
import static my.delightful.project.blackjack.stack.CardType.ACE;
import static my.delightful.project.blackjack.stack.CardType.KING;
import static my.delightful.project.blackjack.stack.CardType.NINE;
import static my.delightful.project.blackjack.stack.CardType.QUEEN;
import static my.delightful.project.blackjack.stack.CardType.SEVEN;
import static my.delightful.project.blackjack.stack.CardType.SIX;
import static my.delightful.project.blackjack.stack.CardType.TEN;
import static my.delightful.project.blackjack.stack.CardType.THREE;
import static my.delightful.project.blackjack.stack.CardType.TWO;

/**
 *
 * @author shadowknight
 */
public abstract class Suite {
    private String name;
    private String textDescription;
    Card[] cards = new Card[]{
            new Card(KING,this),
            new Card(QUEEN,this),
            new Card(JACK,this),
            new Card(ACE,this),
            new Card(TWO,this),
            new Card(THREE,this),new Card(FOUR,this),new Card(FIVE,this),new Card(SIX,this),new Card(SEVEN,this),
            new Card(EIGHT,this),new Card(NINE,this),new Card(TEN,this)};
    
    public Suite(){}
    
    public Suite(String _name){
        this.name = _name;
    }

    public int countCards() {
        int i=0;
        for(Card card:cards){
          i = i +1; 
        }
        return i;
    }

    public List<Card> getCards() {
       return Arrays.asList(cards);
    }

    public abstract String getName();
}
