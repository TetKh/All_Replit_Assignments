package Basics;

import java.util.Scanner;

    class EndsWith {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println ("In:");
            String word = inp.nextLine();
            //DO NOT CHANGE ABOVE CODE!  Write your code below

            /*
            String b = word.substring(word.length() - 1);
            System.out.println(b);
            if (b.equals("y")) {
            System.out.println("-ies");
                */

            if (word.endsWith("ey")) {
                System.out.println("-eys");
            }
            else if (word.endsWith("y"))   {
                System.out.println("-ies");
            }
            else if (word.endsWith("ife")) {
                System.out.println("-ives");
            }
            else {
                System.out.println("-s");


            }
        }

    }


