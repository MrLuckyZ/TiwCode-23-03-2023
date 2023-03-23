package AnimalAbstract;

public abstract class Omnivore extends Animal{
    public String name;

    public void eat(Food food) {
        if(food.getType().equals("Vegetable")||food.getType().equals("Meat")){
            System.out.println("Yum Yum");
        }
    }

    public abstract void move();
    public abstract void makeSound();
}
