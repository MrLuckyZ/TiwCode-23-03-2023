package AnimalAbstract;

public abstract class Animal {
    public String name;
    
    public void drink(){
        System.out.println("am drinking");
    }

    public abstract void eat(Food food);
    public abstract void move();
    public abstract void makeSound();
}
