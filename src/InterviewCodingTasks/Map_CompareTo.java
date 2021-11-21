package InterviewCodingTasks;

import java.util.*;


public class Map_CompareTo {



        public static void main(String[] args) {
            TreeMap<String, Integer> initTree = new TreeMap();
            initTree.put("D", 0);
            initTree.put("C", -3);
            initTree.put("A", 43);
            initTree.put("B", 32);
            System.out.println("Sorted by keys:");
            System.out.println(initTree);
            List list = new ArrayList(initTree.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e1.getValue().compareTo(e2.getValue());
                }
            });
            System.out.println("Sorted by values:");
            System.out.println(list);
        }
    }

