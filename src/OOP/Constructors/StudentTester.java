package OOP.Constructors;

import java.util.Scanner;
public class StudentTester {

    public static void main(String[] args) {

        String answer = "";

        do {
            System.out.println("******************** DUOTECH STUDENT MANAGEMENT APPLICATION ********************");
            System.out.println("---------------------------------------------------------------------------------");

            // implement the logic of the application here

            System.out.println("Please enter the information about a new student");
            Scanner inp = new Scanner(System.in);
            System.out.print("FIRST NAME: ");
            String firstName = inp.next(); // Parviz
            System.out.print("LAST NAME: ");
            String lastName = inp.next(); // Hatamov
            System.out.print("BATCH: ");
            String batchNumber = inp.next(); // "5"
            int batchNo = Integer.parseInt(batchNumber); // 5
            System.out.print("ON-CAMPUS?: (true/false) "); // "true"
            String isOnCampus = inp.next();

            boolean OnCampus = false;
            if (isOnCampus.equals("true")) {
                OnCampus = true;
            }

            System.out.println();
            System.out.println("Creating a new student...");
            System.out.println();

            System.out.println("Here is the information about new student:");
            System.out.println("------------------------------------------");

            Student student = new Student(firstName, lastName, batchNo, OnCampus);

            System.out.println(student.getStudentInfo());
            System.out.println();

            System.out.println("What is the amount of tuition payment being made by the student today?: ");
            System.out.println("---------------------------------------------------------------------------------");

            String payt = inp.next();
            System.out.println("---------------------------------------------------------------------------------");

            Student.payTuition(Integer.parseInt(payt));
            System.out.println("---------------------------------------------------------------------------------");

            if (Student.numberOfStudentsCreated == 1) {
                System.out.println("You have added " + (Student.numberOfStudentsCreated) + " student to the database.");
            } else {
                System.out.println("You have added " + (Student.numberOfStudentsCreated) + " students to the database.");
            }

            System.out.println("Would you like to add another student? (yes/no)");
            answer = inp.next();

        } while (answer.equalsIgnoreCase("yes"));

            System.out.println("THANK YOU FOR USING DUOTECH STUDENT MANAGEMENT APPLICATION. GOODBYE!");
                }
            }
