package Exceptions.OverridingRuleRevisited;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class Animal {

    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("url", "user", "password");


        try {
            m1();
        } catch (EntryNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void m1() throws EntryNotFoundException {

    }



    public void m2() throws FileNotFoundException {

    }


    public void m3() throws IOException {

    }

    public void m4() throws IOException {

    }



    public void m5() {

    }


    public void m6()  throws ArithmeticException{


    }
}
