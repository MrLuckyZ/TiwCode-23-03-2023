package BasketUpgrade;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //Create basket object
        Basket red = new Basket("Red");
        Basket green = new Basket("Green");
        Basket blue = new Basket("Blue");
        //loop for add fruit to basket
        int n = ip.nextInt();
        for(int i = 0 ; i < n ; i++){
            char type = ip.next().charAt(0);
            String fruitName = ip.next();
            double fruitWeight = ip.nextDouble();
            if(type=='R'){
                //This add fruit to red basket
                red.addFruit(new Fruit(fruitName,fruitWeight));
            }else if(type=='G'){
                //this add fruit to green basket
                green.addFruit(new Fruit(fruitName,fruitWeight));
            }else if(type=='B'){
                //this add fruit to blue basket
                blue.addFruit(new Fruit(fruitName,fruitWeight));
            }
        }

        //Print weight of fruit In difference basket
        String fruit = ip.next();
        System.out.printf("All Weight of %s in RED Basket : %.2f",fruit,red.totalFruitWeight(fruit));
        System.out.printf("\nAll Weight of %s in Green Basket : %.2f",fruit,green.totalFruitWeight(fruit));
        System.out.printf("\nAll Weight of %s in Blue Basket : %.2f",fruit,blue.totalFruitWeight(fruit));

        ip.close();
    }
}
