package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Orange", "Banana");

        System.out.println(Arrays.toString(list2Array(list)));
    }
    public static String[] list2Array(List<String> stringList) {

        String[] arr = new String[stringList.size()];
        arr = stringList.toArray(arr);

            return arr;
        // return stringList.toArray(new String[stringList.size()]);
        }
    }

/*
Given a list of Strings, return an array containing the same Strings in the same order

   list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
 */
