package Loops;

public class AmericanFlag {

    public static void main(String[] args) {

        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= 50; j++)
            if (j < 10 && i < 5) {
                System.out.print("*");
            } else {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}