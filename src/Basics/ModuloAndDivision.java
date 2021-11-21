package Basics;

import java.util.Scanner;

public class ModuloAndDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        // int number = 5852; // multiplication 400, sum 20

        // Output 380

        int num1 = number % 10; // 2
        number = number / 10; // 585
        int num2 = number % 10; // 5
        number = number / 10; // 58
        int num3 = number % 10; // 8
        int num4 = number / 10; // 5

        System.out.println((num1*num2*num3*num4) - (num1+num2+num3+num4));

    }
}
