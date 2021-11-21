package OOP.Polymorphism.Student;

public class Main {

    public static void main(String[] args) {


        Student[] arr = {new OnCampusStudent("Alex", "Lee", 234),
        new OnCampusStudent("Mike", "Bloomberg", 123),
        new OnlineStudent("Aziz", "Ansari", "MD"),
        new OnlineStudent("Ashley", "Nickson", "AZ")};

        for (Student s:
             arr) {

            System.out.println(s);

        }

        }



    }

