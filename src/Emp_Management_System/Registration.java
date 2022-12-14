package Emp_Management_System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {
    JLabel nameLabel, fatherNameLabel, emailLabel, dobLabel, phoneLabel, employeeLabel, designationLabel, salaryLabel, addressLabel, passwordLabel, confirmPasswordLabel;
    JTextField tfName, tfFatherName, tfEmail, tfPhone, tfEmployeeId,tfDesignation, tfSalary, tfAddress, tfPassword, tfConfirmPassword;
    JButton registerButton, cancelButton;
    JDateChooser dateChooser;



    Registration(){
//        getContentPane().setBackground(Color.white);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        int horizontalShift = 215;
        int verticalShift = 60;
        int buttonShiftVertical = 440;

//        Heading :

        JTextField heading  = new JTextField("Registration Form");


//        Name :
        nameLabel = new JLabel("Name : ");
        nameLabel.setBounds(40, verticalShift, 100, 30);
        add(nameLabel);
        tfName = new JTextField();
        tfName.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfName);
        applyFontStyle(nameLabel, tfName);



//        Father's Name :
        verticalShift+=40;
        fatherNameLabel = new JLabel("Father's Name : ");
        fatherNameLabel.setBounds(40, verticalShift, 130, 30);
        fatherNameLabel.setFont(new Font("serif", Font.BOLD, 18));
        add(fatherNameLabel);
        tfFatherName = new JTextField();
        tfFatherName.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfFatherName);
        applyFontStyle(fatherNameLabel, tfFatherName);



//        Email :
        verticalShift+=40;
        emailLabel = new JLabel("Email : ");
        emailLabel.setBounds(40, verticalShift, 100, 30);
        add(emailLabel);
        tfEmail = new JTextField();
        tfEmail.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfEmail);
        applyFontStyle(emailLabel, tfEmail);


//        Date Of Birth
        verticalShift+=40;
        dobLabel = new JLabel("DOB : ");
        dobLabel.setBounds(40, verticalShift, 100, 30);
        add(dobLabel);
        dateChooser = new JDateChooser();
        dateChooser.setBounds(horizontalShift, verticalShift, 350, 25);
        add(dateChooser);
        dobLabel.setFont(new Font("serif", Font.BOLD, 18));
        dateChooser.setFont(new Font("serif", Font.PLAIN, 20));



//        Phone :
        verticalShift+=40;
        phoneLabel = new JLabel("Phone : ");
        phoneLabel.setBounds(40, verticalShift, 100, 30);
        add(phoneLabel);
        tfPhone = new JTextField();
        tfPhone.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfPhone);
        applyFontStyle(phoneLabel, tfPhone);



//        EmployeeId :
        verticalShift+=40;
        employeeLabel = new JLabel("Employee ID : ");
        employeeLabel.setBounds(40, verticalShift, 120, 30);
        add(employeeLabel);
        tfEmployeeId = new JTextField();
        tfEmployeeId.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfEmployeeId);
        applyFontStyle(employeeLabel, tfEmployeeId);


//        Designation :
        verticalShift+=40;
        designationLabel = new JLabel("Designation : ");
        designationLabel.setBounds(40, verticalShift, 120, 30);
        add(designationLabel);
        tfDesignation = new JTextField();
        tfDesignation.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfDesignation);
        applyFontStyle(designationLabel, tfDesignation);



//        Salary :
        verticalShift+=40;
        salaryLabel = new JLabel("Salary : ");
        salaryLabel.setBounds(40, verticalShift, 120, 30);
        add(salaryLabel);
        tfSalary = new JTextField();
        tfSalary.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfSalary);
        applyFontStyle(salaryLabel, tfSalary);




//        Address :
        verticalShift+=40;
        addressLabel = new JLabel("Address : ");
        addressLabel.setBounds(40, verticalShift, 100, 30);
        add(addressLabel);
        tfAddress = new JTextField();
        tfAddress.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfAddress);
        applyFontStyle(addressLabel, tfAddress);


//        Password :
        verticalShift+=40;
        passwordLabel = new JLabel("Password : ");
        passwordLabel.setBounds(40, verticalShift, 100, 30);
        add(passwordLabel);
        tfPassword = new JTextField();
        tfPassword.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfPassword);
        applyFontStyle(passwordLabel, tfPassword);


//        Confirm Password :
        verticalShift+=40;
        confirmPasswordLabel = new JLabel("Confirm Password : ");
        confirmPasswordLabel.setBounds(40, verticalShift, 170, 30);
        add(confirmPasswordLabel);
        tfConfirmPassword = new JTextField();
        tfConfirmPassword.setBounds(horizontalShift, verticalShift, 350, 30);
        add(tfConfirmPassword);
        applyFontStyle(confirmPasswordLabel, tfConfirmPassword);


//        Buttons : Register
        buttonShiftVertical+=70;
        registerButton = new JButton("Register");
        registerButton.setBounds(horizontalShift, buttonShiftVertical, 150, 40);
        registerButton.setBackground(Color.black);
        registerButton.addActionListener(this::actionPerformed);
        add(registerButton);
        applyFontButton(registerButton);


//        Buttons : Cancel
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(415, buttonShiftVertical, 150, 40);
        cancelButton.setBackground(Color.black);
        cancelButton.addActionListener(this::actionPerformed);
        add(cancelButton);
        applyFontButton(cancelButton);



        setSize(850, 700);
        setLocation(330, 80);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton){
            System.out.println("Registration Area : ");
            setVisible(false);
            System.exit(0);
        }else if(e.getSource()==cancelButton){
            System.out.println("Registration Cancelled ! ");
            setVisible(false);
            System.exit(0);
        }
    }

    public static void applyFontStyle(JLabel label, JTextField field){
        label.setFont(new Font("serif", Font.BOLD, 18));
        field.setFont(new Font("serif", Font.PLAIN, 18));
    }

    public static void applyFontButton(JButton button){
        button.setFont(new Font("serif", Font.BOLD, 20));
    }



    public static void main(String[] args) {
        new Registration();

    }


}
