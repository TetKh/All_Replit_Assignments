package Array;

public class FindLargest {


    public static void main(String[] args) {


        int[] arr = {34,54,45,12,56,22,77,78};
        // Lazy way is to sort and access the arr[arr.length-1]

        int max = arr[0]; // start with assumption that first element's value is max value

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>max){ // if the element at i is greater than max
                max = arr[i];  // update the max's value
            }
        }

        System.out.println("Max is: "  +max);


    }
}
