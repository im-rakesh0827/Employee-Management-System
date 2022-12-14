package Emp_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Conn {
    public PreparedStatement statement;

    Conn(){
        final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
        final String USERNAME = "root";
        final String PASSWORD = "Apple@0827";
        try {
            Class.forName(DB_URL);
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
