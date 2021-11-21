package Loops;

public class Coordinates {

    public static void main(String[] args) throws InterruptedException {

        for (int a = 0; a <= 5; a++) {
            for (int b = 0; b <= 5; b++) {
                System.out.print("(" + a + "," + b + ")");
                Thread.sleep(500);
            }
            System.out.println();
        }
    }
}