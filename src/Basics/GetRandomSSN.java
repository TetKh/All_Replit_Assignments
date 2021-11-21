package Basics;

public class GetRandomSSN {

    public static void main(String[] args) {
        getRandomSSN();
        getRandomSSNone();

    }

    public static void getRandomSSN() {
        long num = (int) ((Math.random() * 999999999) + 1);


        long firstThree = (num / 1000000);            // First three digits: XXX-nn-nnnn
        long nextTwo = (num / 1000) % 100;     // Next two digits: nnn-XX-nnnn
        long lastFour = num % 10000;            // Last four digits: nnn-nn-XXXX

        String ssn = firstThree + "-" + nextTwo + "-" + lastFour;

        System.out.println("The generated random SSN is: " + ssn);


    }

    public static void getRandomSSNone() {

        long one = (int) (Math.random() * 1000);

        long two = (int) (Math.random() * 100);

        long three = (int) (Math.random() * 10000);

        System.out.println(one + "-" + two + "-" + three);


    }

}
// Create a static method getRandomSSN() in the given Utilities class that generates a random SSN and returns it as a String in "XXX-XX-XXXX" format.
//
//Call your method in main method to verify your output.
//
//Examples:
//
//getRandomSSN() -> 123-53-3121
//getRandomSSN() -> 956-99-4209
//
//(Extra: Adjust your code so that your method can also return such values as 001-00-0101)