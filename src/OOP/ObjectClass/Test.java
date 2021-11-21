package OOP.ObjectClass;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Demo d = new Demo();

        System.out.println(d.toString());

        System.out.println(new Dog().toString());



        Demo d1 = new Demo();

        System.out.println(d1);  // System.out.println(d1.toString());

        System.out.println(new Dog()); // System.out.println(new Dog().toString());

        int [][] arr = new int[3][5];
        StringBuilder sb3 = new StringBuilder("dfsgj");
        System.out.println(arr); // array's toString method is NOT overridden

        String str = "java";

        System.out.println(str.toString());

        StringBuilder sb = new StringBuilder("python");

        System.out.println(sb.toString());

         Object o;

        String str2 = "js";

        System.out.println(str2.equals("js")); // String class overrides equals method of Object class

        int [] arr2 = {1,2,3};
        int [] arr3 = {1,2,3};

        System.out.println(arr2.equals(arr3)); // false because arrays don't override Object's equals method
        System.out.println(arr2 == arr3); // false
        System.out.println(Arrays.equals(arr2, arr3));

        System.out.println(new StringBuilder("hello").equals(new StringBuilder("hello")));
        // StringBuilder did not override equals()  method so we can't use equals method to compare contents




        System.out.println(sb3.getClass());












    }
}
