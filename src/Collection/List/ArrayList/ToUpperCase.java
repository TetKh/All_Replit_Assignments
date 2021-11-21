package Collection.List.ArrayList;

import java.util.ArrayList;


public class ToUpperCase {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("world");

        System.out.println(upperCase(list));
    }
    public static ArrayList<String> upperCase(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
        return list;
    }
}