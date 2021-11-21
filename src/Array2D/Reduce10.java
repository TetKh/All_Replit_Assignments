package Array2D;

import java.util.Arrays;

public class Reduce10 {

    public static void main(String[] args)
    {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        //print the Array
        System.out.println(Arrays.deepToString(a));

    }

    public static void reduce10(int[][] nums){

        for (int i = 0; i < nums.length; i++){

            for (int j = 0; j < nums[i].length; j++){

            nums [i][j] = nums [i][j] - 10;

                // System.out.print(" " + nums[i][j]);
            }
        }
    }



}
