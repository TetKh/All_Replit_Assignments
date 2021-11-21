package OOP.Polymorphism.Animal;

public class AnotherTest {


    public static void main(String[] args) {
        Dog dog = new Dog();
//        printAnimalNoise(dog);
//        printAnimalNoise(new Bird());
//        printAnimalNoise(new Snake());

        Animal[] arr = new Animal[6];

        arr[0] = new Snake();
        arr[1] = new Snake();
        arr[2] = new Bird();
        arr[3] = new Dog();
        arr[4] = new Dog();
        arr[5] = new Dog();


        for (Animal animal : arr) {
            animal.eat();
        }

        printAnimalNoise(new Snake());
    }

   public static void printAnimalNoise(Animal d){

       d.makeNoise();

    }
}
