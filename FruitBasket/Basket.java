package FruitBasket;

import java.util.ArrayList;

public class Basket {
    public String name;
    ArrayList<Fruit> basket = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addFruit(String name){
        if(basket.size()<5){
            basket.add(new Fruit(name));
        }else{
            System.out.println("I sas takra tem leaw");
        }
    }

    //Normal Print
    public void printFruit(){
        for(int i = 0 ; i < basket.size() ; i++){
            System.out.println("Fruit : "+basket.get(i).getName());
        }
    }

    //Enchant For
    public void enchantPrintFruit(){
        for(Fruit i : basket){
            System.out.println("Fruit : "+i.getName());
        }
    }

}
