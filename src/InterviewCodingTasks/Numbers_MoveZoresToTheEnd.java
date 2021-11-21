package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Numbers_MoveZoresToTheEnd {

    public static void main(String[] args) {

    int[] nums = {0, 23, 0, 0, 44, 12, 0, 2, 0, 40, 550, 450, 54};
        System.out.println(moveZeros(nums));

}

    public static List<Integer> moveZeros(int [] arr) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

                if (arr[i] == 0) {
                    list.addLast(arr[i]);
            }
                else {
                    list.addFirst(arr[i]);
                }
        }

//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] == 0) {
//                list.add(arr[i]);
//            }
//        }
        return list;
    }
}


