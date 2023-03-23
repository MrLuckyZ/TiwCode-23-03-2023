package AnimalAbstract;

public abstract class Carnivore extends Animal{
    public String name;

    public void eat(Food food) {
        if(food.getType().equals("Meat")){
            System.out.println("Yum Yum");
        }else{
            System.out.println("I can't eat it");
        }
    }

    public abstract void move();
    public abstract void makeSound();
}