package Loops;

public class KeepVowels {

    public static void main(String[] args){
        System.out.println(keepVowels("hello")); //eo
        System.out.println(keepVowels("how do i internets")); //ooiiee
    }


    public static String keepVowels(String s) {

        // Write your method here

        String vowels = "";

        for (int i = 0; i < s.length(); i++){

            char character = s.charAt(i);

            if (character == 'A' || character == 'a' ||
                    character == 'E' || character == 'e' ||
                    character == 'I' || character == 'i' ||
                    character == 'O' || character == 'o' ||
                    character == 'U' || character == 'u')
                vowels = vowels + character;
        }
        return vowels;
    }
}