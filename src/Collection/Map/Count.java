package Collection.Map;

import java.util.*;

public class Count {

    public static void main(String[] args) {

        System.out.println(count(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(count(new String[]{"this", "and", "that", "and"}));

    }

    public static Map<String, Integer> count(String [] words){

        Map<String, Integer> map = new HashMap<>();

        for (String s: words) {
            if (!map.containsKey(s)){
                map.put(s, 1);
            }else{
                int value = map.get(s);
                value++;
                map.put(s, value);
            }
        }

           return map;
    }
}
