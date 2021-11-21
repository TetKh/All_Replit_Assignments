package OOP.Constructors;

public class Counter {

    int counter = 0;

    public void increment(){

        counter = counter + 1;
    }

    public int getValue(){

        return counter;
    }

    public static void main(String[] args) {

        Counter num = new Counter();


        num.increment();
        System.out.println(num.getValue());



    }

}
