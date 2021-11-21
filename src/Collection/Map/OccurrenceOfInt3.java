package Collection.Map;

import java.util.*;
    class OccurrenceOfInt3 {
        public static void main(String[] args) {
            int arr[] = new int[]{1, 5, 9, 2, 1, 5, 8, 1};
            Map <Integer, Integer> counts = countOccurrences(arr); // calls function
            Iterator itr = counts.entrySet().iterator(); // this will count the occurrences of each Integer
            while(itr.hasNext()){
                Map.Entry pairs = (Map.Entry)itr.next();
                System.out.println(pairs.getKey() + " Occurs (" + pairs.getValue() + ") Times! "); // this will print the occurrences
            }
        }
        public static Map <Integer, Integer> countOccurrences(int[]arr){
            int len = arr.length; // arrays length stores in n
            Map <Integer, Integer> map = new HashMap <Integer, Integer>(); // this declares the map
            for(int i = 0; i < len; i++){ // loop runs from 0 to array size
                int key = arr[i]; // the array element is assigned to key
                if(map.containsKey(key)){
                    int value = map.get(key);
                    map.put(key, value + 1); // increments value
                }
                else {
                    map.put(key, 1); // value is 1
                }
            }
            return map; // returns occurrences
        }
    }
