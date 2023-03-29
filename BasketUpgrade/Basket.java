package BasketUpgrade;

import java.util.ArrayList;
public class Basket {
    private String name;
    //Create Arrays Variable
    ArrayList<Fruit> fruit = new ArrayList<>();

    public Basket(String name){
        this.name = name;
    }

    public void addFruit(Fruit i){
        //add fruit to ArraysList
        this.fruit.add(i);
    }

    public String getName() {
        return name;
    }

    public double totalFruitWeight(String name){
        //variable to sum weight
        double allWeigth = 0 ;
        //this loop made for sum all weight by fruit name
        for(Fruit i : fruit){
            allWeigth += i.getWeight();
        }
        return allWeigth;
    }
}
