package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class connect {
     public static void main(String[] args) {
        //driver load
        // conn establish
        Connection connection;
        Statement statement;
        try {
            String url = "jdbc:mysql://localhost:3306";
            String userName = "root";
            String password = "varun1234";

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","varun1234");
            statement = connection.createStatement();
            System.out.println("connect sucefull");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("not");
        }
        //statment creat
        //excute - query
        //coon cloan
    }
}
