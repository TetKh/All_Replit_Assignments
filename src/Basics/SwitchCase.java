package Basics;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println(days("friday"));

    }

    public static String days(String day) {


        switch (day) {
            case "monday":

            case "tuesday":

            case "wednesday":

            case "thursday":
                return"Working Hard!!!";

            case "friday":
                return "The weekend is almost here! TGIF!!!";

            case "saturday":

            case "sunday":
                return "It's party time! Alright, Alright, Alright!";

            default:
                return "You partied too hard this weekend, bro!";

        }

    }
}
