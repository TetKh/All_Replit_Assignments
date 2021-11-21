package Loops;

public class Triangle_Left {

    public static void main(String[] args) {

        int rows = 6;
        int i, j;
        for (i= rows; i>= 1; i--)
        {
            for (j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


        /*
        int i, j;
        for(i = 0; i < 6; i++) //outer loop for number of rows(n)
        {
            for(j = 2 * (6 - i); j >= 0; j--) // inner loop for spaces
            {
                System.out.print(" "); // printing space
            }
            for(j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
    }

}

/*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
 */