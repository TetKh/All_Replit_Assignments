package Basics;

import java.util.Scanner;
public class PrintReverse {

        public static void main(String[] args) {
            printReverse(); // Don't change anything here. Simply run the code to test the output.
        }


        public static void printReverse()  {

            int random = (int) (Math.random() * 9000) + 1000; // code to generate a random number with 4 digits

            System.out.println("The generated random number is: " + random); // 3478

            Scanner sc = new Scanner(System.in);
            int rev = 0;

            rev = rev * 10 + random % 10; // 0 + 8 = 8
            random = random / 10; // 0

            rev = rev * 10 + random % 10; // 80 + 0
            random = random / 10; // 0

            rev = rev * 10 + random % 10; // 800
            random = random / 10;

            rev = rev * 10 + random % 10;

            System.out.println("The reverse of the number is: " + rev);


        }
    }

