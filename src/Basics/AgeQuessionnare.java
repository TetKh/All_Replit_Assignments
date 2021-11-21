package Basics;

public class AgeQuessionnare {
    public static void main(String[] args) {
        yourAge(17);

    }

    public static void yourAge(int age) {
        if (age < 16) {
            System.out.println("You can't drive.");
        }
        if (age < 18) {
            System.out.println("You can't vote.");
        }
        if (age < 25) {
            System.out.println("You can't rent a car.");
        } else {
            System.out.println("You can do anything that's legal.");
        }

    }


}
      /*
        age is less than 16, say "You can't drive."
        age is less than 18, say "You can't vote."
        age is less than 25, say "You can't rent a car."
        age is 25 or over, say "You can do anything that's legal."
       */