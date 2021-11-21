package Overloading;

import java.util.Arrays;

public class BeginIndex {

    public static void main(String[] args) {
        //Test your methods

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(beginIndex(arr, 2));
        System.out.println(beginIndex(arr, 4));
        System.out.println(beginIndex(arr, 0));

        System.out.println(beginIndex(arr, 0, 2));
        System.out.println(beginIndex(arr, 1, 5));
        System.out.println(beginIndex(arr, 1, 2));
        System.out.println(beginIndex(arr, 1, 1));

    }

    //Create your methods
    public static char[] beginIndex(char[] array, int beginIndex) {

        String str = "";

        for (int i = beginIndex; i < array.length; i++) {
            str += array[i];
        }

        return str.toCharArray();
    }
    public static char[] beginIndex(char[] array, int beginIndex, int endIndex) {

        String str = "";

        for (int i = beginIndex; i < endIndex; i++) {
            str += array[i];
        }

        return str.toCharArray();
    }
}
