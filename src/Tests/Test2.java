package Tests;

public class Test2 {

    public static void main(String[] args) {
calculateNumber(5,10);

fullNameAndInitials("Rafael Azizov");
    }

    public static void calculateNumber(int a, int b){
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(a % b);
        System.out.println(a + b);
        System.out.println(b - a);
    }

    public static void fullNameAndInitials(String fullName) {

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Your initials: " + firstNameInitial + lastNameInitial);
    }
}
