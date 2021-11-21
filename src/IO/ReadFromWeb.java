package IO;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadFromWeb {


    public static void main(String[] args) throws IOException {

        URL url = new URL("http://textfiles.com/100/codegeek.txt");
        // URL -> Uniform Resource Locator

        Scanner sc = new Scanner(url.openStream()); // Creates a connection to the web resource

        while(sc.hasNext()){
            System.out.println(sc.next());
        }

    }
}
