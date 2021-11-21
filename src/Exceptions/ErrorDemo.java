public class ErrorDemo {


    public static void main(String[] args) {


        Error e;
        //An Error is a subclass of Throwable that indicates serious problems
        // that a reasonable application should not try to catch.
        // Most such errors are abnormal conditions.

        int [] largeArr = new int[1000000000];

        // OutOfMemoryError is an Error that happens when Java runs out of heap memory

//        method1();   //StackOverflowError
        //Thrown when a stack overflow occurs because an application recurses too deeply.
    }



    public static void method1(){
        method1();
    }
}
