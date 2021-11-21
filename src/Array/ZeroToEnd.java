package Array;


import java.util.Arrays;

public class ZeroToEnd {

    public static void main(String[] args) {

        //TEST 1
        int [] arr1 = {0,1,0,3,12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1)); //  [1, 3, 12, 0, 0]
        //TEST 2
        int [] arr2 = {0,0,0,0,0,0,1};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2)); //  [1, 0, 0, 0, 0, 0, 0]
        //TEST 3
        int [] arr3 = {12,2,0,0,2,0,0,78,0,12,0};
        moveZeroes(arr3);
        System.out.println(Arrays.toString(arr3)); //  [12, 2, 2, 78, 12, 0, 0, 0, 0, 0, 0]
        //TEST 4
        int [] arr4 = {0};
        moveZeroes(arr4);
        System.out.println(Arrays.toString(arr4)); //  [0]


    }


    public static void moveZeroes(int [] nums){

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                if(nums[i] == 0 && nums[j] != 0){

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
        }
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}

/*
      int j = 0;
      int i = 0;
  for (j = 0; j < nums.length; j++)
      if (nums[j] != 0)
          nums[i++] = nums[j];
  while (i < nums.length) {
          nums[i++] = 0;
      }
  }
}
 */