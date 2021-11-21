package Loops;

public class Triangle_Right {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++)
        {
            for (int k = 5; k >= i; k--){
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        }
    }


/*

           1
         2 1
       3 2 1
     4 3 2 1
   5 4 3 2 1
 6 5 4 3 2 1


int i, j, num;

        for (i = 0; i < 6; i++) // outer loop for rows
        {
            for (i = 1; i <= 6; i++) {
                for (j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                System.out.println();
            }

        }}}
 */