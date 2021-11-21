package Loops;

public class PrintReverse {

    public static void main(String[] args) {
        printReverse(10090);
    }

    public static void printReverse(int num) {


        while(num != 0) {

            System.out.print(num % 10);

            num /= 10;
        }
    }
}

