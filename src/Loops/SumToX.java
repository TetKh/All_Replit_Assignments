package Loops;

public class SumToX {

    public static void main(String[] args) {
        System.out.println(sumToX(5)); //15
        System.out.println(sumToX(7)); //28
    }

    public static int sumToX(int x) {

        //Write your method here

        int sum = 0;

        for (int i = 0; i <= x; i++) {

            sum = sum + i;

        }

            return sum;


    }
}
