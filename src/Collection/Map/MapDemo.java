package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {


    public static void main(String[] args) {


        Map<Integer, String> students = new HashMap<>();

        students.put(2, "Oyat");
        students.put(5, "Irina");
        students.put(3, "Bahar");
        students.put(1, "Kurush");
        students.put(4, "Oyat");
        students.put(4, "Firdavs"); // overrides "Oyat"
        students.put(10, "Parviz");





        System.out.println(students);


        Map<Integer,String> newMap = new HashMap<>(20);

        newMap.putAll(students);

        System.out.println(newMap);

        newMap.remove(2);

        System.out.println(newMap);

//        newMap.clear();
//
//      System.out.println(newMap);

        System.out.println(newMap.containsKey(1));

        System.out.println(newMap.containsValue("Irina"));

        System.out.println(newMap.size());

        Set<Integer> integers = newMap.keySet();

        System.out.println(integers);

        Set<Map.Entry<Integer, String>> entries = newMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
           entry.setValue("Duotech");
        }

        System.out.println(newMap);












    }
}
