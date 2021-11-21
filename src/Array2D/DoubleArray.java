package Array2D;

public class DoubleArray {

    public static void main(String[] args)
    {
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        doubleArr(a);
        //prints array
        for(double[] row : a){
            for(double e : row){
                e = e * 2;
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    public static void doubleArr(double[][] array)
    {

    }
}
