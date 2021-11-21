package IO;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractListOfStringArrays {


    public static void main(String[] args) throws IOException {


        List<String[]> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/IO/customers.csv"));

        String line;
        while((line = bufferedReader.readLine()) != null ){

            String[] split = line.split(",");
            list.add(split);

        }

        for (String[] strings : list) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
