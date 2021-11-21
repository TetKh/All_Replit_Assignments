package Basics;

public class LeapYear {
    public static void main(String[] args) {


        System.out.println(leapYear(2400)? "leap year" : "not leap year");
        // Write a method that returns true if the given year is a leap year.
        // The rules:
        //  Divisible by 4 but not by 100 or it is divisible by 400
    }

    public static boolean leapYear(int year) {

        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

    }

}
