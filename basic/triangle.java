package basic;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value a");
        double a = sc.nextDouble();
        System.out.println("enter value b");
        double b = sc.nextDouble();
        System.out.println("enter value c");
        double c = sc.nextDouble();

        double side = a+b+c/2;
        System.out.println("Area of Triangle = " + side);



    }
}
