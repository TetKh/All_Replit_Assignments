package Array;

import java.util.Arrays;

public class Dublicate {

    public static void main(String[] args) {

        System.out.println(containsDuplicate((new int[] {1,2,3,1})));
        duplicate(new int[] {1,2,3,4,2,4});
    }

    public static void duplicate(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
/* BETTER WAY:
public static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
 */