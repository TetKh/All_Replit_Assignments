package Overloading;

import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        //Test your methods by passing the given arrays

        int[] arr1 = {1, 2, 3, 4, 5};

        char[] arr2 = {'h', 'e', 'l', 'l', 'o'};

        String[][] arr3 = {{"hey", "what's", "up"},
                {"hola", "que", "hondas"},
                {"como", "te", "vas"},
                {"how", "do", "you", "do"}
        };


        long[][][] arr4 = {
                {{21, 3, 4, 5}, {11, 33, 44, 22}},
                {{1, 1, 1}, {2, 1, 2}, {3, 1}},
                {{9, 6}, {5, 5, 5, 5}, {99, 4, 21, 11}},
        };

        System.out.println(printArray(arr1));
        System.out.println(printArray(arr2));
        System.out.println(printArray(arr3));
        System.out.println(printArray(arr4));

    }

    // Create your overloaded methods here

    public static String printArray(int[] a) {

        String output = "";

        for (int i = 0; i < a.length; i++) {
            output += a[i] + " ";
        }
        return output;


    }

    public static String printArray(char[] a) {

        String output = "";

        for (int i = 0; i < a.length; i++) {
            output += a[i] + " ";
        }
        return output;
    }

    public static String printArray(String[][] a) {

        String output = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                output += a[i][j] + " ";
            }

        }
        return output;
    }

    public static String printArray(long[][][] a) {

        String output = "";

        for (long[][] array2d : a) {
            for (long[] array : array2d) {
                for (long arr : array) {

                    output += arr + " ";
                }
            }
        }
        return output;
    }
}
