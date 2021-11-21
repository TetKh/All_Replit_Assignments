package OOP.Constructors;

public class Clock {

    int hours;
    boolean isTicking;
    int diff;


    public static void main(String[] args) {

        Clock time = new Clock();

        time.hours = 9;
        time.isTicking = true;
        time.diff = 6;

        System.out.println(time.hours);
        System.out.println(time.isTicking);
        System.out.println(time.diff);

    }
}