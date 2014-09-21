/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.delightful.project.blackjack.stack;

import my.delightful.project.blackjack.suites.Suite;

/**
 *
 * @author shadowknight
 */
public class Card {
    CardType cardType = null;
    Suite suite = null;
    
    public Card(CardType _cardType,Suite _suite){
        this.cardType = _cardType;
        this.suite = _suite;
    }
    
    public int getValue(){
        int value = 0;
        
        switch(cardType){
            case KING: value = 10;
                break;
            case QUEEN: value = 10;
                break;
            case JACK: value = 10;
                break;
            case ACE: value = 10;
                break;
            case TWO: value = 2;
                break;
            case THREE: value = 3;
                break;
            case FOUR: value = 4;
                break;
            case FIVE: value = 5;
                break;
            case SIX: value = 6;
                break;
            case SEVEN: value = 7;
                break;
            case EIGHT: value = 8;
                break;
            case NINE: value = 9;
                break;
            case TEN: value = 10;
                break;
            default:
                throw new AssertionError(cardType.name());
            
        }
        
        
        return value;
    }

    public int getDNA(){
        int value = 0;
        
        switch(cardType){
            case KING: value = 10 ;
                break;
            case QUEEN: value = 10;
                break;
            case JACK: value = 10;
                break;
            case ACE: value = 1;
                break;
            case TWO: value = 2;
                break;
            case THREE: value = 3;
                break;
            case FOUR: value = 4;
                break;
            case FIVE: value = 5;
                break;
            case SIX: value = 6;
                break;
            case SEVEN: value = 7;
                break;
            case EIGHT: value = 8;
                break;
            case NINE: value = 9;
                break;
            case TEN: value = 10;
                break;
            default:
                throw new AssertionError(cardType.name());
            
        }
        
        
        return value * suite.hashCode();
    }
        
    public String getName() {
        return cardType.name() + " of " + this.suite.getName();
    }

    @Override
    public int hashCode() {
        int hash = getDNA();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return true;
    }
    
    
}
