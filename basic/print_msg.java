package basic;

import java.util.*;

public class print_msg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("hey " +name+ ",you are "+age+ " years old");

    }
}
