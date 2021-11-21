package Loops;

import java.util.Scanner;

public class PrintCharAtWord {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String word = inp.nextLine();
        //write your code below

        for(int i = 0; i < word.length(); i++)
            System.out.println(word.charAt(i));

    }

}
