package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineLists {
    public static void main(String[] args){

        List<String> list1 = Arrays.asList("hey", "yo");
        List<String> list2 = Arrays.asList("what", "up");

        System.out.println(combineTwo(list1, list2)); // [hey, yo, what, up]

        List<String> list3 = Arrays.asList("hi", "hello");
        List<String> list4 = Arrays.asList("how", "do", "you", "do");

        System.out.println(combineTwo(list3, list4)); // [hi, hello, how, do, you, do]



    }

    public static List<String> combineTwo(List<String> wordList1, List<String> wordList2){
        // implement

        List<String> newList = new ArrayList<>();

        newList.addAll(wordList1);
        newList.addAll(wordList2);

        return newList;
    }
}
/*
Collection.List.ArrayList<String> listOne = new Collection.List.ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

        Collection.List.ArrayList<String> listTwo = new Collection.List.ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        listOne.addAll(listTwo);    //Merge both lists

        System.out.println(listOne);
 */