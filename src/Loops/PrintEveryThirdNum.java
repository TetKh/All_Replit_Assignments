package Loops;

import java.util.Scanner;

public class PrintEveryThirdNum {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();
        //write your code below

        for (int i = 0; i < x; i+=3)

            System.out.print(i + " ");
    }
}
