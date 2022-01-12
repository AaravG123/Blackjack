package Blackjack;

import java.util.*;



public class Dealer{

    ArrayList<String> dealerCards;
    int dealerValue;
    boolean bust;
    boolean done;

    public Dealer(){
        dealerCards = new ArrayList<String>();
        dealerValue = 0;
        bust = false;
        done = false;
    }

    public boolean getIfDone(){
        return done;
    }

    public boolean getBust(){
        return bust;
    }

    public int get_dealerValue(){
        return dealerValue;
    }

    public void set_dealerValue(int x){
        dealerValue = x;
        if(dealerValue > 21){
            bust = true;
            done = true;
        }
    }

    public void setIfDone(boolean input){
        done = input;
    }

    public void addCard(String card){
        
        
        dealerCards.add(card);
        int cardValue = 0;

        if(card.charAt(0) == 'J' || card.charAt(0) == 'Q' || card.charAt(0) == 'K'){
            cardValue = 10;
        }
        else if(card.charAt(0) == 'A'){
            if(dealerValue <= 10){
                cardValue = 11;
            }
        }
        else if(card.charAt(0) == '2'){
            cardValue = 2;   
        }
        else if(card.charAt(0) == '3'){
            cardValue = 3;   
        }
        else if(card.charAt(0) == '4'){
            cardValue = 4;   
        }
        else if(card.charAt(0) == '5'){
            cardValue = 5;   
        }
        else if(card.charAt(0) == '6'){
            cardValue = 6;   
        }
        else if(card.charAt(0) == '7'){
            cardValue = 7;   
        }
        else if(card.charAt(0) == '8'){
            cardValue = 8;   
        }
        else if(card.charAt(0) == '9'){
            cardValue = 9;   
        }
        else {
            cardValue = 10;   
        }
        

        dealerValue = dealerValue + cardValue;
        set_dealerValue(dealerValue);
    }


    


    public String toString(){
        return ("Here is the dealer's deck: " + dealerCards + " Hand Value: " + dealerValue);
    }




}