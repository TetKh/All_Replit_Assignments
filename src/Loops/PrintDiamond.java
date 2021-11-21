package Loops;

public class PrintDiamond {
    public static void main(String[] args) {

        int space = 10 - 1;

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print(i + " ");

            System.out.print("\n");
            space--;
        }
        space = 0;

        for (int i = 10; i > 0; i--)
        {

            for (int j = 0; j < space; j++)
                System.out.print(" ");


            for (int j = 0; j < i; j++)
                System.out.print(i + " ");

            System.out.print("\n");
            space++;
        }
    }
}
