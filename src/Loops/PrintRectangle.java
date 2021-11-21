package Loops;

public class PrintRectangle {

    public static void main(String[] args) {
        //tests
        printRectangle(5, 10, '*');
        printRectangle(10, 3, '$');
        printRectangle(20, 20, '#');
        printRectangle(2, 10, 'x');
    }



    public static void printRectangle(int x, int y, char ch){

        //implement here

        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= y; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}