package OOP.ObjectClass;

public class Dog extends Demo{

    String name = "Rex";

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                ", name='" + name + '\'' +
                '}';
    }



}
