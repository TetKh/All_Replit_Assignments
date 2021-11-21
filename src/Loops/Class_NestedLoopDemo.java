package Loops;

public class Class_NestedLoopDemo {

    public static void main(String[] args) throws InterruptedException {

        String str = "abcdeag";


        for (int i = 0; i <= 5; i++) {   // rows
//            System.out.print("Outer loop no " + i + " : ");

            for (int j = 0; j <=5 ; j++) {  // columns (cells)

                System.out.print("(" + i + "," + j + ") ");
//               Thread.sleep(500);
            }

            System.out.println();

        }
    }
}
