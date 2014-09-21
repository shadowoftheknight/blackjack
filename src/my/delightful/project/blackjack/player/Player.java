/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack.player;

import java.util.ArrayList;
import my.delightful.project.blackjack.stack.Card;

/**
 *
 * @author shadowknight
 */
public class Player {
    ArrayList<Card> hand = null;
    String name;
    public Player(ArrayList<Card> _hand,String _name) {
        this.hand = _hand;
        this.name = _name;
    }

    public String showHand() {
      StringBuilder handDesc = new StringBuilder("[ ");
        for(Card card:hand){
            handDesc.append(card.getName());
            handDesc.append(", ");
        }
        handDesc.append(" ]");
        return handDesc.append(" count is ").append(handValue()).toString() ;
    }

    public int handValue() {
        int total = 0;
        for(Card card:hand){
           total = total + card.getValue();
        }
        return total;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public String getName() {
        return name;
    }

    
}
