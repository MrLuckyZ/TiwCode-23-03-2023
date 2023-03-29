package BasketUpgrade;

public class Fruit {
    private String name;
    private double weight;

    public Fruit(String name,double weight){
        this.name = name;
        this.weight = weight;
    }
    //normal get set method
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
}
