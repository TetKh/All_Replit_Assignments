package Collection.List.ListMethods;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("d");
        list.add("f");list.add("s");
        list.add("e");
        list.add("u");

        List<String> strings = list.subList(1, 3);

        List<String> strings2 = new ArrayList<>(strings); // d,f

        list.addAll(strings2);

        System.out.println(list);




    }
}
