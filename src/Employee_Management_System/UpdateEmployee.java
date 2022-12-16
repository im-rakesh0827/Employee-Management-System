package Employee_Management_System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import  java.sql.*;
import static Employee_Management_System.ApplyFontStyle.*;
import static Employee_Management_System.ApplyFontStyle.applyFontStyleButtonBig;
import static Employee_Management_System.ApplyFontStyle.applyFontStyleLabelField;
import static Employee_Management_System.ConfirmChoice.*;

public class UpdateEmployee extends JFrame implements ActionListener {
    JLabel labelName,labelNameFixed, labelFatherName, labelEmail, labelDOB,labelDobFixed, labelAadhar, labelAadharFixed, labelPhone, labelAddress, labelEducation, labelEmployeeID, labelEmployee, labelDesignation, labelSalary,  labelPassword, labelConfirmPassword;
    JTextField tfName, tfFatherName, tfEmail,  tfAadhar, tfPhone, tfAddress, tfEducation,  tfDesignation, tfSalary, tfPassword;
    JButton buttonSubmit, buttonBack, buttonCancel;
    JDateChooser chooserDate;
    JComboBox boxEducation;
    JPasswordField pfConfirmPassword;
    JButton [] buttonArray;
    JLabel [] labelArray;
    JTextField [] textFieldArray;
    String employeeId;
    JFrame frame;

    UpdateEmployee(String employeeId){
        this.employeeId = employeeId;
        setLayout(null);
//        getContentPane().setBackground(Color.getHSBColor(100,169,170));
        getContentPane().setBackground(Color.getHSBColor(120,258,150));
//        getContentPane().setBackground(Color.WHITE);


        int horizontalShift = 215;
        int verticalShift = 60;
        int buttonShiftVertical = 440;
        int textFieldArea = 550;
//        Heading :
        JLabel heading  = new JLabel("UPDATE INFORMATION");
        heading.setBounds(260, 15, 500, 30);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);

//        Name :
        labelName = new JLabel("Name : ");
        labelName.setBounds(40, verticalShift, 100, 30);
        add(labelName);
//        tfName = new JTextField();
//        tfName.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
//        add(tfName);
        labelNameFixed = new JLabel();
        labelNameFixed.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(labelNameFixed);



//        Father's Name :
        verticalShift+=40;
        labelFatherName = new JLabel("Father's Name : ");
        labelFatherName.setBounds(40, verticalShift, 130, 30);
        add(labelFatherName);
        tfFatherName = new JTextField();
        tfFatherName.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfFatherName);



//        Email :
        verticalShift+=40;
        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(40, verticalShift, 100, 30);
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfEmail);


//        Date Of Birth
        verticalShift+=40;
        labelDOB = new JLabel("DOB : ");
        labelDOB.setBounds(40, verticalShift, 100, 30);
        add(labelDOB);

//        chooserDate = new JDateChooser();
//        chooserDate.setBounds(horizontalShift, verticalShift, textFieldArea, 25);
//        add(chooserDate);
//        chooserDate.setFont(new Font("serif", Font.PLAIN, 20));

        labelDobFixed = new JLabel();
        labelDobFixed.setBounds(horizontalShift, verticalShift, textFieldArea, 25);
        add(labelDobFixed);






//        Aadhaar :
        verticalShift+=40;
        labelAadhar = new JLabel("Aadhar : ");
        labelAadhar.setBounds(40, verticalShift, 100, 30);
        add(labelAadhar);
//        tfAadhar = new JTextField();
//        tfAadhar.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
//        add(tfAadhar);

        labelAadharFixed = new JLabel();
        labelAadharFixed.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(labelAadharFixed);




//        Phone :
        verticalShift+=40;
        labelPhone = new JLabel("Phone : ");
        labelPhone.setBounds(40, verticalShift, 100, 30);
        add(labelPhone);
        tfPhone = new JTextField();
        tfPhone.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfPhone);


//        Address :
        verticalShift+=40;
        labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(40, verticalShift, 100, 30);
        add(labelAddress);
        tfAddress = new JTextField();
        tfAddress.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfAddress);



//        Education :
        verticalShift+=40;
        labelEducation = new JLabel("Highest Education : ");
        labelEducation.setBounds(40, verticalShift, 160, 30);
        labelEducation.setFont(new Font("serif", Font.BOLD, 18));
        add(labelEducation);

//        String courses[] = {"Select", "B.Tech", "BE", "BCA", "B.Sc","B.Com", "BA", "BBA", "MBA", "MCA", "M.Tech", "M.Sc", "PHD", "Other"};
//        boxEducation = new JComboBox(courses);
//        boxEducation.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
//        boxEducation.setFont(new Font("serif", Font.PLAIN, 18));
//        add(boxEducation);

        tfEducation = new JTextField();
        tfEducation.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfEducation);




//        EmployeeId :
        verticalShift+=40;
        labelEmployee = new JLabel("Employee ID : ");
        labelEmployee.setBounds(40, verticalShift, 120, 30);
        add(labelEmployee);
        labelEmployeeID = new JLabel();
        labelEmployeeID.setBounds(220, verticalShift, 120, 30);
        add(labelEmployeeID);
        labelEmployeeID.setFont(new Font("serif", Font.PLAIN, 18));

//        JTextField tfEmployeeId = new JTextField(""+empNumber);
//        tfEmployeeId.setBounds(horizontalShift, verticalShift, 350, 30);
//        add(tfEmployeeId);


//        Designation :
        verticalShift+=40;
        labelDesignation = new JLabel("Designation : ");
        labelDesignation.setBounds(40, verticalShift, 120, 30);
        add(labelDesignation);
        tfDesignation = new JTextField();
        tfDesignation.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfDesignation);


//        Salary :
        verticalShift+=40;
        labelSalary = new JLabel("Salary : ");
        labelSalary.setBounds(40, verticalShift, 120, 30);
        add(labelSalary);
        tfSalary = new JTextField();
        tfSalary.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfSalary);



//        Password :
        verticalShift+=40;
        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(40, verticalShift, 100, 30);
        add(labelPassword);
        tfPassword = new JTextField();
        tfPassword.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfPassword);


//        Confirm Password :
        verticalShift+=40;
        labelConfirmPassword = new JLabel("Confirm Password : ");
        labelConfirmPassword.setBounds(40, verticalShift, 170, 30);
        add(labelConfirmPassword);


        pfConfirmPassword = new JPasswordField();
        pfConfirmPassword.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(pfConfirmPassword);

//        tfConfirmPassword = new JTextField();
//        tfConfirmPassword.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
//        add(tfConfirmPassword);







//        Button Area : Submit
        buttonShiftVertical+=160;
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(217, buttonShiftVertical, 150, 40);
        buttonSubmit.addActionListener(this::actionPerformed);
        add(buttonSubmit);


//        Button : Back
        buttonBack = new JButton("Back");
        buttonBack.setBounds(415, buttonShiftVertical, 150, 40);
        buttonBack.setBackground(Color.black);
        buttonBack.addActionListener(this::actionPerformed);
        add(buttonBack);


//        Buttons : Cancel
        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(613, buttonShiftVertical, 150, 40);
        buttonCancel.addActionListener(this::actionPerformed);
        add(buttonCancel);


//        Applying Font and Style on Buttons, Labels and TextField :
        labelArray = new JLabel[]{labelName, labelNameFixed, labelFatherName, labelEmail, labelDOB, labelDobFixed, labelAadhar, labelAadharFixed, labelPhone, labelAddress, labelEducation, labelEmployeeID, labelEmployee, labelDesignation, labelSalary, labelPassword, labelConfirmPassword,};
        textFieldArray = new JTextField[]{tfFatherName, tfEmail, tfPhone, tfDesignation, tfSalary, tfAddress, tfPassword};
        applyFontStyleLabelField(labelArray, textFieldArray);

        buttonArray = new JButton[]{buttonSubmit, buttonBack, buttonCancel};
        applyFontStyleButtonBig(buttonArray);

        try {
            Conn connection = new Conn();
            String query = "select * from employees where employeeId = '"+employeeId+"'";
            ResultSet resultSet  = connection.statement.executeQuery(query);
            while(resultSet.next()){
                labelNameFixed.setText(resultSet.getString("name"));
                tfFatherName.setText(resultSet.getString("fatherName"));
                tfEmail.setText(resultSet.getString("email"));
                labelDobFixed.setText(resultSet.getString("dob"));
                labelAadharFixed.setText(resultSet.getString("aadhar"));
                tfPhone.setText(resultSet.getString("phone"));
                tfAddress.setText(resultSet.getString("address"));
//                boxEducation.setActionCommand(resultSet.getString("education"));
                tfEducation.setText(resultSet.getString("education"));
                labelEmployeeID.setText(resultSet.getString("employeeId"));
                tfDesignation.setText(resultSet.getString("designation"));
                tfSalary.setText(resultSet.getString("salary"));
                tfPassword.setText(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        setSize(850, 700);
        setLocation(300, 80);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonSubmit){
            String fatherName = tfFatherName.getText();
            String email = tfEmail.getText();
            String phone = tfPhone.getText();
            String address = tfAddress.getText();
            String eduction = tfEducation.getText();
            String designation = tfDesignation.getText();
            String salary = tfSalary.getText();
            String password = tfPassword.getText();
            String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());
            String [] dataArray = {fatherName, email, phone, address, eduction, designation, salary, password, confirmPassword};
            boolean flag = true;
            for(String data:dataArray){
                if(data.isEmpty()){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                frame = new JFrame();
                if(JOptionPane.showConfirmDialog(frame, "Enter Details Carefully", "Details Missing !", JOptionPane.CLOSED_OPTION)==JOptionPane.CLOSED_OPTION){
                    dispose();
                }
            }else if(!password.equals(confirmPassword)){
                JOptionPane.showMessageDialog(
                        this,
                        "Re-Enter Confirm Password...",
                        "Password Mismatch ! ",
                        JOptionPane.ERROR_MESSAGE
                );

            }

//            try {
//                Conn connection = new Conn();
//                String query = "update employee set name = ";
//                connection.statement.executeUpdate(query);
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
        }else if(e.getSource()==buttonBack){
            if(confirmOptionYesNo()){
                setVisible(false);
                new ViewEmployee();
            }
        }else if(e.getSource()==buttonCancel){
            if(confirmOptionYesNo()){
                setVisible(false);
                new ViewEmployee();
            }
        }

    }

    public static void main(String[] args) {
        new UpdateEmployee(null);
    }
}
