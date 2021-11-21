package Loops;

import java.util.Scanner;

public class CorrectPin {
    public static void main(String[] args) {

        // Create a program that simulates ATM machine.
        // 1. Display a welcome message and ask user to enter the pin. Assume that the correct pin is 1441.
        // 2. Use while loop to implement the logig of repeatedly asking the user to re-enter
        // 3. If the user enters the correct pin display some welcome message

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to DuoBank. Please enter your pin");

        int pin = sc.nextInt();
        int correctPin = 1441;
        int attemptNumber = 0;

        while (pin != correctPin) {

                System.out.println("You entered a wrong pin. Please re-enter your pin again");
                pin = sc.nextInt();

                // System.out.println("You have reached the maximum number of tries!");
            }
            System.out.println("You entered a correct pin. Welcome to your account!");

        }

    }



/*3
if (pin != correctPin && attemptNumber == numberOfTries) {
                System.out.println("You have reached the max number of tries");

 */