package OOP.Polymorphism.Animal2_Array;

public class Tester {

    public static void main(String[] args) {




//        Animal a1 = new Bird();
//
        Animal [] animals = new Animal[3];
        animals[0] = new Bird();

         Animal animal = new Horse();

          animal.eat();
          animal.makeNoise();
          animal.move();

//           method(new Animal());
        method(new Horse());


    }

    public static  void method(Animal a){}
}
