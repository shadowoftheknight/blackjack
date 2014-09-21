/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import java.util.ArrayList;
import my.delightful.project.blackjack.player.Player;
import my.delightful.project.blackjack.stack.Card;

/**
 *
 * @author shadowknight
 */
public class Dealer extends Player{

    public Dealer(ArrayList<Card> _hand, String _name) {
        super(_hand, _name);
    }
    
}
