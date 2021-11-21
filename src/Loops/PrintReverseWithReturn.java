package Loops;

public class PrintReverseWithReturn {

    public static void main(String[] args) {
        printReverse(1000);

    }

    public static void printReverse(int num) {

        while(num != 0) {

            System.out.print(num % 10);
            num /= 10;
        }
    }
}

