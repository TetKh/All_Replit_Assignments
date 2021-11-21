package Loops;

import java.util.Scanner;

public class From1toNum {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");

        int start = 1;
        int end = inp.nextInt();

            for(int i = start; i <= end; i++)
                System.out.print(i + " ");

    }
}

