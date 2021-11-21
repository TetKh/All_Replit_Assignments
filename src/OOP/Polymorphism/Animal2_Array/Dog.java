package OOP.Polymorphism.Animal2_Array;

public class Dog extends Animal{

    String name;
    String breed;

    public void move(){
        System.out.println("Dog is running");
    }


    public void makeNoise(){
        System.out.println("Dog is barking");
    }


    public void eat(){
        System.out.println("Dog is eating bones");
    }



}
