package Loops;

public class CountVowels {

    public static void main(String[] args){
        countVowels("oBama"); //3
        countVowels("happyfridaYiloveWeekends"); //9
    }


    //Method here
    public static void countVowels(String s){


        int sumOfVovels = 0;
        int lower = 0;


        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);

            if (character == 'A' || character == 'a' ||
                    character == 'E' || character == 'e' ||
                    character == 'I' || character == 'i' ||
                    character == 'O' || character == 'o' ||
                    character == 'U' || character == 'u') {
                sumOfVovels++;
            }

            if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
                lower++;
            }
        }
        System.out.print("Vowels " + sumOfVovels + ", Consonants " + (s.length() - sumOfVovels));
        System.out.println(", LowerCase " + lower + ", UpperCase " + (s.length() - lower));

    }
}

