package OOP.Constructors;

public class AveragerMain {

    public static void main(String[] args) {
        //Test your class
        Averager ave = new Averager();

        System.out.println(ave.getSum());
        ave.add(5);
        System.out.println(ave.getCount());
        System.out.println("The average of the values added to sum is: " + ave.getAverage());

    }
}
