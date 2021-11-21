package Collection.Map;

import java.util.*;

public class OccurrenceOfInt2 {

        public static void main(String[] args) {
            numsOfOcc("1 5 9 2 1 5 8 1");
        }
        public static void numsOfOcc(String str) {
            String[] split = str.split(" ");
            Map<String, Integer> map = new TreeMap<>();
            for (int i = 0; i < split.length; i++) {
                String num = split[i];
                if (!map.containsKey(num)) {
                    map.put(num, 1);
                } else {
                    int count = map.get(num);
                    count++;
                    map.put(num, count);
                }
            }
            Set<String> keys = map.keySet();
            Collection<Integer> entries = map.values();
            Iterator<String> iteK = keys.iterator();
            Iterator<Integer> iteE = entries.iterator();
            while (iteK.hasNext()) {
                System.out.print(iteK.next() + "(" + iteE.next() + ")" + " ");
            }
        }
    }