package Loops;

public class Triangle {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;


        for (i = 0; i < 10; i++) {
            for (j = 2 * (10 - i); j >= 0; j--) {

                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
