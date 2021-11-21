package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String [] arr = {"Apple", "Orange", "Banana"};

        System.out.println(array2List(arr));
    }


    public static List<String> array2List(String[] stringArray) {

        List<String> newList = Arrays.asList(stringArray);
       // newList.addAll(Arrays.asList(stringArray));

        return newList;
    }
}




/*
Given an array of Strings, return an Collection.List.ArrayList containing the same Strings in the same order.

   array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
 */
