package CardGame;

public class Card {
    private String name;
    private String suit;
    private int value;

    Card(){};
    Card(String name , String suit, int value){
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String getName(){
        return name;
    }
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }

    public String toString(){
        return "" + name + " of " + suit + ",Value : "+ value;
    }
}
