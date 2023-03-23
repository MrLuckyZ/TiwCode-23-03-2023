package Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Lamborghini");
        Tank t = new Tank("Tank Lung Too",10);
        Truck truck = new Truck("Ford Ranger Jarn Yod");
        truck.addItem("MacBook", 2000);

        v.move();
        t.move();
        t.shoot();
        t.getAmmo();
        truck.move();
    }
}
