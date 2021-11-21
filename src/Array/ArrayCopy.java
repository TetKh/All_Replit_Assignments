package Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int i = 9;
        int j = 23;

        i = j;

        System.out.println(i);
        System.out.println(j);

        int [] arr1 = {1,2,3};

        double [] arr2 = {4,5,6};






//        System.out.println(arr1 == arr2); //
//
//        arr1 = arr2;

//        System.out.println(arr1 == arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int [] arr3 = new int[4];
        double [] arr4 = new double[4];
        double [] arr = new double []{4,5,6,7};
//        int i2 = 9;
        double d = i;

        int [] arr6 = {1,2,3,4,5};

        arr6 = new int[]{2,2,2,2,4};

        System.out.println(arr6[4]);





        int [] arr7 = {1,2,3,4,5};



        int [] arr8 = new int[100];

        System.out.println(Arrays.toString(arr8));

        for (int k = 0; k < arr7.length; k++) {

            arr8[k] = arr7[k];

        }

        System.out.println(Arrays.toString(arr8));






    }
}
