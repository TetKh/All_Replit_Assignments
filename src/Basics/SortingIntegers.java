package Basics;

public class SortingIntegers {

    public static void main(String[] args) {

        sort3Ints(3,2,1); //->  1,2,3
        sort3Ints(3,3,1); //->  1,3,3
        sort3Ints(-2,-10,-1); //->  -10,-2,-1
        sort3Ints(99,78,22); //->  22,78,99
        sort3Ints(0,-2,1); //->  -2,0,1
        sort3Ints(7,0,0); //->  0,0,7
        sort3Ints(5,5,5); //->  5,5,5

    }

    public static void sort3Ints(int a, int b, int c) {

        // int temp = a; a = b; b = c; c = temp;
        int num1 = (Math.min(a, Math.min(b, c)));
        int num3 = (Math.max(a, Math.max(b, c)));
        int num2 = a + b + c - num1 - num3;

        System.out.println(num1 + "," + num2 + "," + num3);

        //System.out.println(Math.max(a, Math.max(b, c)));


    }
}
