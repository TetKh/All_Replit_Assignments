package Loops;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (character == 'A' || character == 'a' ||
                    character == 'E' || character == 'e' ||
                    character == 'I' || character == 'i' ||
                    character == 'O' || character == 'o' ||
                    character == 'U' || character == 'u') {
                System.out.print(character);


            }

        }
    }
}
