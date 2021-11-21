package Array;

import java.util.Arrays;

public class ForEach {


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int elem: arr){
            System.out.println(elem);
        }

        String [] arr2 = {"Hi", "hola", "Como", "Que", "Hondas"};

//        for( String e : arr2  ){
//            System.out.println(e.toUpperCase());
//        }
        // For-each loop iterates from the beginning till the end of any collection

        // For-each loop limitations
        // Any index related operations cannot be done using for-each
        // Any modification to an array element is not going to work.

//        for (int i = 0; i < arr2.length; i++) {
//              String str  =   arr2[i];
//              str = str + "Hello";
//        }

        for (String str : arr2 ) {
            System.out.println(str);
        }

        System.out.println(Arrays.toString(arr2));

        int data[ ] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {


            if (e != key) {
                count++;
            }
        }
        System.out.print (count + "Found");
    }









}
