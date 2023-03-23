package CardGame;

import java.util.ArrayList;

public class Player extends GameSystem{
    private String name;
    private int score;
    private static int round = 0;

    public ArrayList<Card> cardOnHand = new ArrayList<>();
    void draw(){
        
        shuffle();
        cardOnHand.add(deck.get(0));
        deck.remove(0);

    }

    String ShowCardOnhand(){
        String cardHand = "";
        for (Card card : cardOnHand) {
            cardHand += "[ "+ card + " ]";
        }
        return cardHand;
    }

    void discard(Card card){
        cardOnHand.remove(card);
    }
}
