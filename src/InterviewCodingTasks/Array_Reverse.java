package InterviewCodingTasks;

import java.util.Arrays;

public class Array_Reverse {

    /*
    write a function that can reverse an array
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int [] {1,2,3,4,5,6,7})));
    }


    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }




}
