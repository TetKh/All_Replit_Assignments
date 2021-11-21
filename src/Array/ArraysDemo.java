package Array;

import java.util.Arrays;

    public class ArraysDemo {


        public static void main(String[] args) {

            int [] arr = {2,3,5,7,2,2,5,7,8,3,3,6,3,4,5,3,4,3};

            //  Arrays.sort(arr);

            Arrays.sort(arr, 10, arr.length);


            System.out.println(Arrays.toString(arr));



            int[] arr2 = {9,2,3,4,71,78,23,2,1};

            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));

            System.out.println(Arrays.binarySearch(arr2, 5)); // -6

            int [] arr3 = {1,2,3};
            int [] arr4 = {1,2,3};

            System.out.println(arr3);
            System.out.println(arr4);

            System.out.println(arr3 == arr4); // == compares memory location of two objects


            System.out.println(arr3.equals(arr4));// array's equals method compares memory location


            System.out.println(Arrays.equals(arr3,arr4));


            int [] arr6 = new int [100000];

            Arrays.fill(arr6, 55);
            Arrays.fill(arr6, arr6.length-3, arr6.length, 88);

            System.out.println(Arrays.toString(arr6));


        }
    }

