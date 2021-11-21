package Array;

import java.util.Arrays;

public class RandomShuffle {
    public static void main(String[] args) {
        // Fisher-Yates algorithm

        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length -1; i > 0; i--) {

            int j =   (int) (Math.random() * (i + 1)); // generate random index 0<=j<=i

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }
}

