package Overloading;

public class OverloadingByTypeOfParameters {


    public static void main(String[] args) {
        myMethod(5.6);


    }



    public static void myMethod(int x){

        System.out.println("INT");
    }

    public static void myMethod(double x){

        System.out.println("DOUBLE");
    }

    public static void myMethod(boolean x){

        System.out.println("BOOLEAN");
    }

    public static void myMethod(String x){

        System.out.println("STRING");
    }


}
