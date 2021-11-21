package Loops;

public class Class_AccumulatorLoops {



        public static void main(String[] args) {


            int total = 0;

            int counter = 1;

            while(counter<=1000){
                total = total + counter;
                counter++;
            }

            System.out.println("Total is: " + total);


        }
}
