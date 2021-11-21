package Array;

import java.util.Arrays;

public class ReverseArrayValues {

    public static void main(String[] args) {

        reverse(new char[]{'a', 'b', 'c'}); //-> [c, b, a]
        reverse(new char[]{'c', 'i', 'v', 'i', 'c'}); // -> [c, i, v, i, c]
        reverse(new char[]{'j', 'a', 'v', 'a'}); // -> [a, v, a, j]
        reverse(new char[]{'y', 'o'}); //  -> [o, y]
        reverse(new char[]{'o'}); // -> [o]
    }


    public static void reverse(char[] arr) {

        char rev[] = new char[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[i] = arr[arr.length - 1 - i];
           }
            System.out.println(Arrays.toString(rev));

        }
        }

