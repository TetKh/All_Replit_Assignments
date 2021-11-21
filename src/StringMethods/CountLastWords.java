package StringMethods;

import java.util.*;

public class CountLastWords {

    public static void main(String[] args) {
        String[] str1 = {"Hello.java", "25.xml", "world.java", "25.word", "hello.word"};
        System.out.println(countLastWord(str1));
    }


    public static Set<String> countLastWord(String[] a) {
        int count = 0;
        List<String> myList = new ArrayList<>();
        Set<String> newList = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            myList.add(a[i].substring(a[i].indexOf(".") + 1));
        }
        for (int i = 0; i < myList.size(); i++) {
            count = 0;
            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(i).equals(myList.get(j))) {
                    count++;
                }
            }
            if (!newList.contains(myList.get(i))) {
                newList.add(myList.get(i) + count);
            }
        }
        return newList;
    }
}


