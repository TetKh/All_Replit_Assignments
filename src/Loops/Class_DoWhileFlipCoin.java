package Loops;

import java.util.Scanner;

public class Class_DoWhileFlipCoin {
    public static void main(String[] args) {

        char c = '1' ;

        // scope of the variable

        do {
            System.out.println("I am flipping a coin.");

            double num = Math.random();

            if (num > 0.5) {
                System.out.println("You got TAILS");
            } else {
                System.out.println("You got HEADS");
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to continue: ");
            c = scan.nextLine().charAt(0);
        } while ( c == 'y') ;





    }

}
