package Loops;

import java.util.Arrays;
import java.util.Scanner;

    public class PoleChudes {

        public static void main(String[] args) {
            System.out.println("Question: In which state was the first English colony in North America (this word contains 8 letters)?:");
            char[] word = {'V', 'i', 'r', 'g', 'i', 'n', 'i', 'a',};
            char[] foundLetter = new char[word.length];
            Arrays.fill(foundLetter, '?');
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("\nGuess and input your letter:");
                String letter = sc.next();
                for (int i = 0; i < word.length; i++) {
                    if (letter.equalsIgnoreCase(Character.toString(word[i]))) {
                        foundLetter[i] = word[i];
                    }
                }
                System.out.println(Arrays.toString(foundLetter));
            } while (!Arrays.equals(foundLetter, word));
            System.out.println("\nCongratulations! You found the word");
        }
    }
