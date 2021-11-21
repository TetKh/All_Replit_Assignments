package Array2D;

import java.util.Arrays;

public class SumOfRow {

    public static void main(String[] args) {
        int[][] a = {
                {5, 2, 3, 7},
                {1, 5, 2, 2},
                {1, 2, 3, 4}
        };
        System.out.println(sumRow(a, 2)); //should print 10
        System.out.println(sumRow(a, 0)); //should print 17
        System.out.println(sumRow(a, 1)); //should print 10
    }

    public static int sumRow(int[][] array, int row) {

        int sum = 0;

        for (int j = 0; j < array[row].length; j++) {
                sum += array[row][j];
            }
        return sum;
        }

    }

/*
for (int [] num : array [row]){
            for (int b : num){
 */