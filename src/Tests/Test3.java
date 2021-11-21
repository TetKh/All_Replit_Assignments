package Tests;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 900) + 100;
        System.out.println(random); // 841

        Scanner sc = new Scanner(System.in);

        int rev = 0;

        rev = rev * 10 + random % 10; // 0 + 1 = 1
        random = random / 10; // 841 / 10 = 84

        rev = rev * 10 + random % 10; // 10 + 4 = 14
        random = random / 10; // 84 / 10 = 8

        rev = rev * 10 + random % 10; // 140 + 8 = 148


        System.out.println("The reverse of the number is: " + rev);

    }
}
