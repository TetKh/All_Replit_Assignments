package OOP.Polymorphism.Animal;

public class Bird extends Animal{

    public void move(){

        System.out.println("Bird is flying");
    }


    public void makeNoise(){

        System.out.println("Bird is chirping");
    }


    public void eat(){

        System.out.println("Bird is eating worms");
    }
}
