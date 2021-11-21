package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlock {


    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\Nuclues\\Downloads\\imag.png");

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Inside catch");
            System.exit(1);
        }finally{
            // to close the resources
            System.out.println("Finally block logic");
            fis.close();
        }


        System.out.println("After exception is handled");




        try{

        } finally{

        }

    }
}
