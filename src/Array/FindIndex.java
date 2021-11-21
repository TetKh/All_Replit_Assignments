package Array;

public class FindIndex {

    public static void main(String[] args) {

        int[] array = {99, 1, 2, 3, 4, 5, 6, 7, 8};

        int key = 8;
        int index;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                System.out.println(index);
                }
            }
        }
    }
