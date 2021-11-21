package IO;
import java.io.*;
import java.net.*;
import java.util.*;

public class Task {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://sherlock-holm.es/stories/plain-text/advs.txt");

        Scanner sc = new Scanner(url.openStream());

        File file = new File("doc.txt");

        PrintWriter pw = new PrintWriter(file);

        while(sc.hasNext()){
            pw.println(sc.nextLine());
        }



        pw.close();
        sc.close();
    }
}

