package Loops;

public class NestedFor {

    public static void main(String[] args) {

        for (int j = 5; j > 1; j--) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");

            }

            System.out.println();

        }
        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");

            }

            System.out.println();

        }
    }
}

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
