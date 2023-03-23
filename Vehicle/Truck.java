package Vehicle;

import java.util.ArrayList;

public class Truck extends Vehicle{
    ArrayList<Item> item = new ArrayList<Item>();
    
    public Truck(String name) {
        super(name);
    }
    
    public void move(){
        if(calWeigh()>2000){
            System.out.println("I can't move it move it anymore");
        }else{
            System.out.println("I'm movin like a truck");
        }
    }

    public void addItem(Item item){
        this.item.add(item);
    }
    public void addItem(String name , int weigh){
        item.add(new Item(name,weigh));
    }

    public void remove(Item item){
        this.item.remove(item);
    }

    public void remove(String name){
        for(Item i : item){
            if(i.getName().equals(name)){
                item.remove(i);
                break;
            }
        }
    }

    public int calWeigh(){
        int weigh=0;

        for(int i = 0;i<item.size();i++){
            weigh+=item.get(i).getWeigh();
        }

        for(Item i : item){
            weigh += i.getWeigh();
            System.out.println(i.getName());
        }
        return weigh;
    }
}
