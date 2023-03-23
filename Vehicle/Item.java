package Vehicle;

public class Item {
    public String name;
    public int weigh;

    public Item(String name,int weigh){
        this.name = name;
        this.weigh = weigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public String getName() {
        return name;
    }

}
