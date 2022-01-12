package Blackjack;

//import java.util.*;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);

        Cards deck1 = new Cards();
        Dealer dealer1 = new Dealer();
        Player player1 = new Player();

        
        makeSpace();


        //Initial Dealing
        System.out.println("Here are your Cards.");
        System.out.println(player1);
        player1.addCard(distribute(deck1.topCard()), deck1.topCard());
        deck1.removeTopCard();

        dealer1.addCard(deck1.topCard());
        deck1.removeTopCard();
        //System.out.println(dealer1);
        
        System.out.println(player1);
        player1.addCard(distribute(deck1.topCard()), deck1.topCard());
        deck1.removeTopCard();

        dealer1.addCard(deck1.topCard());
        deck1.removeTopCard();
        //System.out.println(dealer1);
        

        while(player1.getIfDone() != true || dealer1.getIfDone() != true){
    //Game Starts
    //Player's turn
        if(player1.getIfDone() == false){
            String userInput = "";
            System.out.println("It is your turn");
            System.out.println(player1);
            System.out.println("Do You want to Hit or do you want to Stand?\ntype 'hit' or 'stand'.");
        //scnr.nextLine();
            userInput = scnr.next();
        //String userInput = "hit";
            System.out.println();
            if(userInput.equals("hit")){
                
                player1.addCard(distribute(deck1.topCard()), deck1.topCard());
                //System.out.println(deck1.topCard());
                deck1.removeTopCard();
                

            }
            else{
                //break;
                System.out.println();
                System.out.println("STAND");
                player1.setIfDone(true);
            }
        }
        if(dealer1.getIfDone() == false){
    //Dealer's turn
            if(dealer1.get_dealerValue() > 16){
                dealer1.setIfDone(true);
                //System.out.println(dealer1);
            }
            else{
                dealer1.addCard(deck1.topCard());
                //System.out.println(dealer1);
            }

            //System.out.println(dealer1);
        }
    }
    System.out.println(dealer1);
    System.out.println(player1);


    
    if(dealer1.getBust() == true && player1.getBust() == true){
        System.out.println("Nobody Won");
    }
    else if(dealer1.getBust() == true && player1.getBust() == false){
        System.out.println("You Win!");
    }
    else if(dealer1.getBust() == false && player1.getBust() == true){
        System.out.println("The Dealer Wins!");
    }
    
    else if(dealer1.getIfDone() == true && player1.getIfDone() == true){
        if(dealer1.get_dealerValue() > player1.get_playerValue()){
            System.out.println("The Dealer is the Winner.");
        }
        if(dealer1.get_dealerValue() < player1.get_playerValue()){
            System.out.println("You are the Winner.");
        }
        else{
            System.out.println("It was a tie! Most Likely");
        }
    }


       // scnr.close();
    }
    
    public static int distribute(String pCard){
        Scanner scan = new Scanner(System.in);
        int pChoice = 0;
        System.out.println("Here is your card " + pCard);
        if(pCard.charAt(0) == 'A'){
            System.out.println("You pulled an Ace!\nDo you want the Ace's value to be 1 or 11?");
            pChoice = scan.nextInt();
        }
        //scan.close();
        return pChoice;
    }

    public static void makeSpace(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    

    


}