/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import java.util.ArrayList;
import my.delightful.project.blackjack.player.Player;
import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.Deck;
import my.delightful.project.blackjack.suites.Diamonds;

/**
 *
 * @author shadowknight
 */
public class BlackJack {

    static int NO_OF_PLAYERS = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pack pack = new Pack();
        Shuffle shuffle;

        int totalCards = pack.countCard();
        System.out.println("Pack contains " + totalCards + " cards");

        Game game = new Game(NO_OF_PLAYERS);
        shuffle = Shuffle.getType(1);

        ArrayList<Card> hand;
        Player p;
        Dealer d;
        for (int i = 0; i < NO_OF_PLAYERS; i++) { // ad one for dealer
            hand = game.dealHand(shuffle, pack, 2);

            p = new Player(hand, String.valueOf(i));
            game.addPlayer(p);

            System.out.println("Player " +p.getName() + " = " + p.showHand());

        }

        boolean canStillDeal = true;
        p = null;
        d = null;
        while (canStillDeal) {

            canStillDeal = !game.isFinished();
            
            if (canStillDeal) {
                for (int i = 0; i < NO_OF_PLAYERS; i++) {
                    p = game.getPlayer(i);
                    while (p.handValue() < 17) {
                        Card card = game.getNextCard();
                        System.out.println("player " + p.getName() + " plays again ");
              
                        p.addCard(card);
                        if(p.handValue() > 21){
                            System.out.println("player " + p.getName() + " bust " + p.showHand());
                         }else{
                             System.out.println(p.showHand());
                        }
                    }
                }
            }

        }

    }

}
