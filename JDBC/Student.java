package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;

public class Student {
    

    public void createTable(){
          // conn establish
        Connection connection;
        Statement statement;
        try {
            /*String url = "jdbc:mysql://localhost:3306";
            String userName = "root";
            String password = "varun1234";
*/
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_structure","root","varun1234");
                    //statment creat
            statement = connection.createStatement();
                    //excute - query
            String query = "create table Student(sid int(30),emali varchar(40),student_name varchar(50))";
            statement.execute(query);
            System.out.println("table created successfull " );

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("not");
        }
        
        
    }
//     public static void main(String[] args) {
//         new Student();
//     }
 }
