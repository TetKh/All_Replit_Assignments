import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DifferentExceptionTypes {


    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Nuclues\\Downloads\\Day4.pptx");
        }catch(FileNotFoundException f){
            System.out.println("File was not found");
        }


        System.out.println(Integer.parseInt("5.6"));

    }
}
