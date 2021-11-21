public class ThrowAnException {


    public static void main(String[] args) throws Exception {
        divide(4, 0);
    }



    public static void divide(int a, int b) throws Exception {

        System.out.println("Dividing 2 numbers");
        if(b==0){
            throw new UnsupportedOperationException("B cannot be zero");
        }else{
            System.out.println(a/b);
        }
    }
}
