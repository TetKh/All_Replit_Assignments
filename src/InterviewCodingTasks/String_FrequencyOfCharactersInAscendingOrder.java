package InterviewCodingTasks;

import java.util.*;

public class String_FrequencyOfCharactersInAscendingOrder  {

    /*
    Return the frequency of each character in the given string in Ascending order
        Ex:
            Input: tomorrow
            Output: ooorrtmw
     */

    public static void main(String[] args) {
        System.out.println(ascOrderOfRepeatedChars("tomorrow"));
//        System.out.println(frequencyOfChars("tomorrow"));
//        System.out.println(frequencyOfCharacterInSortedManner("tomorrow"));
    }

    public static String ascOrderOfRepeatedChars(String str) {
            Map<String, Integer> map = new HashMap<>();
            for (String each : str.split("")) {
                if (map.containsKey(each)) {
                    map.put(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        StringBuilder sortedByCountOfDuplicates = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int i = 0;
            while (i < entry.getValue()) {
                sortedByCountOfDuplicates.append(entry.getKey());
                i++;
            }
        }
        return sortedByCountOfDuplicates.reverse().toString();
    }



    public static String frequencyOfChars(String str) {
        String sorted = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!sorted.contains("" + str.charAt(i))) {
                sorted += "" + str.charAt(i) + count;
            }
        }
        return sorted;
    }


    public static String frequencyOfCharacterInSortedManner(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        str = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            str += each.getKey() + each.getValue();
        }

        return str;
    }


}
