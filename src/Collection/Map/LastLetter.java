package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class LastLetter {

    public static void main(String[] args) {
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));

    }


    public static Map<String, String>  pairs(String[] words){

    Map<String, String> map = new HashMap<>();

        for (String s: words) {

            map.put(s.substring(0, 1), s.substring(s.length()-1, s.length()));

    }
        return map;
}

}

