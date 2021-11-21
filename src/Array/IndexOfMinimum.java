package Array;

public class IndexOfMinimum {
    public static void main(String[] args) {


        int[] arr = {34, 45, 99, 3, 12, 56, 22, 77, 3, 78, 11};

        int index = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;



            }
        }
        System.out.println("Min is " + min + " located at index " + index);
    }
}