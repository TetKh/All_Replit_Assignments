package Array;

import java.util.Arrays;

public class RandomArraysValues {

    public static void main(String[] args) {

        int[] arr = new int[1000];
        // int index = 0;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (10 + (Math.random() * 90));
            // index = i;

            if (i % 2 == 0) {

                Arrays.fill(arr, i, i + 1, 22);

            } else {

                Arrays.fill(arr, i, i + 1, 66);


            }
        }
        System.out.println(Arrays.toString(arr));
    }

}