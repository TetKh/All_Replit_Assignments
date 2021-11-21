package Loops;

public class FibonacciNumbers {

    public static void main(String[] args) {

        // TESTS
        printFibonacci(25); //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368
        printFibonacci(8); //0 1 1 2 3 5 8 13
        printFibonacci(5); //0 1 1 2 3
        printFibonacci(2); //0 1


    }


    public static void printFibonacci(int x) {
        // implement here

        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < x) {

            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        System.out.print("\n");

    }
}