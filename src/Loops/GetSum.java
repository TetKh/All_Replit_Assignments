package Loops;

public class GetSum {

    public static void main(String[] args) {
        getSum(1, 4);
    }

    public static void getSum(int a, int b) {
        int sum = 0; // a variable that accumulates the sum must be declared and initialized with zero
        int sumOfEven = 0;
        for (int i = a; i <= b; i++) {

            if (i % 2 == 0) {
                sumOfEven = sumOfEven + i;
            }
            sum = sum + i;

            // to accumulate the values
        }


        System.out.println("The sum of Evens is " + sumOfEven);

        System.out.println("The sum is " + sum);
    }
}