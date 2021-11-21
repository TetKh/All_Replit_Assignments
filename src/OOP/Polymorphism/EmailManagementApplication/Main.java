package OOP.Polymorphism.EmailManagementApplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("How many emails would you like to generate today?: ");
        Scanner sc = new Scanner(System.in);
        int numberOfEmails = Integer.parseInt(sc.next());
        int numberOfTries = 0;
        int batchNo = 0;
        int depId = 0;
        String fn = "";
        String ln = "";
        String emailType = "";
        String result = "";

        do {
            numberOfTries++;
            System.out.println("Creating the email #" + numberOfTries + "...");
            System.out.println("Choose the type: " + "\n" +
                    "1.Student " + "\n" +
                    "2.Staff");
            emailType = sc.next();

            System.out.println("First Name: ");
            fn = sc.next();

            System.out.println("Last Name: ");
            ln = sc.next();

            if (emailType.equals("1")) {
                System.out.println("Batch No: ");
                batchNo = Integer.parseInt(sc.next());
            }
            if (emailType.equals("2")) {
                System.out.println("Department ID: " + "\n" +
                        "1.Accounting" + "\n" + "2.Sales" + "\n" + "3.Marketing" + "\n" + "4.Instructors");
                depId = Integer.parseInt(sc.next());
            }

            System.out.println("An email has been created.");
            System.out.println("___________________________________________");

            Email e = new StudentEmail("", "", batchNo);;

            e.setFirstName(fn);
            e.setLastName(ln);

            switch (emailType){
                case "1" :
                    e = new StudentEmail(e.getFirstName(), e.getLastName(), batchNo);
                    break;
                case "2" :
                    e = new StaffEmail(e.getFirstName(), e.getLastName(), depId);
                    break;
            }
            result = result + e + "\n***********************************************" + "\n";

       } while (numberOfEmails != numberOfTries);

        System.out.println("Here are the emails you have been created:");

        System.out.println(result);

        System.out.println("THANK YOU FOR USING DUOTECH SMA! GOOD BYE!");

    }
}

/*
Your application should do the following:

- Asks the user about the number of emails he/she wants to generate
(hint: create and store them in an array of super type)

- Creates the corresponding number of emails, where it asks the following info for each email:
    - The type of the email
    - First name
    - Last name
    - Batch Number, if it is for a student email
    - Department ID, if it is for a staff email

- After all emails have been created, displays all the information
about the created emails and ends the application.
- Refer to the attached document for examples of the console output.
 */
