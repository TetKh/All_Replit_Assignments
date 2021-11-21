package Array;

import java.sql.SQLOutput;
import java.util.Arrays;

    public class SortingAlgorithms {

        public static void main(String[] args) {

            int [] arr = new int[100000] ;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random()*1000);
            }
            long start =  System.currentTimeMillis();
//        bubbleSort(arr);
//        selectionSort(arr);
            Arrays.sort(arr);
            long end = System.currentTimeMillis();
            System.out.println("The execution time:" + (end - start));
//        selectionSort(arr);
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
        }
        public static void bubbleSort(int[] arr){
            for (int i = 0; i < arr.length -1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
//            System.out.println(Arrays.toString(arr));
            }
        }
        public static void selectionSort(int[] arr){
            for (int i = 0; i < arr.length -1; i++) {
                //Find the minumim
                int currentMin = arr[i];
                int minIndex = i;
                for (int j = i+1; j < arr.length; j++) {
                    if(currentMin>arr[j]){
                        currentMin = arr[j];
                        minIndex = j;
                    }

                }
                if(minIndex != i){
                    arr[minIndex] = arr[i];
                    arr[i] = currentMin;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }

