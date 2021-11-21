package OOP.EqualsMethod;

public class Tester {

    public static void main(String[] args) {
        Student student1 = new Student(10, "Johh Doe", 35);
        Student student2 = new Student(10, "Johh Doe", 35);

        System.out.println(student1.equals(student2));
    }
}
