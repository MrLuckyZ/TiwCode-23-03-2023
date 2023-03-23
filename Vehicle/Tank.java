package Vehicle;

public class Tank extends Vehicle{
    public int ammo;

    public Tank(String name,int ammo) {
        super(name);
        this.ammo = ammo;
    }

    public void shoot(){
        if(ammo>=0){
            System.out.println("Bang Bang Boommmmmmmmmmm!");
            ammo-=1;
        }else{
            System.out.println("No ammo left!!!!!!!1");
        }
    }

    public void move(){
        System.out.println("I'm moving like a tank");
    }

    public void getAmmo() {
        System.out.println("You have : "+ammo+" Left");
    }
    
}
