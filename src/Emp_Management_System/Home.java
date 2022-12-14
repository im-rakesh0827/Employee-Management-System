package Emp_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JButton addEmp, viewEmp, updateEmp, deleteEmp;
    Home(){
        setLayout(null);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image image2 = image1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(0, 0, 1120, 630);
        add(image);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(650, 20, 450, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        image.add(heading);


        addEmp = new JButton("Add");
        addEmp.setBounds(650, 90, 150, 40);
        addEmp.setFont(new Font("serif", Font.PLAIN, 20));
        addEmp.addActionListener(this::actionPerformed);
        image.add(addEmp);


        viewEmp = new JButton("View");
        viewEmp.setBounds(860, 90, 150, 40);
        viewEmp.setFont(new Font("serif", Font.PLAIN, 20));
        viewEmp.addActionListener(this::actionPerformed);
        image.add(viewEmp);


        updateEmp = new JButton("Update");
        updateEmp.setBounds(650, 150, 150, 40);
        updateEmp.setFont(new Font("serif", Font.PLAIN, 20));
        updateEmp.addActionListener(this::actionPerformed);
        image.add(updateEmp);

        deleteEmp = new JButton("Delete");
        deleteEmp.setBounds(860, 150, 150, 40);
        deleteEmp.setFont(new Font("serif", Font.PLAIN, 20));
        deleteEmp.addActionListener(this::actionPerformed);
        image.add(deleteEmp);


        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==addEmp){
            System.out.println("New Employee Can Be Added From Here : ");
            new Registration();
//            setVisible(false);
//            System.exit(0);

        }if(e.getSource()==viewEmp){
            System.out.println("List of employees : ");
//            setVisible(false);
            System.exit(0);

        }if(e.getSource()==updateEmp){
            System.out.println("Update Employee : ");
            System.exit(0);

        }if(e.getSource()==deleteEmp){
            System.out.println("Delete Employee : ");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Home();
    }


}
