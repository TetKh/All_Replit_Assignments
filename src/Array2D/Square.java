package Array2D;

public class Square {

    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        System.out.println(isSquare(a)); //true

        int[][] b = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        System.out.println(isSquare(b)); //false
    }
    public static boolean isSquare(int[][] array) {

        int row = array.length;
        int col = array[0].length;

        return row == col;

    }
}
