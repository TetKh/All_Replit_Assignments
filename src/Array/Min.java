package Array;

public class Min {

    public static void main(String[] args) {

    int[] arr = {34, 45, 99, 3, 12, 56, 22, 77, 3, 78, 11};


    int min = 0;

        for (int i = 1; i < arr.length; i++) {
         min = Math.min(arr[0], arr[i]);
        }
        System.out.println(min);
    }

}

