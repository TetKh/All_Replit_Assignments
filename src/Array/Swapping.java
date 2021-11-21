package Array;

public class Swapping {
    public static void main(String[] args) {

        //Swap given integer values without using a third temporary variable

        int a = 3;

        int b = 8;

        // write your code here

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is " + a); // a is 8
        System.out.println("b is " + b); // b is 3

    }
}