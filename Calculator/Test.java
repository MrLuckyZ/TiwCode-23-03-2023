package Calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Calc cal = new Calc();
        
        System.out.println("Int = "+cal.add(20, 30));
        System.out.println("Double = "+cal.add(20.0, 30.0));
        

        ip.close();
    }
    
}
