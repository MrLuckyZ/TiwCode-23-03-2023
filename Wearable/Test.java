package Wearable;

public class Test {
    public static void main(String[] args) {
        CottonShirt cts = new CottonShirt("Wool","White");
        System.out.println(cts.toString());
        System.out.println(cts.HowToWash());
        System.out.println(cts.HowToWear());
        System.out.println();
        Scarf sc = new Scarf("Wool","Black");
        System.out.println(sc.toString());
        System.out.println(sc.HowToWash());
        System.out.println(sc.HowToWear());
        System.out.println();
        Jeans jj = new Jeans("Wool","Monkey");
        System.out.println(jj.toString());
        System.out.println(jj.HowToWash());
        System.out.println(jj.HowToWear());
        System.out.println();
    }
}
