package Basics;

public class TernaryDemo {

    public static void main(String[] args) {


        int a = (4 > 0)? 12 : 8;
        System.out.println(a);

        String s = "Java";
        double eq = s.equals("Java")? 5.7 : 2.2;
        System.out.println(eq);

        System.out.println(leapYear(2400)? "leap year" : "not leap year");

    }

    public static boolean leapYear(int year) {

        return (year % 100 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
