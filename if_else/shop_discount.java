package if_else;

import java.util.Scanner;

public class shop_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount");
        double amt = sc.nextDouble();
        if (amt>0 && amt <=5000){
            System.out.println(amt);
        } else if (amt > 5000 && amt <= 7000) {
            System.out.println(amt * 0.9);

        }else if (amt > 7000 && amt <= 10000) {
            System.out.println(amt * 0.8);
        }
        else {
            System.out.println(amt * 0.7);
        }


    }
}
