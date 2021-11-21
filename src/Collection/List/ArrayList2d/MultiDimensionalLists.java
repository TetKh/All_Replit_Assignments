package Collection.List.ArrayList2d;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalLists {


    public static void main(String[] args) {

        Object [][] arr  = {  // Collection.List.ArrayList<Collection.List.ArrayList<Object>>
                {"first", "last", "batch no", "state"},
                {"Joe", "Biden", 6, "DE"},
                {"Kamala", "Harris", "7", "CA"}

        };


        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<ArrayList<String>>();
        ArrayList<Object> twoDArrayList1 = new ArrayList<>();

        List<List<String>> list = new ArrayList<>();
        System.out.println(list);

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        System.out.println(list);


        list.get(0).add("first");
        list.get(0).add("last");
        list.get(0).add("batch");
        list.get(0).add("state");

        list.get(1).add("Joe");
        list.get(1).add("Biden");
        list.get(1).add("6");
        list.get(1).add("DE");

        list.get(2).add("Kamala");
        list.get(2).add("Harris");
        list.get(2).add("5");
        list.get(2).add("CA");


        System.out.println(list);


        list.get(1).set(3, "DC");

        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + "\t\t");
            }
            System.out.println();


        }



    }
}
