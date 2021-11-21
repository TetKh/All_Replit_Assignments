package Overloading;

public class OverloadingByNumberOfParameters {


    public static void main(String[] args) {
        myMethod();
        myMethod(3);
        myMethod(4,5);
        myMethod(3,2,4);

    }



    public static void myMethod(){
        System.out.println("NO ARG");
    }

    public static void myMethod(int x){
        System.out.println("INT");
    }

    public static void myMethod(int x, int y){
        System.out.println("2 INT");
    }

    public static void myMethod(int x, int y, int z){
        System.out.println("3 INT");
    }

    public static void sort(int [] arr){
        // logic of sorting int arr
    }

    public static void sort(char [] arr){
        // logic of sorting char arr
    }

    public static void sort(String [] arr){
        // logic of sorting String arr
    }
}
