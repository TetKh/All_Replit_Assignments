package Basics;

public class GetRandomCreditCardNo {

    public static void main(String[] args) {

        getRandomCreditCardNo(1);
        getRandomCreditCardNo(2);
        getRandomCreditCardNo(3);
        getRandomCreditCardNo(4);
    }

    public static long getRandomCreditCardNo(long num) {


        long num1 = ((long) (Math.random() * 100000000000000L)); // American Express 3
        long num2 = ((long) (Math.random() * 1000000000000000L)); // Visa 4
        long num3 = ((long) (Math.random() * 1000000000000000L)); // Mastercard 5
        long num4 = ((long) (Math.random() * 1000000000000000L)); // Discover 6

        long amex = 300000000000000L + num1;
        long visa = 4000000000000000L + num2;
        long master = 5000000000000000L + num3;
        long discovery = 6000000000000000L + num4;


        if (num == 1) {
            System.out.println(amex);

        } else if (num == 2) {
            System.out.println(visa);

        } else if (num == 3) {
            System.out.println(master);

        } else if (num == 4) {
            System.out.println(discovery);
        } else {
            System.out.println("Choose a number from 1 to 4");
        }
        return num;
    }

}


// Credit card number generation rules:
//
//-American Express must start with 3 and must be 15 digits long. e.g. 345672363622649
//
//-Visa must start with 4 and must be 16 digits long. e.g. 4456723636226497
//
//-Mastercard must start with 5 and must be 16 digits long. e.g. 5456723636226494
//
//-Discover must start with 6 and must be 16 digits long. e.g. 6456723636226491
//
//Examples:
//
//getRandomCreditCardNo(1) -> returns 345672363622649
//getRandomCreditCardNo(2) -> returns 4456723636226497
//getRandomCreditCardNo(3) -> returns 5456723636226494
//getRandomCreditCardNo(4) -> returns 6456723636226491