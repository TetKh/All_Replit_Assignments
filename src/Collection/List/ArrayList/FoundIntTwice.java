package Collection.List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class FoundIntTwice {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 7, 9, 5, 11);
        System.out.println(foundIntTwice(list, 5));

        List<Integer> list2 = Arrays.asList(6, 8, 10, 11, 13);
        System.out.println(foundIntTwice(list2, 8));

    }

    public static boolean foundIntTwice(List<Integer> integerList, int intToFind) {

        int count = 0;

        for (Integer i: integerList) {

            if (i == intToFind) count++;

        }

        return count >= 2;
    }


}

/*
Given a Collection.List of Integers, and an int value, return true if the int value appears two or more times in the list.

   foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 )-> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
 */
