package Array;

import java.util.Arrays;

public class SortArrayDescendingOrder {
    public static void main(String[] args) {


        int[] arr = {4, 3, 1, 6, 4, 3, 6, 4};

        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
            if(arr[i] < arr[j]){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            }
        }
        System.out.println(Arrays.toString(arr));
        }
    }

