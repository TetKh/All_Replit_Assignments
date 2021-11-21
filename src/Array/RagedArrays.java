package Array;

import java.util.Arrays;

public class RagedArrays {

        public static void main(String[] args) {


            int[][] arrs = new int[4][];  // when you omit the inner array sizes, the inner array values will be null

            arrs[0] = new int[10];
            arrs[1] = new int[2];
            arrs[2] = new int[5];
            arrs[3] = new int[3];
//         arrs[4] = new int[6]; Out of bounds
            System.out.println(Arrays.deepToString(arrs));


            String [][] students = new String[][] {
                    {"Parviz", "online", "VA"},
                    {"Firdavs"},
                    {"Rafael", "online"},
                    {"Bahar", "online", "VA", "56"},
                    {"Gulara", "in-class", "TX"},

            };

            System.out.println(students.length);
            System.out.println(students[1].length);

//        for (int i = 0; i < students.length; i++) {
//
//            for (int j = 0; j < students[i].length; j++) {
//
//                System.out.print(students[i][j] + "\t");
//            }
//            System.out.println();
//
//        }

            for ( String[] arr : students) {

                for ( String str  : arr ) {

                    System.out.print(str + "\t");

                }
                System.out.println();

            }







        }
    }

