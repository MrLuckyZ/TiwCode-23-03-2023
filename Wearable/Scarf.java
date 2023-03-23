package Wearable;

public class Scarf implements IWearable{
    public String name;
    public String color;

    public Scarf(String name,String color){
        this.color = color;
        this.name = name;
    }

    public String HowToWash() {
        return "Suck By Hand";
    }

    public String HowToWear() {
        return "Paan Roob Kor";
    }

    public String toString(){
        return "Name : "+name+"\nColor : "+color;
    }
    
}
