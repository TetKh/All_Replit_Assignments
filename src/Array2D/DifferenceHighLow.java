package Array2D;

public class DifferenceHighLow {

    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println(diffHiLo(a)); //should print 12
    }
    public static int diffHiLo(int[][] array) {

        int max = 0;
        int min = 0;

        for (int[] nums : array){
            for(int a: nums){
                if (a < min) {
                    min = a;
                } else if (a > max)
                    max = a;
            }
        }

        return Math.abs(max - min);
    }
}
