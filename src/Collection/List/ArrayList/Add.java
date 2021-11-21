package Collection.List.ArrayList;

import java.util.ArrayList;

public class Add {

        public static void main(String[] args) {

            System.out.println(test());

        }


        public static ArrayList<String> test() {

            ArrayList<String> l = new ArrayList<>();
            l.add("NYC");
            l.add("SF");
            l.add("LA");

            return l;
        }
    }

/*
Implement the test method that creates an empty Collection.List.ArrayList of Strings and adds three names (any names)
to it and returns it.
 */