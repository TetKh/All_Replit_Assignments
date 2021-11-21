import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DeclareExceptionsInOtherMethod {

    // Handle or declare only applies to Checked Exceptions

    public static void main(String[] args)  {

       m2();
    }


    public static void m1() {
        reverseString();
    }


    public static void m2() throws NumberFormatException {

    }



    public static void reverseString()  {


        System.out.println("cdsvcvdsgj");

        try {
            FileInputStream fis = new FileInputStream("dshvbhdsvgv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
