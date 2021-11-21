package Array;

public class DublicateFinder {

    public static void main(String[] args) {


        String[] names = {"Gulara", "Rana", "Matthew", "Parviz", "Rafael", "Rana", "Ziya"};// length = 6


        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("There is a duplicate and it is: " + names[i]);
                }
            }
        }
    }
}