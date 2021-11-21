package Basics;

public class IntMax {

    public static void main(String[] args) {

        System.out.println(intMax(1, 2, 3)); //should print 3
        System.out.println(intMax(1, 3, 2)); //should print 3
        System.out.println(intMax(3, 2, 1)); //should print 3
        System.out.println(intMax(-3, -1, -2)); //should print -1
    }

    public static int intMax(int num1, int num2, int num3) {

        return Math.max(num1, Math.max(num2, num3));

    }

    }
