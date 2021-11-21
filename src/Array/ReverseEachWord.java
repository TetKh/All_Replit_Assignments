package Array;

import java.util.*;

public class ReverseEachWord {

    public static void main(String[] args) throws Exception

    {
        //Run Unit Tests to check your method correctness
        System.out.println(reverseEachWord("Java is fun")); // avaJ si nuf
        System.out.println(reverseEachWord("Javaisfun")); // nufsiavaJ
        System.out.println(reverseEachWord("Java")); // avaJ


    }

    public static String reverseEachWord(String str) throws Exception {

        String[] words = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        return reversedString.trim();

    }
}
    /*
    char[] chs = str.toCharArray();
        String[] words = str.split(" ");

        int i = 0, j = words.length - 1;
        String word = words[i];
        while (i < j) {
            // swap chs[i] and chs[j]
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            i++;
            j--;
        }
        return Arrays.toString(words);
    }
}
     */