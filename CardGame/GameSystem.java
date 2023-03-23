package CardGame;

import java.util.ArrayList;
import java.util.Random;

public class GameSystem {
    public ArrayList<Card> deck = new ArrayList<>();
    

    public void InitialDeck(){
        String name[] = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "King" , "Queen" , "Jack"};
        String suit[] = {"Diamond" , "Spread" , "Heart" , "Club"};
        int value[] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
        
            for (int i = 0; i < suit.length; i++) {
                for (int j = 0; j < value.length; j++) {
                    deck.add(new Card(name[j], suit[i], value[j]));
                }
            }
        
    }

    public String showDeckInfo(){
        String info = "";
        for (Card card : deck) {
            info += "[ " + card + " ]\n";
        }
        return info;
    }

    public void shuffle() {
        ArrayList<Card> temp = new ArrayList<Card>();
        while(!deck.isEmpty()) {
            int loc=(int)(Math.random()*deck.size());
            temp.add(deck.get(loc));
            deck.remove(loc);   
        }
        deck=temp;
    } 

    
}
