package Collection.List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(1, 2, 3, 6, 9, 3, 4, 1, 8, -2);
        int max = myList.get(0);  //1
        int secMax = myList.get(0); //1
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > max) { //2>1
                secMax = max; // se = 2
                max = myList.get(i); //max = 3
            } else if (myList.get(i) > secMax) {
                secMax = myList.get(i);
            }
        }
    }
}
