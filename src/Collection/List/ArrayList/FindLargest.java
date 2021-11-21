package Collection.List.ArrayList;

import java.util.*;

public class FindLargest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997);
        System.out.println(findLargest(list));

        List<Integer> list2 = Arrays.asList(987, 1234, 9381, 731, 43718, 8932);
        System.out.println(findLargest(list2));
    }


    public static Integer findLargest(List<Integer> integerList) {

        //int largest = Collections.max(integerList);

        int largest = 0;

        for (Integer i : integerList) {

            if (i > largest) largest = i;

        }
        return largest;
    }
}

/*
Given a Collection.List of Integers, return the largest value.

   findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
 */
