package Array;

public class SearchAlgorithms {


    public static void main(String[] args) {


        int [] array = {4,2,4,1,6,7,2};
        System.out.println(linearSearch(array, 1)); // 3
        System.out.println(linearSearch(array, 4)); // 0
        System.out.println(linearSearch(array, 2)); // 1
        System.out.println(linearSearch(array, 8)); // -1




        int[] arr2 = {2,4,6,7,8,10,11,15,34,100}; // for binary search your array must be sorted


        System.out.println(binarySearch(arr2, 99));

    }




    public static int linearSearch(int[] arr, int key){
        int index = -1;
        // Method needs to return the index of the key
        // IF the key is not found, return -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                index = i;
                break;
            }

        }





        return index;// -1 is considered an invalid index
    }

    public static int binarySearch(int[] arr, int key){

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
