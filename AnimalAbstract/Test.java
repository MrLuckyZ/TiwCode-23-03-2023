package AnimalAbstract;

public class Test {
    public static void main(String[] args) {
        Food meat = new Food("Meat");
        Food vegetable = new Food("Vegetable");
        Lion l1 = new Lion();
        l1.move(); l1.makeSound(); l1.eat(meat);
        System.out.println();
        Crocodile c1 = new Crocodile();
        c1.move(); c1.makeSound(); c1.eat(vegetable);
    }
}
