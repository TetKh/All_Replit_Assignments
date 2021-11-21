package Basics;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        System.out.println("What is the weather in San Francisco?");
        Scanner input = new Scanner(System.in);

        int fahrenheit = input.nextInt();
        double celsius = (double)(5/9.0)*(fahrenheit - 32);

        System.out.println("Celsius: " + celsius);


    }
}
