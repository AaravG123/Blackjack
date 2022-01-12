package Blackjack;

import java.util.*;
public class Player{

    ArrayList<String> playerCards;
    int playerValue;
    boolean bust;
    boolean done;


    public Player(){
        playerCards = new ArrayList<String>();
        playerValue = 0;
        bust = false;
        done = false;
    }

    public boolean getBust(){
        return bust;
    }

    public boolean getIfDone(){
        return done;
    }

    public void setIfDone(boolean input){
        done = input;
    }

    public int get_playerValue(){
        return playerValue;
    }

    public void set_playerValue(int x){
        playerValue = x;
        if(x > 21){
            bust = true;
            done = true;
        }
    }

    public void addCard(int userChoice, String card){
        
        
        playerCards.add(card);
        int cardValue = 0;

        if(card.charAt(0) == 'J' || card.charAt(0) == 'Q' || card.charAt(0) == 'K'){
            cardValue = 10;
            //System.out.println("CardValue>>> " + cardValue);

        }
        else if(card.charAt(0) == 'A'){
            if(userChoice == 11){
                cardValue = 11;
                //System.out.println("CardValue>>> " + cardValue);
            }
            else{
                cardValue = 1;
                //System.out.println("CardValue>>> " + cardValue);
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
        //System.out.println("Final CardValue>>> " + cardValue);
        playerValue = playerValue + cardValue;

        set_playerValue(playerValue);
    }


    public String toString(){
        return ("Here is your deck: " + playerCards + " Hand Value: " + playerValue);
    }



}
