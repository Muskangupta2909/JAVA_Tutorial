package basic;

import java.util.Scanner;
import java.lang.Math;
public class sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter area");
        double area = sc.nextDouble();
        double radius = 4 * Math.PI * Math.pow (area ,2);
        System.out.println("Surface area of sphere = " + radius);
    }
}
