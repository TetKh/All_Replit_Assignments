package Collection.List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        Integer [] arr = {1, 2, 3};
        System.out.println(fizzBuzzList(arr));

        Integer [] arr2 = {4, 5, 6};
        System.out.println(fizzBuzzList(arr2));

        Integer [] arr3 = {7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(fizzBuzzList(arr3));

    }


    public static List<String> fizzBuzzList(Integer[] integerArray) {

        String [] arr = new String[integerArray.length];

        for (int i = 0; i < integerArray.length; i++) {
            arr[i] = String.valueOf(integerArray[i]);
        }

        List<String> list = Arrays.asList(arr);

        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) == 15) {
                list.set(i, "FizzBuzz");
            } else if (Integer.parseInt(list.get(i)) % 3 == 0){
                list.set(i, "Fizz");
            } else if (Integer.parseInt(list.get(i)) % 5 == 0){
                list.set(i, "Buzz");
            }
        }

        return list;
    }



}
/*
Given an array of Integers, return a Collection.List that contains the same numbers as Strings.
Except any multiple of 3 should be replaced by the String "Fizz", any multiple of
5 should be replaced by the String "Buzz", and any multiple of both 3 and 5 should be
replaced by the String "FizzBuzz".


   fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
 */