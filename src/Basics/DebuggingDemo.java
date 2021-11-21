package Basics;

import java.util.Scanner;

public class DebuggingDemo {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // User must enter the amount ($) in decimal format.
            System.out.print("Please enter amount:\n ");
            double amount = scan.nextDouble();

            // This process will convert decimal into integer amount ($).
            int remainingAmount = (int) (amount * 100); // put (int) to conver from double.


            // The following process will extract dollars, quarters, dimes, nickles and pennies  using division (/) and modulo (%) operator.
            int dollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            int quarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            int dimes = remainingAmount / 10; // int dimes = quarters / 10; -> Bug
            remainingAmount = remainingAmount % 10;

            int nickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            int pennies = remainingAmount;



            // This will display the process output onto the console using if and else if method.
            System.out.println("Your amount: " +amount + " consists of:\n" +
                    dollars + " dollars\n" +
                    quarters + " quarters\n" +
                    dimes + " dimes\n" +
                    nickels + " nickels\n" +
                    pennies + " pennies\n");
        }
    }

