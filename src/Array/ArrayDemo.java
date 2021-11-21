package Array;

import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {


        // Instructor wants to store students' grades in some data structure

        int i;
        i = 89;

        String str = new String();

//        int [] grades;

//        int grades1 [];  // syntax that comes from C++
        //Arrays are considered objects
        // Arrays are considered Reference type
        int [] grades = new int[10];
        //

        grades[0] = 67;
        grades[1] = 89;
        grades[2] = 99;
        grades[3] = 77;
        grades[4] = 90;


        int size = grades.length;
        System.out.println(size);

        System.out.println(grades);





        for (int j = 0; j < grades.length ; j++) {

            System.out.print(grades[j] + " ");
        }

        System.out.println();


        // Array initializer -> shorthand version of initializing an array with actual values

//        int [] grades2;
//        grades = {60,77,88,99,100};

        int [] grades2 = {60,77,88,99,100,99};

        System.out.println(grades2.length);


        char [] word = {'h', 'e', 'l', 'l', 'o'};

        for (int j = word.length -1; j >=0 ; j--) {
            System.out.print(word[j]);
        }

        System.out.println();
        //Arrays can store both primitives and objects(reference types)
        String h = "Firdavs";
        String s = new String("Zak");
        String[] names = {"Rafael", "Oyat", "Kurush", h, s, new String("Gulara") };


        double [] nums2 = {45.8, 46, 56.8f, 67L, 'a' };
        // Arrays class must be imported to use,
        System.out.println(Arrays.toString(nums2));


        boolean [] b = {true, false};

        String[] stre = {"name", "name"};


        stre[0] = "hello";
        stre[1] = "hi";

//        stre[2] = "bye";  // no compiler error
//        stre[1000] = "bye";
//        stre[-1] = "bye";

        System.out.println(Arrays.toString(stre));

        System.out.println(stre[0] + stre[1] + stre[0]);


        byte []  b1 = new byte [10];

        System.out.println(Arrays.toString(b1));




        long []  l1 = new long [10];
//
        System.out.println(Arrays.toString(l1));

        float [] f = new float[5];
        System.out.println(Arrays.toString(f));

        char [] ch = new char[5];
        System.out.println(Arrays.toString(ch));

        String[] str5 = new String[5];
        System.out.println(Arrays.toString(str5));

        Character[] chars = new Character[17];
        System.out.println(Arrays.toString(chars));


        Scanner[] scans = new Scanner[2];
        System.out.println(Arrays.toString(scans));


        System.out.println(scans);
        //



        String str7 = "Java is fun";

        char[] chars1 = str7.toCharArray();

        System.out.println(Arrays.toString(chars1));
        System.out.println(chars1); // For char[] it prints the content out as a String


        int k = 67;

        int m = 100;

        int temp;

        temp = m;

        m = k;

        k = temp;


        System.out.println(k + " " + m);




        String str8 = "Java is interesting and challenging";


        String[] s1 = str8.split(" ");


        System.out.println(Arrays.toString(s1));

        // Java is fun  -> avaJ si nuf



    }
}
