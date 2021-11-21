package Loops;

public class NestedLoopDemo {

    public static void main(String[] args) throws InterruptedException {

        String str = "abcdeag";


        outer: for (int i = 0; i <= 5; i++) {   // rows
            System.out.print("Outer loop no " + i + " : ");

            inner:    for (int j = 0; j <=5 ; j++) {  // columns (cells)

                break outer;

            }

            System.out.println();

        }
    }
}

