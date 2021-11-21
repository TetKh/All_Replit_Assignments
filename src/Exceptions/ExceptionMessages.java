package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionMessages {

    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("sdfvdsjcsdv");
        } catch (FileNotFoundException e) {
           e.printStackTrace();

        }

        System.out.println("After an exception is handled");

    }



}
