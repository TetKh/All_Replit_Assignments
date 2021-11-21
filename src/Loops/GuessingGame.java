package Loops;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("This program will let you guess a random number between o and 100");

        int num = 22; //(int) (Math.random() * 101);
        int input;
        int tries = 0;

        do {
            System.out.println("Please enter your guess:");
            input = sc.nextInt();
            tries++;

            if (input > num && input <= 100) {

                System.out.println("Your guess is too high.");

            } if (input < num && input >= 0) {

                System.out.println("Your guess is too low.");

            } if (input < 0 || input > 100) {

                System.out.println("You entered an invalid number. Please entered a valid number");

            }

            } while (num != input) ;

            System.out.println("Congratulations, you found the number. It is " + num);
            if (tries == 1) {
                System.out.println("You found it in " + tries + " try");
            } else {
                System.out.println("You found it in " + tries + " tries");
            }

        }
    }

