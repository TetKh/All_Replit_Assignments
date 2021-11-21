package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MulltipleCatchBlockRule {


    public static void main(String[] args) {


        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Nuclues\\Downloads\\imag.png");
            System.out.println(args[10]);
            System.out.println(3/0);
            System.out.println(Integer.parseInt("Hello"));
        }catch(FileNotFoundException e){
            System.out.println("FNF");
        }catch(IOException io){
            System.out.println("IO");
        }

        System.out.println("After exception is handled");
    }
}
