package Collection.List.ArrayList;

import java.util.ArrayList;

public class Add_Insert {
    
    public static void main(String[] args){

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("hi");
        list1.add("what");
        list1.add("who");
        addYo(list1);
        System.out.println(list1); // [hello, yo, hi, yo, what, yo, who]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("what");
        list2.add("who");
        addYo(list2);
        System.out.println(list2); // [hello, yo, what, yo, who]

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("what");
        addYo(list3);
        System.out.println(list3); // [hello, yo, what]

    }


    public static void addYo(ArrayList<String> words) {

        //implement

        for (int i = 0; i < words.size(); i++) {
            if (i % 2 != 0) {
                words.add(i, "yo");
            }
        }
        }
    }
