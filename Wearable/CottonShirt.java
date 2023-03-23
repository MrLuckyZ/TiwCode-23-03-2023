package Wearable;

public class CottonShirt implements IWearable{
    public String name;
    public String color;

    public CottonShirt(String name,String color){
        this.color = color;
        this.name = name;
    }

    public String HowToWash() {
        return "Suck By Warm Water";
    }

    public String HowToWear() {
        return "Wear Jak Hua";
    }
    
    public String toString(){
        return "Name : "+name+"\nColor : "+color;
    }
}
