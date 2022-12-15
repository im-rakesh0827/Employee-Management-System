package Employee_Management_System;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static Employee_Management_System.ApplyFontStyle.*;
public class Registration extends JFrame implements ActionListener {
    JLabel labelName, labelFatherName, labelEmail, labelDOB, labelEducation, labelPhone, labelAadhar, labelEmployee, labelEmployeeID, labelDesignation, labelSalary, labelAddress, labelPassword, labelConfirmPassword;
    JTextField tfName, tfFatherName, tfEmail, tfPhone, tfAadhar, tfDesignation, tfSalary, tfAddress, tfPassword, tfConfirmPassword;
    JButton buttonSubmit, buttonBack, buttonCancel;
    JDateChooser chooserDate;
    JComboBox boxEducation;

    JButton [] buttonArray;
    JLabel [] labelArray;
    JTextField [] textFieldArray;

    Random random = new Random();
    int empNumber = random.nextInt(999999);

    Registration(){
//        getContentPane().setBackground(Color.LIGHT_GRAY);
//        getContentPane().setBackground(Color.getHSBColor(120,260,150));

        setLayout(null);
        int horizontalShift = 215;
        int verticalShift = 60;
        int buttonShiftVertical = 440;
        int textFieldArea = 550;

//        Heading :
        JLabel heading  = new JLabel("REGISTRATION FORM");
        heading.setBounds(175, 10, 500, 30);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setBackground(Color.CYAN);
        add(heading);

//        Name :
        labelName = new JLabel("Name : ");
        labelName.setBounds(40, verticalShift, 100, 30);
        add(labelName);
        tfName = new JTextField();
        tfName.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfName);
        applyFontStyle(labelName, tfName);



//        Father's Name :
        verticalShift+=40;
        labelFatherName = new JLabel("Father's Name : ");
        labelFatherName.setBounds(40, verticalShift, 130, 30);
        labelFatherName.setFont(new Font("serif", Font.BOLD, 18));
        add(labelFatherName);
        tfFatherName = new JTextField();
        tfFatherName.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfFatherName);
        applyFontStyle(labelFatherName, tfFatherName);



//        Email :
        verticalShift+=40;
        labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(40, verticalShift, 100, 30);
        add(labelEmail);
        tfEmail = new JTextField();
        tfEmail.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfEmail);
        applyFontStyle(labelEmail, tfEmail);


//        Date Of Birth
        verticalShift+=40;
        labelDOB = new JLabel("DOB : ");
        labelDOB.setBounds(40, verticalShift, 100, 30);
        labelDOB.setFont(new Font("serif", Font.BOLD, 18));
        add(labelDOB);

        chooserDate = new JDateChooser();
        chooserDate.setBounds(horizontalShift, verticalShift, textFieldArea, 25);
        add(chooserDate);
        chooserDate.setFont(new Font("serif", Font.PLAIN, 20));


//        Aadhaar :
        verticalShift+=40;
        labelAadhar = new JLabel("Aadhar : ");
        labelAadhar.setBounds(40, verticalShift, 100, 30);
        add(labelAadhar);
        tfAadhar = new JTextField();
        tfAadhar.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfAadhar);
        applyFontStyle(labelAadhar, tfAadhar);


//        Phone :
        verticalShift+=40;
        labelPhone = new JLabel("Phone : ");
        labelPhone.setBounds(40, verticalShift, 100, 30);
        add(labelPhone);
        tfPhone = new JTextField();
        tfPhone.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfPhone);
        applyFontStyle(labelPhone, tfPhone);


//        Address :
        verticalShift+=40;
        labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(40, verticalShift, 100, 30);
        add(labelAddress);
        tfAddress = new JTextField();
        tfAddress.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfAddress);
        applyFontStyle(labelAddress, tfAddress);




//        Education :
        String courses[] = {" ", "B.Tech", "BE", "BCA", "B.Sc","B.Com", "BA", "BBA", "MBA", "MCA", "M.Tech", "M.Sc", "PHD"};
        verticalShift+=40;
        labelEducation = new JLabel("Highest Education : ");
        labelEducation.setBounds(40, verticalShift, 165, 30);
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
        labelEmployee.setFont(new Font("serif", Font.BOLD, 18));

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
        applyFontStyle(labelDesignation, tfDesignation);



//        Salary :
        verticalShift+=40;
        labelSalary = new JLabel("Salary : ");
        labelSalary.setBounds(40, verticalShift, 120, 30);
        add(labelSalary);
        tfSalary = new JTextField();
        tfSalary.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfSalary);
        applyFontStyle(labelSalary, tfSalary);


//        Password :
        verticalShift+=40;
        labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(40, verticalShift, 100, 30);
        add(labelPassword);
        tfPassword = new JTextField();
        tfPassword.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfPassword);
        applyFontStyle(labelPassword, tfPassword);


//        Confirm Password :
        verticalShift+=40;
        labelConfirmPassword = new JLabel("Confirm Password : ");
        labelConfirmPassword.setBounds(40, verticalShift, 170, 30);
        add(labelConfirmPassword);
        tfConfirmPassword = new JTextField();
        tfConfirmPassword.setBounds(horizontalShift, verticalShift, textFieldArea, 30);
        add(tfConfirmPassword);
        applyFontStyle(labelConfirmPassword, tfConfirmPassword);




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
        buttonCancel.setBackground(Color.black);
        buttonCancel.addActionListener(this::actionPerformed);
        add(buttonCancel);

        buttonArray = new JButton[]{buttonSubmit, buttonBack, buttonCancel};
        applyFontStyleButtonBig(buttonArray);


        setSize(850, 700);
        setLocation(330, 80);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== buttonSubmit){
            setVisible(false);
            String name = tfName.getText();
            String fatherName = tfFatherName.getText();
            String email = tfEmail.getText();
//            String dob = chooserDate.getDateEditor().getUiComponent().getText();
            String aadhar = tfAadhar.getText();
            String phone = tfPhone.getText();
            String address = tfAddress.getText();
            String education  = (String) boxEducation.getSelectedItem();
            String employeeId = labelEmployeeID.getText();
            String designation = tfDesignation.getText();
            String salary = tfSalary.getText();
            String password = tfPassword.getText();

            try {
                Conn c = new Conn();
//                String query = "insert into employees values(name, fatherName, email, dob, aadhar, phone, address, education, employeeId, designation, salary, password)"+"values(?, ?, ?, null, ?, ?, ?, ?, ?, ?, ?, ?)";
                String query  = "insert into temp(email, password)"+"values(?, ?)";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Added Successfully.");
                setVisible(false);
                new Home();
            }catch (Exception E){
                E.printStackTrace();
            }


        }else if(e.getSource()==buttonBack){
            setVisible(false);
            new Login();
        }
        else if(e.getSource()== buttonCancel){
            System.out.println("Registration Cancelled ! ");
            setVisible(false);
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Registration();
    }


}
