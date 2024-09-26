package basic;

import java.util.Scanner;
import java.lang.Math;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area");
        double area = sc.nextDouble();
        double circle = Math.PI *Math.pow(area , 2);
        System.out.println("Area of Circle = " + circle);

    }
}
