package Basics;

public class GetRandomSSN1 {

    public static void main(String[] args) {
        System.out.println(getRandomSSN());

    }

    public static String getRandomSSN() {
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 100);
        int num3 = (int)(Math.random() * 10000);

        String ssn = num1 + "-" + num2 + "-" + num3;

        return "The generated random SSN is: " + ssn;


    }

}
/*
randomPin = ((char) (Math.random() * 25) + 97);

          System.out.print((char) randomPin);

 */