package Overloading;

public class AmbiguousCall {

    public static void main(String[] args) {

        add(8, 2.1);
        add(6.4, 8);
        //   add(2 , 3); // ambiguous method call results in compiler error
        // to fix the compiler error, you need to pass more precise arguments
    }



    public static void add(int i, double j){

        System.out.println(i+j);

    }

    public static void add(double j, int i){

        System.out.println(i+j);

    }
}
