package Collection.List.ArrayList;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class ArrayListDemo {


    public static void main(String[] args) {


        ArrayList list = new ArrayList();  // old syntax(pre Java 1.5) for creating an arraylist

        list.add("java");
        list.add(45);
        list.add(20.45);


        ArrayList <String> listStrings = new ArrayList<>(); // the type can be omitted starting from Java 1.7
        listStrings.add("java");
//        listStrings.add(45);
//        listStrings.add(20.45);

        listStrings.add("javascript");

        System.out.println(listStrings);

//       Collection.List.ArrayList<Integer> numbers = new Collection.List.ArrayList<>();
//        numbers.add(23);
//        numbers.add(23);
//        numbers.add(23);
//        numbers.add(23);
//



        List <Integer> numbers = new ArrayList<>();

        char[] ch = new char[45];
        Character[] ch2 = new Character[23];

  //     Collection.List<char> chaars = new Collection.List.ArrayList<>();
        List<Character> chaars = new ArrayList<>();
        char c = 'r';
        chaars.add(c); // you can pass primitives which will be autoboxed into wrapper types
        chaars.add(new Character('w'));
        System.out.println(chaars);
//
        chaars.add('t');


        chaars.add(1, 'u');
        System.out.println(chaars);

//        chaars.clear();
//        System.out.println(chaars);

        if(chaars.contains('w')){
            System.out.println("The list contains w character");
        }

        System.out.println(chaars.get(2));   //  arr[2]

        for (int i = 0; i < chaars.size(); i++) {
            System.out.println(chaars.get(i));
        }


        System.out.println(chaars);

        chaars.add(4, 'z');

        System.out.println(chaars);

        chaars.add(0, 'x');

        System.out.println(chaars);

         chaars.add(chaars.size(), 'q');

        System.out.println(chaars);

        System.out.println(chaars.size());

        chaars.remove(0);

        System.out.println(chaars);

        System.out.println(chaars.size());

        chaars.add('r');
        System.out.println(chaars);

//
        chaars.remove(new Character('r'));
//
        System.out.println(chaars);


        List<Integer> list2 = new ArrayList<>();

        list2.add(0);
        list2.add(0);
        list2.add(1);

        System.out.println(list2);

        System.out.println(list2.remove(new Integer(1)));

        System.out.println(list2);

        System.out.println(list2.remove(new Integer(2))); // no exception, but returns false

//        System.out.println(list2.remove(-1));  // an exception is thrown

     //   arr[1] = arr[1].substring(2);

        List<Double> doubleList = new ArrayList<>();

        doubleList.add(23.1);
        doubleList.add(11.2);
        doubleList.add(1.3);
        doubleList.add(new Double("2.1"));

        System.out.println(doubleList);

        System.out.println(doubleList.set(1,22.4));
        // returns the value that it is replacing

        System.out.println(doubleList);

        System.out.println(doubleList.indexOf(2.1)); //3
        System.out.println(doubleList.indexOf(2.2)); // -1

        System.out.println(doubleList.isEmpty());

          String name = "Parviz";
          String last = "Hatamov";
          int age = 34;
          double salary = 120000.50;
          Date dateOfBirth = new Date("08/08/1987");


        List<Object> data = new ArrayList();

        data.add(name);
        data.add(last);
        data.add(age);
        data.add(salary);
        data.add(dateOfBirth);

        System.out.println(data);

        for (Object datum : data) {
            System.out.println(datum);
        }














    }
}
