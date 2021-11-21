package InterviewCodingTasks;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToTheEnd(new int[]{0, 0, 1, 2, 0, 3, 0, 4})));
    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


    public static int[] moveZerosToTheEnd2(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


}
