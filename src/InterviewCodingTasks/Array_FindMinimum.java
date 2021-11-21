package InterviewCodingTasks;

public class Array_FindMinimum {

    /*
    Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 23, 8, 1, 34};
        System.out.println(minValue(arr));
    }


    public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }


}