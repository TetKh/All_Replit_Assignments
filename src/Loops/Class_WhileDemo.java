package Loops;

import java.util.Scanner;

public class Class_WhileDemo {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Hi, please enter a number between 1-10");

            int num = sc.nextInt();

            while( ! (num >= 1 && num <=10)  ){
                System.out.println("You entered an invalid number");
                System.out.println("Please enter a valid number between 1-10");
                num = sc.nextInt();
            }

            System.out.println("Good job. Finally you followed the instructions");


        }
    }
