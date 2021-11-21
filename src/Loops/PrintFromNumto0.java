package Loops;

import java.util.Scanner;

public class PrintFromNumto0 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        int x = inp.nextInt();
        //write your code below

        int i = x - 1;

        while  (i >= 0) {
            System.out.print(i + " ");
            i--;
        }
    }
}

