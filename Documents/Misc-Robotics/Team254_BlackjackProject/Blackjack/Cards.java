package Blackjack;


import java.util.ArrayList;


public class Cards {
    private static ArrayList<String> cardDeck;

    public Cards(){
        cardDeck = new ArrayList<String>();

        for(int i = 2; i <= 10; i++){
            cardDeck.add(i + "Clubs");
        }
        cardDeck.add("J" + "Clubs");
        cardDeck.add("Q" + "Clubs");
        cardDeck.add("K" + "Clubs");
        cardDeck.add("A" + "Clubs");

        for(int i = 2; i <= 10; i++){
            cardDeck.add(i + "Hearts");
        }
        cardDeck.add("J" + "Hearts");
        cardDeck.add("Q" + "Hearts");
        cardDeck.add("K" + "Hearts");
        cardDeck.add("A" + "Hearts");
        for(int i = 2; i <= 10; i++){
            cardDeck.add(i + "Diamonds");
        }
        cardDeck.add("J" + "Diamonds");
        cardDeck.add("Q" + "Diamonds");
        cardDeck.add("K" + "Diamonds");
        cardDeck.add("A" + "Diamonds");
        for(int i = 2; i <= 10; i++){
            cardDeck.add(i + "Spades");
        }
        cardDeck.add("J" + "Spades");
        cardDeck.add("Q" + "Spades");
        cardDeck.add("K" + "Spades");
        cardDeck.add("A" + "Spades");

        shuffle();

    }//Constructor

    public String topCard(){
        String topCard = cardDeck.get(0);
        //cardDeck.remove(0);
        return topCard;
    }

    public void removeTopCard(){
        cardDeck.remove(0);
    }

    public static void shuffle(){
        ArrayList<Integer> randList = new ArrayList<Integer>();
        while(randList.size() < 52){
            int randomInt = (int)(52*Math.random());
            //System.out.println(randomInt);
            if(!randList.contains(randomInt)){
                randList.add(randomInt);
            }
        }
        //System.out.println(randList);

        for(int i = 0; i < randList.size(); i++){
            int index = randList.get(i);
            cardDeck.set(i, cardDeck.get(index));
        }
    }

    public ArrayList<String> get_deck(){
        return cardDeck;
    }
}