package InterviewCodingTasks;

import java.util.Set;
import java.util.TreeSet;

public class Number_FindLostNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 11, 8, 5, 3, 9, 3, 20, 14, 17};
        System.out.println(findPosNum(array));
    }


    public static Set<Integer> findPosNum(int[] arr) {

        int max = 0;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }

        Set<Integer> list = new TreeSet<>();

        for (int i = 1; i < max; i++) {
            list.add(i);
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j])
                    list.remove(arr[j]);
            }
        }

        return list;
    }
}