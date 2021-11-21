package IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResources {


    public static void main(String[] args) {

        File file = new File("whatever.txt");


        try ( PrintWriter pw = new PrintWriter(file);) {


            for (int i = 0; i < 1000; i++) {
                pw.println("Hello");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
