package Employee_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
        final String driver = "com.mysql.cj.jdbc.Driver";
        final String USERNAME = "root";
        final String PASSWORD = "Apple@0827";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Conn();
    }
}
