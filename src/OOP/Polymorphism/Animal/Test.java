package OOP.Polymorphism.Animal;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        Dog dog  = new Dog();
//        Animal animal = new Animal();

        // Polymorphism benefits
        // Re-usable code
        // Less code
        // Saves memory
        // Readability
        // Flexible

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Animal Kingdom. Please enter the animal type:");
        String animalType  = scan.next();
        Animal animal2 = null;
        switch(animalType){
            case "bird" :
                animal2 = new Bird();
                break;
            case "snake" :
                animal2 = new Snake();
                break;
            case "dog" :
                animal2 = new Dog();
                break;
        }

         // Polymorphism

        animal2.makeNoise();
        animal2.move();
        animal2.eat();
        animal2.makeNoise();
        animal2.move();
        animal2.eat();
        animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat(); animal2.makeNoise();
        animal2.move();
        animal2.eat();























    }
}
