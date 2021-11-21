package InterviewCodingTasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -7, -3, 2, 5, 6, 23, 8, 1, 34};
        System.out.println(maxValue(arr));
        System.out.println(maxValue2(arr));
    }

    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }


    public static int maxValue2(int[] n) {

        int max = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        return max;
    }
}



