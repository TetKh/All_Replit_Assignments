package Array2D;

import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        System.out.println(isMagic(a)); //true
        int[][] b = {
                {1, 1, 2},
                {3, 2, 3},
                {1, 4, 1}
        };
        System.out.println(isMagic(b)); //false
        int[][] c = {
                {1, 1, 1},
                {2, 2, 2}
        };
        System.out.println(isMagic(c)); //false
        int[][] d = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        System.out.println(isMagic(d)); //true
    }

    public static boolean isMagic(int[][] array) {


        int sumDiagonal = 0;
        int principal = 0, secondary = 0;
        int sumRow = 0, sumCol = 0;
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < array.length; i++) {
            sumRow = 0;
            for (int j = 0; j < array[0].length; j++) {
                sumRow = sumRow + array[i][j];
            }

            for (i = 0; i < array[0].length; i++) {
                sumCol = 0;
                for (int j = 0; j < array.length; j++) {
                    sumCol = sumCol + array[j][i];

                if (i == j)
                principal += array[i][j];

                if ((i + j) == (array.length - 1))
                secondary += array[i][j];

                if (secondary == principal) {
                sumDiagonal = principal;
        }
        }
        }

            System.out.println("Sum of Diagonal:"
                    + sumDiagonal);
            System.out.println("Sum of Row:"
                    + sumRow);
            System.out.println("Sum of Col:"
                    + sumCol);


        }
        return sumRow == sumCol && sumCol == sumDiagonal && rows == cols;
    }
}
