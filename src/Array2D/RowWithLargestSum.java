package Array2D;

public class RowWithLargestSum {

    public static void main(String[] args) {

            // Given a 2D array of ints, find the row with the largest sum
            int[][] arr = {{73, 32, 15, 16}, {30, 51, 87, 15}, {35, 61, 78, 49}, {85, 67, 64, 89}, {27, 1, 96, 56}};
            int maxRow = 0;
            int maxRowIndex = 0;
            for (int i = 0; i < arr[0].length; i++) {
                maxRow += arr[0][i];
            }
            System.out.println(maxRow);
            for (int i = 1; i < arr.length; i++) {
                int sumOfCurrentRow = 0; // this will be initialized to zero with each outer loop iteration
                for (int j = 0; j < arr[i].length; j++) {
                    sumOfCurrentRow += arr[i][j];
                }
                if (sumOfCurrentRow > maxRow) {
                    maxRow = sumOfCurrentRow;
                    maxRowIndex = i;
                }
            }
            System.out.println("The max row index is " + maxRowIndex);
        }
    }




