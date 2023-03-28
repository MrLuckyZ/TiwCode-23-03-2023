package FruitBasket;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Agree
        Scanner ip = new Scanner(System.in);
        Basket b1 = new Basket();
        b1.setName("Basket 1");
        for(int i = 0 ; i < 6 ; i++){
            b1.addFruit(ip.next());
        }
        b1.printFruit();

        ip.close();
    }
}