package basic;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           System.out.println("Enter length");
           double length = sc.nextDouble();

           System.out.println("Enter breadth");
           double breadth = sc.nextDouble();

           double perimeter = 2 * (length + breadth);
           double area = (length * breadth);

           System.out.println("perimeter of rectangle " +perimeter);
           System.out.println("area of rectangle "+area);


    }

}
