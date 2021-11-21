package Basics;

public class LastFour {

    public static void main(String[] args) {

        String input = "farael";     //input string
        String lastFourDigits;     //substring containing last 4 characters

        lastFourDigits = input.substring(input.length() - 4);

        System.out.println(lastFourDigits);
    }
}
