package Basics;

public class GetAverage {

    public static void main(String[] args) {

        System.out.println(average(5,7)); // 6
        System.out.println(average(2,7)); // 4.5
        System.out.println(average(11,2)); // 6.5
    }

    public static double average(double a, double b) {
         return (a + b) / 2;
    }
}
