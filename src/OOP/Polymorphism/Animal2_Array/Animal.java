package OOP.Polymorphism.Animal2_Array;

public abstract class Animal {

    // Making a class abstract prevents the class from initialization

    int age;
    int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * This method represents movement of an animal. You need to implement it based on the animal type and its specific behavior
     */




    public abstract void move() ;


    public abstract  void makeNoise();


    public abstract void eat();







}
