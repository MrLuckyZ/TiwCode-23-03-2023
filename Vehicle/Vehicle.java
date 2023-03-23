package Vehicle;

public class Vehicle {
    public String name;

    public Vehicle(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("I'm Movinnnn");
    }
}
