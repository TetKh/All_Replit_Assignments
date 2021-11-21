package Array2D;

public class FindIndex {
    public static void main(String[] args) {
        String[][] arr = {{"Joe", "Aron", "Ben"},
                {"Mike", "Tom", "Paul"},
                {"Steve", "Zak", "Cole"}};

        findIndex(arr, "zak");
    }

    public static void findIndex(String[][] arr, String str) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equalsIgnoreCase(str))
                    System.out.println("Name is: " + str + ", Row`s is: " + i + ", Column`s is: " + j);
            }
        }

    }
}
