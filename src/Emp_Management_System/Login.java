package Emp_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static Emp_Management_System.ApplyFontStyle.applyFontButtonBig;
import static Emp_Management_System.ApplyFontStyle.applyFontStyle;

public class Login extends JFrame implements ActionListener {
    private JTextField tfEmail, tfUsername;
    private final JPasswordField pfPassword;
    private final JButton buttonLogin, buttonRegister;
    private final JLabel labelPassword;
    private JLabel labelUserName;
    private final JLabel labelEmail;


    public Login(){
        getContentPane().setBackground(Color.white);
//        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        int verticalShift = 100;
        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(40, verticalShift, 100, 30);
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(150, verticalShift, 270, 30);
        add(tfEmail);
        applyFontStyle(labelEmail, tfEmail);


        verticalShift+=40;
        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(40, verticalShift, 100, 30);
        add(labelPassword);
        pfPassword = new JPasswordField();
        pfPassword.setBounds(150, verticalShift, 270, 30);
        add(pfPassword);
        applyFontStyle(labelPassword, pfPassword);

        verticalShift+=60;
        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(150, verticalShift, 100, 40);
        buttonLogin.setBackground(Color.black);
        add(buttonLogin);
        buttonLogin.addActionListener(this::actionPerformed);
        applyFontButtonBig(buttonLogin);

        buttonRegister = new JButton("Register");
        buttonRegister.setBounds(320, verticalShift, 100, 40);
        buttonRegister.setBackground(Color.black);
        buttonRegister.addActionListener(this::actionPerformed);
        add(buttonRegister);
        applyFontButtonBig(buttonRegister);



        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image image2 = image1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(470, 25, 200, 200);
        add(image);




        setSize(700, 400);
        setLocation(450, 200);
        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== buttonLogin){
            try {
                String email = tfEmail.getText();
                String password  = String.valueOf(pfPassword.getPassword());
                Conn c = new Conn();
                String query = "select * from employees where email='"+email+"'and password = '"+password+"'";
                ResultSet resultSet = c.statement.executeQuery(query);
                if(resultSet.next()){
                    JOptionPane.showMessageDialog(
                            this,
                            "Login Successful.",
                            "Login Window",
                            JOptionPane.ERROR_MESSAGE
                    );
                    setVisible(false);
                    new Home();
                }
                else{
                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid UserName or Password !",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

            }catch (Exception E){
                E.printStackTrace();
            }



        }else if(e.getSource()== buttonRegister){
            setVisible(false);
            new Registration();
        }


    }


    public static void main(String[] args) {
        new Login();
    }



}
