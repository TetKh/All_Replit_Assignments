package Array;

import java.util.Arrays;

public class SortAndFill {

    public static void main(String[] args) {

        // SORTING

        int[] arr = {1, 7, 8, 9, 3, 4, 56, 0, 8, 67, 5, 6, 7};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));



        Arrays.fill(arr, 5, 8, 99);

        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 0, 5, 0);

        System.out.println(Arrays.toString(arr));


        // FILL

        int [] arr2 = new int [5];

        Arrays.fill(arr2, 2, 5, 22); // 0, 0, 22, 22, 22

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.binarySearch(arr2, 5)); // - 3


        // EQUALS

        if (Arrays.equals(arr, arr2)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equals");
        }

    }
}