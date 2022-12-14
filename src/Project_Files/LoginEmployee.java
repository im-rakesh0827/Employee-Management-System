package Project_Files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static Project_Files.ApplyFontStyle.*;
import static Project_Files.ConfirmChoice.confirmOptionYesNo;

public class LoginEmployee extends JFrame implements ActionListener {

    JLabel labelHeading, labelEmail, labelPassword;
    JTextField tfEmail;
    JPasswordField pfPassword;
    JButton buttonLogin, buttonRegister, buttonBack;

    JButton [] buttonArray;
    JLabel [] labelArray;
    JTextField [] textFieldArray;



    public LoginEmployee(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        labelHeading = new JLabel("Login Form : Employee");
        labelHeading.setBounds(150, 25, 360, 35);
        labelHeading.setFont(new Font("serif", Font.BOLD, 35));
        add(labelHeading);

        int verticalShift = 110;
        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(40, verticalShift, 100, 30);
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(150, verticalShift, 360, 30);
        add(tfEmail);
//        applyFontStyle(labelEmail, tfEmail);


        verticalShift+=40;
        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(40, verticalShift, 100, 30);
        add(labelPassword);
        pfPassword = new JPasswordField();
        pfPassword.setBounds(150, verticalShift, 360, 30);
        add(pfPassword);
//        applyFontStyle(labelPassword, pfPassword);



//        Login Button
        verticalShift+=60;
        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(150, verticalShift, 100, 40);
        add(buttonLogin);
        buttonLogin.addActionListener(this::actionPerformed);

//        Register Button
        buttonRegister = new JButton("Register");
        buttonRegister.setBounds(280, verticalShift, 100, 40);
        buttonRegister.addActionListener(this::actionPerformed);
        add(buttonRegister);

//        Button Back :
        buttonBack = new JButton("Back");
        buttonBack.setBounds(410, verticalShift, 100, 40);
        add(buttonBack);
        buttonBack.addActionListener(this::actionPerformed);



//        Applying Font & Styles on : Labels, Fields & Buttons
        labelArray = new JLabel[]{labelEmail, labelPassword};
        textFieldArray = new JTextField[]{tfEmail, pfPassword};
        applyFontStyleLabelField(labelArray, textFieldArray);
        buttonArray = new JButton[]{buttonLogin, buttonBack, buttonRegister};
        applyFontStyleButtonBig(buttonArray);


        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image image2 = image1.getImage().getScaledInstance(230, 230, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(520, 55, 200, 200);
        add(image);




        setSize(720, 400);
        setLocation(360, 220);
        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void authenticateEmployee(){
        try {
            String email = (tfEmail.getText()).toLowerCase();
            String password = String.valueOf(pfPassword.getPassword());
            Conn connection = new Conn();
            String query = "select * from employees where email='"+email+"'and password = '"+password+"'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            if(resultSet.next()){
                JOptionPane.showMessageDialog(
                        this,
                        "You Have Logged In Successfully",
                        "Login Successful",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Login Credential",
                        "Try Again !",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonLogin)){
            authenticateEmployee();
        }else if(e.getSource().equals(buttonRegister)){
            setVisible(false);
            new RegisterEmployee();
        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new Home();
            }

        }

    }
    public static void main(String[] args) {
        new LoginEmployee();
    }



}
