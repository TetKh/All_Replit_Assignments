package Basics;

public class AgeQuestionnareMulti {

    public static void main(String[] args) {
        System.out.println(yourAge2(19));

    }

    public static String yourAge2(int age) {
        if (age < 16) {
            return "You can't drive.";
        } else if (age < 18) {
            return "You can drive but not vote.";
        } else if (age < 25) {
            return "You can vote but not rent a car.";
        } else {
            return "You can do pretty much anything." ;
        }




    }
}