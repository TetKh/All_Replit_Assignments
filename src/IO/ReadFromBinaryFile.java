package IO;
import java.io.*;
import java.util.Scanner;

public class ReadFromBinaryFile {


    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/resources/land.jpg");
        FileOutputStream fos = new FileOutputStream("src/resources/landCopy.jpg");
        int data;
        while( (data = fis.read()) != -1){
           fos.write(data);
        }

        fis.close();
        fos.close();


    }




}
