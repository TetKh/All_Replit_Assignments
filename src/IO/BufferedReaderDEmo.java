package IO;
import java.io.*;

public class BufferedReaderDEmo {


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("customers.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("newCustomers.txt"));
       String line;
       while((line = bufferedReader.readLine()) != null ){
          bw.write(line);
          bw.newLine();

       }

       bufferedReader.close();
       bw.close();

    }
}
