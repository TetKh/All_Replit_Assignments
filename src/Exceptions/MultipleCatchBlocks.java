package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class MultipleCatchBlocks {


    public static void main(String[] args) {

        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Nuclues\\Downloads\\imag.png");
            System.out.println(args[10]);
            System.out.println(3/0);
            System.out.println(Integer.parseInt("Hello"));
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("AIOB");
        }catch(FileNotFoundException e){
            System.out.println("FNF");
        }catch(ArithmeticException ae){
            System.out.println("AE");
        }

        System.out.println("After exception is handled");



    }
}
