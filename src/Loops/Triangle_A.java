package Loops;

public class Triangle_A {

    public static void main(String[] args) {

        printTriangle(5, '&');
        printTriangle(10, '*');
        printTriangle(25, '%');
    }

    public static void printTriangle(int height, char ch) {

        System.out.println();
        for (int i = 1; i <= height; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = height - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
