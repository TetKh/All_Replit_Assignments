package OOP.Polymorphism.EmailManagementApplication;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("Enter the number of emails you want to generate: ");
        Email[] emails = new Email[sc.nextInt()];
        for (int i = 0; i < emails.length; i++) {
            String fName, lName;
            int batchNo, departmentID, choice;
            do {
                System.out.println("------------------------------------------------------------------------------");
                System.out.printf("Creating the email #%d...\nChoose the type:\n1. Student\n2. Staff\n", i + 1);
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.printf("First Name: ");
                        fName = sc.nextLine();
                        System.out.printf("Last Name: ");
                        lName = sc.nextLine();
                        System.out.printf("Batch No: ");
                        batchNo = sc.nextInt();
                        emails[i] = new StudentEmail(fName, lName, batchNo);
                        break;
                    case 2:
                        System.out.printf("First Name: ");
                        fName = sc.nextLine();
                        System.out.printf("Last Name: ");
                        lName = sc.nextLine();
                        do {
                            System.out
                                    .printf("Department ID:\n1. Accounting\n2. Sales\n3. Marketing\n4. Instructors\n");
                            departmentID = sc.nextInt();
                            switch (departmentID) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    break;
                                default:
                                    System.out.printf("\nWrong Department!!");
                            }
                        } while (departmentID < 1 || departmentID > 4);
                        emails[i] = new StaffEmail(fName, lName, departmentID);
                        break;
                    default:
                        System.out.printf("\nWrong choice!!");
                }
                System.out.printf("\nAn email has been created.\n");
            } while (choice != 1 && choice != 2);
        }
        System.out.printf("\nHere are the emails that have been created:\n");
        for (int i = 0; i < emails.length; i++) {
            System.out.printf("%s\n*************************************************\n", emails[i].toString());
        }
        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
        sc.close();
    }
}