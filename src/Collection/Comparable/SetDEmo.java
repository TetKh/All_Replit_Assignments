package Collection.Comparable;

import java.util.*;

public class SetDEmo {


    public static void main(String[] args) {


        Set<String> set = new HashSet<>();

        set.add("Rafael");
        set.add("Oyat");
        set.add("Tatiana");
        set.add("Firdavs");
        set.add("Firdavs");
        set.add("Firdavs");
        set.add("Bahar");

        System.out.println(set);

        List<Integer> numbers = Arrays.asList(1,1,22,22,3,3,3,3,3,3,5,5,6,10,34,10,43,23,44,66,33,66);

        Set<Integer> unique = new HashSet<>(numbers);

        numbers = new ArrayList<>(unique);
        System.out.println(numbers);


        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Rafael");
        set1.add("Oyat");
        set1.add("Tatiana");
        set1.add("Firdavs");
        set1.add("Firdavs");
        set1.add("Firdavs");
        set1.add("Bahar");

        System.out.println(set1);


        Set<Integer> numbers1 = new TreeSet<>();

        numbers1.add(23);
        numbers1.add(23);
        numbers1.add(23);
        numbers1.add(44);
        numbers1.add(21);
        numbers1.add(1);
        numbers1.add(9);

        System.out.println(numbers1);

        Set<Integer> uniqueNumsSorted = new TreeSet<>(numbers);

        System.out.println(uniqueNumsSorted);


        Set<DuotechStudent> setEmp = new TreeSet<>();

        setEmp.add(new DuotechStudent(12, 23, "Xavier"));
        setEmp.add(new DuotechStudent(11, 33, "Henry"));
        setEmp.add(new DuotechStudent(12, 23, "Ivan"));

        System.out.println(setEmp);



        // DO Sets allow null values

        Set<String> sc = new HashSet<>();
        sc.add("dhsvb");
        sc.add("dhsvb");
        sc.add(null);
        sc.add(null);
        System.out.println(sc);


        Set<String> scl = new LinkedHashSet<>();
        scl.add("dhsvb");
        scl.add("dhsvb");
        scl.add(null);
        scl.add(null);
        System.out.println(scl);


        Set<String> trm = new TreeSet<>();
        trm.add("jdksnbhbf");
//        trm.add(null);
         //TreeSet does not allow null values since it sorts the collection as you add items



        Set<String> set3 = new HashSet<>();

        set3.add("Rafael");
        set3.add("Oyat");
        set3.add("Tatiana");
        set3.add("Firdavs");
        set3.add("Firdavs");
        set3.add("Firdavs");
        set3.add("Bahar");

        System.out.println(set3);

        System.out.println(set3);

        Iterator<String> iterator = set3.iterator();

//        iterator.next();
//        iterator.next();
//        iterator.next();
//        System.out.println(iterator.next());


        while(iterator.hasNext()){
            String val = iterator.next();
            if(val.equals("Oyat")){
                System.out.println(val);
            }
        }

        for (String s : set3) {
            System.out.println(s);
        }






    }
}
