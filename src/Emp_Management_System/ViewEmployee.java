package Emp_Management_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Emp_Management_System.ApplyFontStyle.applyFontButtonSmall;

public class ViewEmployee extends JFrame implements ActionListener {
    JTable table;
    Choice choiceData;
    JLabel labelSearch;
    JScrollPane jScrollPane;
    JButton buttonSearch, buttonPrint, buttonUpdate, buttonBack;

    ViewEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        labelSearch = new JLabel("Search Employee ID : ");
        labelSearch.setBounds(20, 20, 250, 30);
        labelSearch.setFont(new Font("serif", Font.BOLD, 20));
        add(labelSearch);

        choiceData = new Choice();
        choiceData.setBounds(220, 20, 150, 30);
        choiceData.setFont(new Font("serif", Font.PLAIN, 14));
        choiceData.add("Choose");
        add(choiceData);

        buttonSearch = new JButton("Search");
        int buttonHeight = 35;
        int buttonWidth = 150;
        int verticalButtonShift = 70;

        buttonSearch.setBounds(20, verticalButtonShift, buttonWidth, buttonHeight);
        applyFontButtonSmall(buttonSearch);
        buttonSearch.addActionListener(this::actionPerformed);
        add(buttonSearch);

        buttonPrint = new JButton("Print");
        buttonPrint.setBounds(200, verticalButtonShift, buttonWidth, buttonHeight);
        applyFontButtonSmall(buttonPrint);
        buttonPrint.addActionListener(this::actionPerformed);
        add(buttonPrint);

        buttonUpdate = new JButton("Update");
        buttonUpdate.setBounds(380, verticalButtonShift, buttonWidth, buttonHeight);
        applyFontButtonSmall(buttonUpdate);
        buttonUpdate.addActionListener(this::actionPerformed);
        add(buttonUpdate);

        buttonBack = new JButton("Back");
        buttonBack.setBounds(560, verticalButtonShift, buttonWidth, buttonHeight);
        applyFontButtonSmall(buttonBack);
        buttonBack.addActionListener(this::actionPerformed);
        add(buttonBack);


        try {
            Conn c = new Conn();
            String query = "select * from employees";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()){
                choiceData.add(resultSet.getString("employeeId"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        table = new JTable();
        try {
            Conn c = new Conn();
            String query = "select * from employees";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0, 150, 900, 400);
        add(jScrollPane);


        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonSearch){
           String query = "select * from employees where employeeId= '"+choiceData.getSelectedItem()+"'";
           try {
               Conn c = new Conn();
               ResultSet resultSet = c.statement.executeQuery(query);
               table.setModel(DbUtils.resultSetToTableModel(resultSet));
           }catch (Exception E){
               E.printStackTrace();
           }
        }else if(e.getSource()== buttonPrint){
            try {
                table.print();
            } catch (PrinterException ex) {
                throw new RuntimeException(ex);
            }
        }else if(e.getSource()==buttonBack){
            setVisible(false);
            new Home();
        }

    }
}
