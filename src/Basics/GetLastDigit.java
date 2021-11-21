package Basics;

public class GetLastDigit {

    public static void main(String[] args) {

        System.out.println(getLastDigit(23)); //should print 3
        System.out.println(getLastDigit(123526)); //should print 6
        System.out.println(getLastDigit(10)); //should print 0
        System.out.println(getLastDigit(5)); //should print 5
    }

    public static int getLastDigit(int num) {

        return num %10;

    }
}
