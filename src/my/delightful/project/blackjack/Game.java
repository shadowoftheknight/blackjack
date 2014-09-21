/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import my.delightful.project.blackjack.player.Player;
import my.delightful.project.blackjack.stack.Card;
import my.delightful.project.blackjack.stack.Deck;

/**
 *
 * @author shadowknight
 */
class Game {
    private boolean shuffled,finished;
    private ArrayList<Card> cards = new ArrayList(52);
    private ArrayList<Player> players;
    private int numberOfCards;
    Shuffle shuffle; Pack[] packs;
    
   
    Game(int NO_OF_PLAYERS, int NO_OF_PACKS, int TYPE_OF_SHUFFLE) {
        this.players = new ArrayList(NO_OF_PLAYERS);
        shuffle = Shuffle.getType(TYPE_OF_SHUFFLE);
        packs = new Pack[NO_OF_PACKS];
        for(int i =0; i < NO_OF_PACKS; i++ ){
            packs[i]=new Pack();
        }
    }
    Card dealCard(Shuffle shuffle, Pack[] packs, int numberOfCards) {
        numberOfCards = this.numberOfCards;
       
        if(shuffled == false){
            for(Pack p:packs){
                cards.addAll( shuffle.doIt(p.getDecks()));
                Collections.shuffle(cards);
            }
            System.out.println("Shuffled " + cards.size() + " cards");
            shuffled = true;
        }
        
        return dealCard();
    }
    
    public Card dealCard() {
        Card card = cards.get(0); // from the top of the deck
        cards.remove(0);
        return card;
    }

    public ArrayList<Card> dealHand(int _i) {
       ArrayList<Card> hand =  new ArrayList(numberOfCards);
       for(int i=0; i < _i;i++){
           hand.add(dealCard(shuffle,packs,_i));
       }
       return hand;
    }

    void addPlayer(Player p) {
        
        boolean add = players.add(p);
    }

    Card getNextCard() {
        return dealCard();
    }

    Player getPlayer(int i) {
      return  players.get(i);
    }

    boolean isFinished() {
        
        int diff[] = new int[players.size()];
        int winner = 21;
        for(int i=0; i<diff.length; i++){
          Player p = players.get(i);
          if(p.handValue() < 17){
              return false;
          }else{
              if(p.handValue()>21){
                diff[i] =  p.handValue();
              }else{
                diff[i] = winner - p.handValue();
              }
          }
        }
        int min = 21;
        int winnerPlayer = 1;
        for(int i =0; i < diff.length; i++){
            if(diff[i]==0){
                System.out.println("Winner is player " + 
                        players.get(i).getName() + 
                        " with hand " +  players.get(i).showHand());
                winnerPlayer = 0;
            }else{
                if( diff[i] < min){
                    min = diff[i];
                }
            }
        }
        if(winnerPlayer == 1)
        for(int i =0; i < diff.length; i++){
            if(diff[i]== min ){
                System.out.println("Winner is player " + 
                        players.get(i).getName() + 
                        " with hand " +  players.get(i).showHand() + " diff " + diff[i]);
            }
        }        
        return true;
    }



    
}
