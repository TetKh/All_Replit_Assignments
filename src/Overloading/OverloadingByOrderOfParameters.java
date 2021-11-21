package Overloading;

public class OverloadingByOrderOfParameters {


    public static void main(String[] args) {



    }



    public static void myMethod(int x, String st){

        System.out.println("int String");
    }

    public static void myMethod(String st, int x){

        System.out.println("String int");
    }



}
