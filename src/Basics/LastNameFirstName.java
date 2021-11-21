package Basics;

public class LastNameFirstName {

    public static void main(String[] args) {
        // Test your methods here
        fullName("Che", "Givara");
        System.out.print(fullName("Che", "Givara"));



    }

    public static String fullName(String firstName, String lastName){

        //Create your 2 methods here
        // String firstName = "Che";
        // String lastName = "Givara";
        // System.out.print(lastName + ", " + firstName);
        String st = lastName + ", " + firstName;
        return st; // == return lastName + ", " + firstName;

    }

}

