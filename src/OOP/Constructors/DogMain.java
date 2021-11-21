package OOP.Constructors;

public class DogMain {

        public static void main(String[] args) {

            Dog dog = new Dog();

            dog.name = "Kelly";
            dog.breed = "Colly";
            dog.weight = 45;

            System.out.println("Dog's name is " + dog.name + ", breed is " + dog.breed + ", weight is " + dog.weight);


            Dog dog2 = new Dog("Biggy", 55);

            System.out.println("Second Dog's name is " + dog2.name + ", breed is " + dog2.breed + ", weight is " + dog2.weight);

        }
    }
