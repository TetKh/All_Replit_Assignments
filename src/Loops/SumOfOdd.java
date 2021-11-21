package Loops;

import java.util.Scanner;

public class SumOfOdd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();

        int sumOfOdd = 0;
        for (int i = num1; i <= num2; i++)

            if (i % 2 != 0) {
                sumOfOdd = sumOfOdd + i;


        }

        System.out.println("The sum of Odds is " + sumOfOdd);


    }

    public static class BreakDemo {

        public static void main(String[] args) {


            int i;
            int sum = 0;

            for (i = 1; i <= 10; i++) {

                if(i == 5){
                    break;
                }
                sum+=i;
            }

            System.out.println("The sum is " + sum);
            System.out.println("The value of i " + i);

        }
    }
}

