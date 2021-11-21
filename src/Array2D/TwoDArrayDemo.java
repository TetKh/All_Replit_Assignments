package Array2D;

import java.util.Arrays;

public class TwoDArrayDemo {

        public static void main(String[] args) {


            int [][] arr;
            int arr2 [][];
            int [] arr3 [];
            int [] arr4 [], arr5 [];

            int arr6[], arr7;  // arr7 int

//        arr7 = new int[3];

            int [][] matrix = new int[3][2];

            matrix[1][1] = 66;
            matrix[2][0] = 77;

            System.out.println(Arrays.deepToString(matrix));


            String [][] students = new String[][] {
                    {"Parviz", "online", "VA"},
                    {"Firdavs", "online", "NY"},
                    {"Rafael", "online", "CA"},
                    {"Bahar", "online", "VA"},
                    {"Gulara", "in-class", "TX"},


            };

            System.out.println(students[2][2]);


            String [][] names = new String[2][3];

            names[0] = new String[4];
            names[1] = new String[5];

            System.out.println(Arrays.deepToString(names));

        }
    }

