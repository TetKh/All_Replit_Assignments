package Loops;

public class GeneratePassword {

    public static void main(String[] args) {


        generate(2);

    }

    public static void generate(int a) {


        int randomPin = 0;

        for (int i = 0; i < a; i++) {

            randomPin = ((char) (Math.random() * 25) + 97);

            System.out.print((char) randomPin);

        }
    }

}