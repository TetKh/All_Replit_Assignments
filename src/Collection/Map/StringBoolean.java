package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class StringBoolean {
    public static void main(String[] args) {

        System.out.println(wordMultiple(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(wordMultiple(new String[]{"this", "and", "that", "and"}));

    }

    public static Map<String, Boolean> wordMultiple(String [] words){

        Map<String, Boolean> map = new HashMap<>();

        for (String s: words) {
            if (!map.containsKey(s)) {
                map.put(s, false);

            } else {
                map.put(s, true);
            }
        }
        return map;
    }

}
