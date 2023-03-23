package Wearable;

public class Jeans implements IWearable{
    public String name;
    public String color;

    public Jeans(String name,String color){
        this.color = color;
        this.name = name;
    }

    public String HowToWash() {
        return "Suck By WashingMachine";
    }

    public String HowToWear() {
        return "Sai kar";
    }
    
    public String toString(){
        return "Name : "+name+"\nColor : "+color;
    }
}
