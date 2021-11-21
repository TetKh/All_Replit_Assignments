package Exceptions;
import java.sql.*;

public class TryCatchTask {

    public static void main(String[] args) { //throws SQLException



        try {
            Connection connection;


            connection = DriverManager.getConnection("url", "user", "password");

        } catch (SQLException e) {

            System.out.println("Catch block is executed");
            // e.printStackTrace();


        }
    }
}
