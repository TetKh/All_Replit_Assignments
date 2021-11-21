package OOP.Inheritance.Student;

public class Main {

    public static void main(String[] args) {
        // Test your class

        Student st = new Student("Mike", "New York", "Java", 1965, 600);
        System.out.println(st.toString());

        Staff s = new Staff("Jack", "Brooklyn", "NYU", 800);
        System.out.println(s.toString());

    }
}
