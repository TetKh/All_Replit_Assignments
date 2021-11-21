package IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDeno {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Nuclues\\Desktop\\files\\document.txt");

        PrintWriter pw = new PrintWriter(file);

        for (int i = 0; i < 1000; i++) {
            pw.println(generate());
        }
        pw.close();


          // create a txt file with 1000 random passwords for usage in automation


        Scanner sc = new Scanner(new File("C:\\Users\\Nuclues\\Desktop\\files\\document2.txt"));

        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }

    public static String generate(){
        String pass = "";
        for (int i = 0; i < 10; i++) {
            String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^";
            pass += str.charAt((int)(Math.random()*str.length()));
        }

        return pass;
    }



}
