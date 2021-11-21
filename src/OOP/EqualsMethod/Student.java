package OOP.EqualsMethod;

import java.util.Objects;

public class Student {

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


//    @Override
//    public boolean equals(Object o) {
//
//        if(this.id == ((Student)o).id  && this.age == ((Student)o).age  && this.name.equals(((Student)o).name)){
//            return true;
//        }else{
//            return false;
//        }
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age);
    }
}
