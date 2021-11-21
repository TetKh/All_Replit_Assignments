package Array2D;

public class CountNegativeOdd {

    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        System.out.println(countNegativeOdd(a)); //should print 3
    }

    public static int countNegativeOdd(int[][] array) {

        int result = 0;

        for (int[] num : array) {

            for (int i : num) {

                if ((i % 2 != 0) && (i >= 0)) {
                    result = i;
                }
            }
        }
        return result;
    }
}
