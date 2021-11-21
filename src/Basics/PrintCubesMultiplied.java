package Basics;

public class PrintCubesMultiplied {

    public static void printCubesMultiplied(int x, int y) {

        // (Math.pow(x, 3) * Math.pow(y, 3);
        // System.out.println((x * x * x) * (y * y * y));
        System.out.println(Math.pow(x, 3) * Math.pow(y, 3));

    }
    public static void main(String[] args) {

        printCubesMultiplied(2, 3);
    }
}

