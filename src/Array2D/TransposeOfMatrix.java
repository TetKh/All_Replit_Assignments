package Array2D;
import java.util.*;
public class TransposeOfMatrix {

        public static void main(String[] args) {
            //TEST 1
            int[][] arr1 = {{1,2,3},
                    {4,5,6},
                    {7,8,9},
            };

            System.out.println(Arrays.deepToString(transpose(arr1)));  //[[1, 4, 7],
            // [2, 5, 8],
            //  [3, 6, 9]]
            //TEST 2

            int[][] arr2 = {{5,7},
                    {1,4},
                    {2,6},
                    {3,1}
            };

            System.out.println(Arrays.deepToString(transpose(arr2)));  // [[5, 1, 2, 3],
            //   [7, 4, 6, 1]]


            // TEST 3
            int[][] arr3 = {{1,2,3,4,5},
                    {4,5,6,7,8},
                    {7,8,9,0,0},
            };

            System.out.println(Arrays.deepToString(transpose(arr3))); // [[1, 4, 7],
            //  [2, 5, 8],
            //  [3, 6, 9],
            //  [4, 7, 0],
            //  [5, 8, 0]]


        }



        public static int[][] transpose(int[][] matrix){

            // implement here

            int[][] newMatrix = new int [matrix[0].length][matrix.length];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++){

                    newMatrix [j][i] = matrix[i][j];
                }

            }

            return newMatrix;
        }
    }
