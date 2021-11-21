package OOP.FinalOOPProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utility {


    public static List<String[]> readFromCSV(String path) {

        List<String[]> list = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] st = line.split(",");
                list.add(st);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
/*

readFromCSV() - a static utility method that accepts a String parameter that represents a path to a csv file.
It reads the content of a given csv file and returns the content as List<String[]> where each
String[] represents a row of information in a file. Uses BufferedReader class to read from a file
and handles the checked exception with a regular try-catch block or autoclosable try-with-resources block.


2.Implement the application logic in the main method:

Your application should do the following: 1. Asks the user to enter the name of the csv file.
(3 diffrent csv files have been added to the project.) 2. Reads the data from the given file using
the Utility class method. 3. Based on the obtained data from the file, creates corresponding Savings
and Checking accounts and stores them in a collection. 4. Displays to the user the created bank accounts
with its details. 5. Asks the user if he/she wants to load another file. If yes, repeats the process,
if not ends the application.

The sample console output has been attached for reference.
 */
