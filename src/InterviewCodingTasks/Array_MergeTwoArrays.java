package InterviewCodingTasks;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1,2,3,4}, new int[]{5,6,7,8})));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

}
