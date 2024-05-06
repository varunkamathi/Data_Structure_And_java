package JDBC;

/*  it is connected with data base , With MySQL 
 In this code we all ready create database and table in MySQL
 we only connect with this data base */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class conn {


    
    Connection connection;
    Statement statement;

    public conn() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "varun1234");
            this.statement = this.connection.createStatement();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}


