package Loops;

public class MultiplicationNested {

    public static void main(String[] args) {

            // Use nested loops to print out the multiplication table
            System.out.print("\t");
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            System.out.println("--------------------------------------");


            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "|\t");
                for (int j = 1; j <= 9; j++) {
                    System.out.print((i * j) + "\t");

                }

                System.out.println();
            }
        }

    }
