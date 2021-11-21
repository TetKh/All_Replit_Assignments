package OOP.Polymorphism.Animal;

public class Snake extends  Animal{

    public void move(){

        System.out.println("Snake is crawling");
    }


    public void makeNoise(){

        System.out.println("Snake is hissing");
    }


    public void eat(){

        System.out.println("Snake is swallowing");
    }
}
