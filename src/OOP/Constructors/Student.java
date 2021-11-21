package OOP.Constructors;

import java.util.Arrays;
public class Student{

    String firstName;
    String lastName;
    int batchNo;
    boolean isOnCampus;
    String studentID;
    final static String [] subjects;
    static String SCHOOL_NAME;
    static int numberOfStudentsCreated;
    static int tuitionBalance;

    static {
        SCHOOL_NAME = "Duotech";
        numberOfStudentsCreated = 0;
        subjects = new String []{"Java", "HTML", "Selenium", "Cucumber", "RestAssured", "SQL"};
    }

    public Student(){
        numberOfStudentsCreated++;

    }
    public Student(String firstName, String lastName, int batchNo, boolean isOnCampus){

        this.firstName = firstName;
        this.lastName = lastName;
        this.batchNo = batchNo;
        this.isOnCampus = isOnCampus;
        this.studentID = generateStudentID();

        if (isOnCampus){
            this.tuitionBalance = 5000;
        } else {
            this.tuitionBalance = 4000;
        }
        numberOfStudentsCreated++;
    }

    public String generateStudentID(){

        String randomThree = "";
        for (int i = 0; i < 3; i++) {
            randomThree += (int) (1 + (Math.random() * 9));
        }
        return firstName.substring(0, 1).toUpperCase() + lastName.substring(lastName.length()-1).toUpperCase() + batchNo + randomThree;
    }
    public String getStudentInfo(){

        return ("STUDENT: " + firstName + " " + lastName + "\n" +
                "SCHOOL: " + SCHOOL_NAME + "\n" +
                "BATCH: " + batchNo + "\n" +
                "STUDENT ID: " + generateStudentID() + "\n" +
                "ON-CAMPUS: " + (isOnCampus ? "yes" : "no") + " \n" +
                "SUBJECTS: "+ getSubjects() + "\n" +
                "TUITION BALANCE: " + tuitionBalance);

    }
    public static String getSubjects(){

        return Arrays.toString(subjects);
    }
    public static void payTuition(int a){

        int newBalance = tuitionBalance - a;

        if (newBalance > 0){
            System.out.println("The new balance is $" + newBalance);
        } else if (newBalance == 0){
            System.out.println("The tuition is paid off.");
        } else if (newBalance < 0){
            System.out.println("The tuition is paid off. A credit of " + (a - tuitionBalance) + " dollars is applied to this account.");
        }
    }
}