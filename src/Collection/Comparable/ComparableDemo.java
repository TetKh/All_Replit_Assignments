package Collection.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(23,11,54,22,67,33,56);

        //Collections.sort(list);

        //System.out.println(list);

        List<String> list2 =  Arrays.asList("23","sdfhs", "5hsdahfh", "dsjhfhs");

        //Collections.sort(list2);

        //System.out.println(list2);

        List<DuotechStudent> students = Arrays.asList(new DuotechStudent(1,21, "Oyat"),
                                                        new DuotechStudent(5,45, "Parviz"),
                                                        new DuotechStudent(6,23, "Rafael"),
                                                        new DuotechStudent(2,33, "Firdavs"),
                                                        new DuotechStudent(3,22, "Nazrin")
                                                       );

        //Collections.sort(students);



        Collections.sort(students, Comparator.comparing(duotechStudent -> duotechStudent.name) );

        for (DuotechStudent student : students) {
            System.out.println(student);
        }



        List<Employee> employees = Arrays.asList(new Employee(1,23,"Josh"),
                                                 new Employee(2,33,"Kamala"),
                                                 new Employee(45,66,"Donald"));


        Comparator<Employee> comparatorObject = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return o1.id - o2.id;
            }
        };

        Collections.sort(employees, comparatorObject);




        for (Employee employee : employees) {
            System.out.println(employee);
        }


        Collections.sort(employees, (o1, o2) -> o1.age - o2.age);

        System.out.println("Sorted by age:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, Comparator.comparing(employee -> employee.name) );

        System.out.println("Sorted by name:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }




    }
}
