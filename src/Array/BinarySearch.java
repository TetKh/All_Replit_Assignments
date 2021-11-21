package Array;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr2 = {2, 4, 6, 7, 8, 10, 11, 15, 34, 100}; // for binary search your array must be sorted


        System.out.println(binarySearch(arr2, 11));
    }

    public static int binarySearch(int [] arr, int key) {


        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = (start + end) / 2;

            if(key < arr[mid]){
                end = mid-1;
            }else if(key == arr[mid]){
                return mid;
            }else{
                start = mid + 1;
            }
        }

        return - (end-1); // if key is not found -(insertion index -1) should be returned
    }
}
