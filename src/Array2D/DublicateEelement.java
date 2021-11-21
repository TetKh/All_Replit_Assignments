package Array2D;

public class DublicateEelement {
    public static void main(String[] args) {


        int intArray[][] = {{1, 2, 2, 3}, {2, 5, 6, 6, 5}};
        //Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length - 1; j++) {
                if (intArray[i][j] == intArray[i][j + 1]) {
                    System.out.println("Duplicate element: " + intArray[i][j] + ", at index [" + i + "] [" + (j + 1) + "]");
                }
            }
        }
    }
}