package Emp_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import static Emp_Management_System.Registration.applyFontButton;
import static Emp_Management_System.Registration.applyFontStyle;

public class Login extends JFrame implements ActionListener {
    private JTextField tfEmail;
    private JTextField tfUsername;
    private final JPasswordField pfPassword;
    private final JButton loginButton, registerButton;
    private final JLabel password, userName;


    public Login(){
        getContentPane().setBackground(Color.white);
//        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        int verticalShift = 100;

        userName = new JLabel("Email : ");
        userName.setBounds(40, verticalShift, 100, 30);
        add(userName);
        tfUsername = new JTextField();
        tfUsername.setBounds(150, verticalShift, 270, 30);
        add(tfUsername);
        applyFontStyle(userName, tfUsername);


        verticalShift+=40;
        password = new JLabel("Password : ");
        password.setBounds(40, verticalShift, 100, 30);
        add(password);
        pfPassword = new JPasswordField();
        pfPassword.setBounds(150, verticalShift, 270, 30);
        add(pfPassword);
        applyFontStyle(password, pfPassword);

        verticalShift+=60;
        loginButton = new JButton("Login");
        loginButton.setBounds(150, verticalShift, 100, 40);
        loginButton.setBackground(Color.black);
        add(loginButton);
        loginButton.addActionListener(this::actionPerformed);
        applyFontButton(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(320, verticalShift, 100, 40);
        registerButton.setBackground(Color.black);
        registerButton.addActionListener(this::actionPerformed);
        add(registerButton);
        applyFontButton(registerButton);



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
        if(e.getSource()==loginButton){
            try {
                final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
                final String USERNAME = "root";
                final String PASSWORD = "Apple@0827";

                String email = tfEmail.getText();
                String password = String.valueOf(pfPassword.getPassword());
//                String query = "select * registration where  email= '"+email+"' and password = '"+password+"'";

                Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//                Statement statement  = connection.createStatement();
                String sql = "select * from registration where email=? and password=?";
                PreparedStatement prepareStatement = connection.prepareStatement(sql);
                prepareStatement.setString(1, email);
                prepareStatement.setString(2, password);

                ResultSet resultSet = prepareStatement.executeQuery();
                if(resultSet.next()) {
                    System.out.println("Login Successful : ");
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid Login Credential",
                            "Try Again !",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }catch (Exception E){
                E.printStackTrace();
            }
        }else if(e.getSource()==registerButton){
            setVisible(false);
            new Registration();
        }

    }


    public static void main(String[] args) {
        new Login();
    }



}
