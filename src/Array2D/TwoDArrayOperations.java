package Array2D;

import java.util.Arrays;

public class TwoDArrayOperations {

        public static void main(String[] args) {

            int[][] numbers = new int[5][4];

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {

                for (int j = 0; j < numbers[i].length; j++) {

                    numbers[i][j] = (int)(Math.random()*100) ;
                    sum+=numbers[i][j];
                }

            }


            for (int[] row: numbers) {

                for ( int col: row ) {
                    System.out.print(col + "\t");
                }
                System.out.println();

            }

            System.out.println("The sum of all values in this 2D array is " + sum);

            System.out.println(Arrays.deepToString(numbers));


        }
    }

