package if_else;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("first value is greatest = "+a);
        } else if (b>a) {
            System.out.println("Second value is greatest" +b);
        }else {
            System.out.println("Both a and b are equal");


        }


    }
}
