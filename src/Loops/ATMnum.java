package Loops;

import java.util.Scanner;

public class ATMnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to DuoBank");
        int pin = 1441;
        int num = 0;
        int tries = 0;

        do {
            System.out.println("Please enter your pin");
            num = sc.nextInt();
            tries++;

            if (tries == 3){

                System.out.println("Your account is locked. Contact customer service!");
                return;
            }


        } while (num != pin);

        System.out.println("You entered a correct pin. Welcome to your account!");

    }
}