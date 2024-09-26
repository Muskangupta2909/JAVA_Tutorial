package if_else;

import java.util.Scanner;

public class bijlli_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = 854 ;
        int u100 = 420, u200 = 1020, u400 = 2620;
        if (units <= 100){
            System.out.println(units * 4.2);
        } else if (units <=200) {
            System.out.println(u200 +(units-100) * 6);
        }else if (units <=400) {
            System.out.println(u400 + (units-200) * 8);
        }else{
            System.out.println(u400 +(units-400 )* 13);
        }
    }
}
