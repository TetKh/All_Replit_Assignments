package Loops;

import java.util.Scanner;

public class Class_DoWhile {



        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            String str = "";


            do {
                System.out.println("Nothing is impossible.");
                System.out.println("Would you like to hear it again: ");
                str = scan.nextLine();
            } while (str.equals("yes"));



        }
    }


