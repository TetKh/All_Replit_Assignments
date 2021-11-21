package Array;

import java.util.Arrays;

public class PigLatin {
    public static void main(String[] args) throws Exception {
        //Run Unit Tests to check your method correctness
        System.out.println(pigLatin("Java is fun"));
        System.out.println(pigLatin("Hello World"));
        System.out.println(pigLatin("Java"));
    }

    public static String pigLatin(String str) throws Exception {

        String[] words = str.split(" ");
        String pigLatin = "";

        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            words[i] = temp.substring(1, temp.length()) + temp.charAt(0) + "ay";
            pigLatin = String.join(" ", words);
        }
        return pigLatin;
    }
}
/*
        pigL += words[i] + " ";
        }
        return pigL.trim();
 */