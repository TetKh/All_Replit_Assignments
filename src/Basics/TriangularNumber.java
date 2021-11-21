package Basics;

public class TriangularNumber {

    public static void main(String[] args) {

        System.out.println(triangle(1)); // 1
        System.out.println(triangle(6)); // 21
        System.out.println(triangle(215)); //23220
    }

    public static double triangle(int n) {

        return (1 / 2.0) * n * (n + 1);

    }
}
