package Overloading;

import java.util.Arrays;

public class GetAverage {

    public static void main(String[] args) {
        //Test your methods by passing the given arrays
        int[] arr1 = {3, 2, 5, 1, 6};

        double[] arr2 = {2.3, 6.1, 9.1, 2.9};

        System.out.println(getAverage(arr1));
        System.out.println(getAverage(arr2));
    }
    //create your methods
    public static int getAverage(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
                sum += a[i] ;
        }
        return sum / a.length;

    }

    public static double getAverage(double[] a) {

        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] ;
        }
        return sum / a.length;
    }
}