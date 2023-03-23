package Calculator;

import java.util.Arrays;

public class Calc {
    public int num1 , num2;

    public static int add(int n1,int n2){
        return n1+n2;
    }
    
    public static int minus(int n1,int n2){
        return n1-n2;
    }

    public static int multiple(int n1,int n2){
        return n1*n2;
    }

    public static int devide(int n1,int n2){
        return n1/n2;
    }

    public static double add(double n1,double n2){
        return n1+n2;
    }
    
    public static double minus(double n1,double n2){
        return n1-n2;
    }

    public static double multiple(double n1,double n2){
        return n1*n2;
    }

    public static double devide(double n1,double n2){
        return n1/n2;
    }

    public static int findMax(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    public int findMin(int[] num){
        Arrays.sort(num);
        return num[0];
    }

    public double power(int n1,int n2){
        return Math.pow(n1, n2);
    }
}
