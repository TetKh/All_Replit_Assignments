package Overloading;

public class MethodOverloadingDemo {


    public static void main(String[] args) {
        System.out.println(max(12,11));
//        System.out.println(max);

        String str = "Java";

        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));


    }

    // method signature -> name + parameters
    // method overloading -> creating a method with the same name and different parameters
    public static int max(int a, int b){
        return a>b ?  a : b;
    }

    public static double max(double a, double b){
        return a>b ?  a : b;
    }
}
