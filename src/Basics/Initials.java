package Basics;

public class Initials {

    public static void main(String[] args) {

        System.out.println(printInfo("Rafael Azizov"));

    }
    public static String printInfo(String name) {

        String lastName = name.substring(name.indexOf(" ")+1);
        String firstName = name.substring(0, name.indexOf(" "));

        char initial1 = firstName.charAt(0);
        char initial2 = lastName.charAt(0);
        int initials = initial1 + initial2;


        return "The name: " + firstName  +
                " The last name: " + lastName  +
                " The initials: " + initial1 + initial2;



    }
}
