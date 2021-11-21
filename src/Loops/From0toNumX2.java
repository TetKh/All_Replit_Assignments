package Loops;

import java.util.Scanner;

public class From0toNumX2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();
        //write your code below

        int start = 0;

        for(int i = start; i < (end*2); i++)
            System.out.print(i + " ");


    }
}
