package Loops;

public class Continue {

    public static void main(String[] args) {


        int i;
        int sum = 0;

        for (i = 1; i <= 10; i++) {

            if(i == 5){
                continue;
            }
            sum+=i;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The value of i " + i);


    }
}

