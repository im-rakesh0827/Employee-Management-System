package Project_EMS;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

import static Project_EMS.ApplyFontStyle.applyFontStyleButtonBig;
import static Project_EMS.ApplyFontStyle.applyFontStyleLabelField;
import static Project_EMS.ConfirmChoice.confirmOptionYesNo;

public class RegisterEmployee extends JFrame implements ActionListener {
    JLabel labelName, labelFatherName, labelEmail, labelDOB, labelAadhar, labelPhone, labelAddress, labelEducation, labelEmployeeID, labelDesignation, labelSalary,  labelPassword, labelConfirmPassword;
    JLabel  labelEmployee;
    JTextField tfName, tfFatherName, tfEmail,  tfAadhar, tfPhone, tfAddress,  tfDesignation, tfSalary, tfPassword, DOB;
    JButton buttonSubmit, buttonBack, buttonCancel;
    JDateChooser chooserDate;
    JComboBox boxEducation;
    JPasswordField pfConfirmPassword;
    JFrame frame;

    JButton [] buttonArray;
    JLabel [] labelArray;
    JTextField [] textFieldArray;
    Random random = new Random();
    int empNumber = random.nextInt(999999);

    RegisterEmployee(){
        setLayout(null);
//        getContentPane().setBackground(Color.getHSBColor(120,258,150));
//        getContentPane().setBackground(Color.WHITE);
//        applyColorFrameBackground();



        int horizontalShift = 215;
        int verticalShift = 60;
        int buttonShiftVertical = 440;
        int textFieldArea = 550;
//        Heading :
        JLabel heading  = new JLabel("REGISTRATION FORM");
        heading.setBounds(260, 15, 500, 30);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);

//        Name :
        labelName = new JLabel("Name : ");
        labelName.setBounds(40, verticalShift, 100, 30);
        add(labelName);
        tfName = new JTextField();
        tfName.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfName);
//        applyFontStyle(labelName, tfName);



//        Father's Name :
        verticalShift+=40;
        labelFatherName = new JLabel("Father's Name : ");
        labelFatherName.setBounds(40, verticalShift, 130, 30);
        add(labelFatherName);
        tfFatherName = new JTextField();
        tfFatherName.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfFatherName);
//        applyFontStyle(labelFatherName, tfFatherName);



//        Email :
        verticalShift+=40;
        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(40, verticalShift, 100, 30);
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfEmail);
//        applyFontStyle(labelEmail, tfEmail);


//        Date Of Birth
        verticalShift+=40;
        labelDOB = new JLabel("DOB : ");
        labelDOB.setBounds(40, verticalShift, 100, 30);
        add(labelDOB);

        chooserDate = new JDateChooser();
//        chooserDate.setBounds(horizontalShift, verticalShift, textFieldArea, 25);
//        add(chooserDate);
//        chooserDate.setFont(new Font("serif", Font.PLAIN, 20));

        DOB = new JTextField();
        DOB.setBounds(horizontalShift, verticalShift, textFieldArea, 25);
        DOB.setFont(new Font("serif", Font.PLAIN, 20));
        add(DOB);



//        Aadhaar :
        verticalShift+=40;
        labelAadhar = new JLabel("Aadhar : ");
        labelAadhar.setBounds(40, verticalShift, 100, 30);
        add(labelAadhar);
        tfAadhar = new JTextField();
        tfAadhar.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfAadhar);
//        applyFontStyle(labelAadhar, tfAadhar);


//        Phone :
        verticalShift+=40;
        labelPhone = new JLabel("Phone : ");
        labelPhone.setBounds(40, verticalShift, 100, 30);
        add(labelPhone);
        tfPhone = new JTextField();
        tfPhone.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfPhone);
//        applyFontStyle(labelPhone, tfPhone);


//        Address :
        verticalShift+=40;
        labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(40, verticalShift, 100, 30);
        add(labelAddress);
        tfAddress = new JTextField();
        tfAddress.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfAddress);
//        applyFontStyle(labelAddress, tfAddress);



//        Education :
        String courses[] = {" ", "B.Tech", "BE", "BCA", "B.Sc","B.Com", "BA", "BBA", "MBA", "MCA", "M.Tech", "M.Sc", "PHD", "Other"};
        verticalShift+=40;
        labelEducation = new JLabel("Highest Education : ");
        labelEducation.setBounds(40, verticalShift, 160, 30);
        labelEducation.setFont(new Font("serif", Font.BOLD, 18));
        add(labelEducation);

        boxEducation = new JComboBox(courses);
        boxEducation.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        boxEducation.setFont(new Font("serif", Font.PLAIN, 18));
        add(boxEducation);


//        EmployeeId :
        verticalShift+=40;
        labelEmployee = new JLabel("Employee ID : ");
        labelEmployee.setBounds(40, verticalShift, 120, 30);
        add(labelEmployee);
        labelEmployeeID = new JLabel(" "+empNumber);
        labelEmployeeID.setBounds(220, verticalShift, 120, 30);
        add(labelEmployeeID);
        labelEmployeeID.setFont(new Font("serif", Font.PLAIN, 18));


//        JTextField tfEmployeeId = new JTextField(""+empNumber);
//        tfEmployeeId.setBounds(horizontalShift, verticalShift, 350, 30);
//        add(tfEmployeeId);
//        applyFontStyle(labelEmployee, tfEmployeeId);


//        Designation :
        verticalShift+=40;
        labelDesignation = new JLabel("Designation : ");
        labelDesignation.setBounds(40, verticalShift, 120, 30);
        add(labelDesignation);
        tfDesignation = new JTextField();
        tfDesignation.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfDesignation);
//        applyFontStyle(labelDesignation, tfDesignation);



//        Salary :
        verticalShift+=40;
        labelSalary = new JLabel("Salary : ");
        labelSalary.setBounds(40, verticalShift, 120, 30);
        add(labelSalary);
        tfSalary = new JTextField();
        tfSalary.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfSalary);
//        applyFontStyle(labelSalary, tfSalary);



//        Password :
        verticalShift+=40;
        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(40, verticalShift, 100, 30);
        add(labelPassword);
        tfPassword = new JTextField();
        tfPassword.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfPassword);
//        applyFontStyle(labelPassword, tfPassword);


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
//        applyFontStyle(labelConfirmPassword, tfConfirmPassword);







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
        labelArray = new JLabel[]{labelName, labelFatherName, labelEmail, labelDOB, labelEducation, labelPhone, labelAadhar, labelEmployee, labelEmployeeID, labelDesignation, labelSalary, labelAddress, labelPassword, labelConfirmPassword,};
        textFieldArray = new JTextField[]{tfName, tfFatherName, tfEmail, tfPhone, tfAadhar, tfDesignation, tfSalary, tfAddress, tfPassword};
        applyFontStyleLabelField(labelArray, textFieldArray);

        buttonArray = new JButton[]{buttonSubmit, buttonBack, buttonCancel};
        applyFontStyleButtonBig(buttonArray);


        setSize(850, 700);
        setLocation(300, 80);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonSubmit)){
            if(confirmOptionYesNo()){
                try {
                    registerEmployee();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new LoginEmployee();
            }
        }
        else if(e.getSource().equals(buttonCancel)){
            if(confirmOptionYesNo()){
                JOptionPane.showMessageDialog(
                        this,
                        "Press Ok To Go Home",
                        "Registration Cancelled!",
                        JOptionPane.ERROR_MESSAGE
                );
                setVisible(false);
                new Home();
            }

        }
    }
//    Can I use it in global scope : if yes then how
//    public void applyColorFrameBackground(){
////        getContentPane().setBackground(Color.BLUE);
//        getContentPane().setBackground(Color.getHSBColor(120,258,150));
//
//    }


//    public void registerUser1(){
//        try {
//            Conn connection = new Conn();
//            String query = "insert into employees (name, fatherName, email, dob, aadhar, phone, address, education, employeeId, designation, salary, password)"+"values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
////                String query  = "insert into temp(email, password)"+"values(?, ?)";
//            connection.statement.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Details Added Successfully.");
//            setVisible(false);
//            new Home();
//        }catch (Exception E){
//            E.printStackTrace();
//        }
//    }


    public void registerEmployee() throws SQLException {
        String name = tfName.getText();
        String fatherName = tfFatherName.getText();
        String email = tfEmail.getText();
        String dob = DOB.getText();
        String aadhar = tfAadhar.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        String education  = (String) boxEducation.getSelectedItem();
        String employeeId = labelEmployeeID.getText();
        String designation = tfDesignation.getText();
        String salary = tfSalary.getText();
        String password = tfPassword.getText();
        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

//        String [] dataArray = {name, fatherName, email, dob, aadhar, phone, address, education, employeeId, designation, salary, password};
//        boolean flag = true;
//        for(String data:dataArray){
//            if(data.isEmpty()){
//                flag = false;
//                break;
//            }
//        }
//        if(!flag){
//            frame = new JFrame();
//            if(JOptionPane.showConfirmDialog(frame, "Enter Details Carefully", "Details Missing !", JOptionPane.CLOSED_OPTION)==JOptionPane.CLOSED_OPTION){
//                new Registration();
//            }
//        }


        employee = addUserToDatabase(name, fatherName, email, dob, aadhar, phone, address, education, employeeId, designation, salary, password);
        if(name.isEmpty() || fatherName.isEmpty() || email.isEmpty() || dob.isEmpty() || aadhar.isEmpty() || phone.isEmpty() || address.isEmpty() || education.isEmpty() || employeeId.isEmpty() || designation.isEmpty() || salary.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(
                        this,
                        "Enter Details Carefully",
                        "Details Missing !",
                        JOptionPane.ERROR_MESSAGE
                );
        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(
                    this,
                    "Re-Enter Confirm Password...",
                    "Password Mismatch ! ",
                    JOptionPane.ERROR_MESSAGE
            );
        } else if(employee !=null){
            System.out.println("Successfully Registered : ");
            setVisible(false);
//            new Home();
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Failed to register new user : ",
                    "Try Again !",
                    JOptionPane.ERROR_MESSAGE
            );
//            setVisible(false);
        }
    }
    Connection connection;
    Statement statement;
    String query;
    PreparedStatement preparedStatement;
    public Employee employee;

    private Employee addUserToDatabase(String name,String fatherName, String email, String dob, String aadhar, String phone, String address, String education, String employeeId, String designation, String salary, String password) throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
        final String USERNAME = "root";
        final String PASSWORD = "Apple@0827";
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            query = "insert into employees(name, fatherName, email, dob, aadhar, phone, address, education, employeeId, designation, salary, password)"+"values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, fatherName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, dob);
            preparedStatement.setString(5, aadhar);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, address);
            preparedStatement.setString(8, education);
            preparedStatement.setString(9, employeeId);
            preparedStatement.setString(10, designation);
            preparedStatement.setString(11, salary);
            preparedStatement.setString(12, password);
            int addedRows = preparedStatement.executeUpdate();
            if(addedRows>0){
                employee = new Employee();
                employee.name = name;
                employee.email = email;
                employee.phone = phone;
                employee.aadhar = aadhar;
                employee.address = address;
                employee.employeeId = employeeId;
                employee.designation = designation;
                employee.fatherName = fatherName;
                employee.password = password;
                employee.salary = salary;
                employee.education = education;
                employee.dob = dob;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    public static void main(String[] args) {
        new RegisterEmployee();
        new Employee();
    }

}
