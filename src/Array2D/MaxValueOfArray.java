package Array2D;

import java.util.Arrays;

public class MaxValueOfArray {

    public static void main(String[] args) {
        int[][] a = {
                {5, 2, 3, 7},
                {1, 5, 1, 1},
                {8, 3, 1, 2}
        };
        System.out.println(max2Delement(a)); //should be 8
    }

    public static int max2Delement(int[][] nums) {

        int max = nums[0][0];

        for (int[] num : nums) {

            for (int j = 0; j < num.length; j++) {

                if (max < num[j]) {
                    max = num[j];
                }
            }

        }
        return max;
    }
}