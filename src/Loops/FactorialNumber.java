package Loops;

public class FactorialNumber {

    public static void main(String[] args) {
        // tests

        System.out.println(factorial(5));  //120
        System.out.println(factorial(8));  //40320
        System.out.println(factorial(10));  //3628800
        System.out.println(factorial(16));  //2004189184
    }

    public static int factorial(int num){
        // implementation
        int factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        return factorial;
    }
}