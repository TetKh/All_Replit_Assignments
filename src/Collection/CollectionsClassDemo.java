package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {


    // Collections Framework -> java term for Collection.List, Set, Queue, Map interfaces
    // Collection -> super interface of Set, Collection.List and Queue
    // Collections -> utility class to perform operations such as search and sort on collections


    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("d");
        list.add("f");
        list.add("s");
        list.add("e");
        list.add("u");
        list.add("a");
        list.add("a");

        Collections.sort(list);


        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(Collections.binarySearch(list, "d"));


//        Collections.shuffle(list);
//
//        System.out.println(list);
//
//        System.out.println(Collections.max(list));
//        System.out.println(Collections.min(list));
//
//        System.out.println(Collections.frequency(list,"a" ));

    }
}
