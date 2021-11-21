package OOP.Polymorphism.EmailManagementApplication;

import java.util.Scanner;

class Main2 {
    static int emailCounting = 0;
    public static void main(String[] args) {
        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("How many emails would you like to generate today?: ");
        Scanner myInput = new Scanner(System.in);
        int countOfEmails = myInput.nextInt();
        Email[] createdEmails = new Email[countOfEmails];
        do {
            emailCounting++;
            System.out.println("Creating the email #" + emailCounting + "...");
            System.out.println("Choose the type: ");
            System.out.println("1.Student");
            System.out.println("2.Staff");
            int chooseTheType = myInput.nextInt();
            System.out.print("First Name: ");
            String firstName = myInput.next();
            System.out.print("Last Name: ");
            String lastName = myInput.next();
            int batchNo = 0;
            int departmentID = 0;
            switch (chooseTheType) {
                case 1:
                    System.out.print("Batch No: ");
                    batchNo = myInput.nextInt();
                    break;
                case 2:
                    System.out.println("Department ID: ");
                    System.out.println("1.Accounting: ");
                    System.out.println("2.Sales: ");
                    System.out.println("3.Marketing: ");
                    System.out.println("4.Instructors: ");
                    departmentID = myInput.nextInt();
                    break;
            }
            Object o = new Object();
            switch (chooseTheType) {
                case 1:
                    o = new StudentEmail(firstName, lastName, batchNo);
                    break;
                case 2:
                    o = new StaffEmail(firstName, lastName, departmentID);
                    break;
            }
            createdEmails[emailCounting - 1] = (Email) o;
            System.out.println("An email has been created!");
            System.out.println("------------------------------------------------------------------------------");
        }while (emailCounting < countOfEmails);
        System.out.println("Here are the emails that have been created: ");
        for (Email e : createdEmails) {
            System.out.println(e);
            System.out.println();
            System.out.println("*******************************************************************************");
        }
        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
    }
}
