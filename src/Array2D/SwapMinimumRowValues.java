package Array2D;

import java.util.Arrays;

public class SwapMinimumRowValues {
    public static void main(String[] args) {
        //  Given  a 2D array of ints, swap the row with the minimum sum witht the first row.

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {1, 0, 1},
        };


        int minRow = 0;
        int minRowIndex = 0;
        for (int i = 0; i < arr[0].length; i++){ // find the sum of first row only and assign it to minRow, we want to assume that first row has the min sum
            minRow += arr[0][i];
        }
        for (int i = 1; i < arr.length; i++){
            int sumOfCurrentRow = 0;
            for (int j = 0; j < arr[i].length; j++){
                sumOfCurrentRow += arr[i][j];
            }
            if (sumOfCurrentRow < minRow){
                minRowIndex = i;
            }
        }
        for(int k = 0; k < arr[0].length; k++ ){
            int temp = arr[0][k];
            arr[0][k] = arr[minRowIndex][k];
            arr[minRowIndex][k] = temp;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}