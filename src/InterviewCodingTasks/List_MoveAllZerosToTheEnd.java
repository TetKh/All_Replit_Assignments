package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */
    public static void main(String[] args) {
        List<Integer> listOfInt = Arrays.asList(new Integer[]{0, 1, 0, 2, 3, 0, 4, 5});
        System.out.println(moveZerosToTheEnd(listOfInt));
    }


    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }


}
