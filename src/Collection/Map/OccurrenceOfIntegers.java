package Collection.Map;

import java.util.*;

public class OccurrenceOfIntegers {

    public static void main(String[] args) {

        String str = "1 5 9 2 1 5 8 1";
        occurrenceOfInt(str);
    }

    public static void occurrenceOfInt(String st) {

        String [] arr = st.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s: arr) {
            if (!map.containsKey(s)){
                map.put(s, 1);
            }else{
                int value = map.get(s);
                value++;
                map.put(s, value);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")" + " ");
        }
    }


/*
Write a method which takes in a space-separated string of integers,
and prints out the number of occurrences of each integer.
E.g     Input: "1 5 9 2 1 5 8 1"
        Output: "1(3) 2(1) 5(2) 8(1) 9(1)"
 */
