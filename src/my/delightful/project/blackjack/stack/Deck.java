/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack.stack;

import java.util.ArrayList;
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
import my.delightful.project.blackjack.suites.Diamonds;
import my.delightful.project.blackjack.suites.Suite;

/**
 *
 * @author shadowknight
 */
public class Deck {
    private Suite suite = null;
    
    public Deck(Suite _suite){
        this.suite = _suite;
    }


    public int countCards() {
       return suite.countCards();
    }

    public ArrayList<Card> getCards() {
       return new ArrayList(this.suite.getCards());
    }
}
