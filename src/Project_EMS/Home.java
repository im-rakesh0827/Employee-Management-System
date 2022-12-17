package Project_EMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import static Project_EMS.ApplyFontStyle.applyFontStyleButtonBig;
import static Project_EMS.ConfirmChoice.confirmOptionYesNo;

public class Home extends JFrame implements ActionListener {

    JLabel labelHeading, labelEmail, labelPassword;
    JTextField tfEmail;
    JPasswordField pfPassword;
    JButton buttonAdmin, buttonBack, buttonEmployee;

    JButton [] buttonArray;
    JLabel [] labelArray;
    JTextField [] textFieldArray;


    public Home(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        labelHeading = new JLabel("Employee Management Login Form");
        labelHeading.setBounds(220, 125, 700, 50);
        labelHeading.setFont(new Font("serif", Font.BOLD, 45));
        add(labelHeading);

        int verticalShift = 260;
        int horizontalShift = 135;

//        Login Button
        verticalShift+=60;
        buttonAdmin = new JButton("ADMIN");
        buttonAdmin.setBounds(horizontalShift, verticalShift, 250, 70);
        add(buttonAdmin);
        buttonAdmin.addActionListener(this::actionPerformed);

//        Button Back :
        horizontalShift+=320;
        buttonEmployee = new JButton("EMPLOYEE");
        buttonEmployee.setBounds(horizontalShift, verticalShift, 250, 70);
        add(buttonEmployee);
        buttonEmployee.addActionListener(this::actionPerformed);

//        Register Button
        horizontalShift+=320;
        buttonBack = new JButton("BACK");
        buttonBack.setBounds(horizontalShift, verticalShift, 250, 70);
        buttonBack.addActionListener(this::actionPerformed);
        add(buttonBack);


//        Applying Font & Styles on : Labels, Fields & Buttons
        buttonArray = new JButton[]{buttonAdmin, buttonEmployee, buttonBack};
        applyFontStyleButtonBig(buttonArray);


        setSize(1170, 750);
        setLocation(140, 50);
        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonAdmin)){
            setVisible(false);
            new LoginAdmin();
        }else if(e.getSource().equals(buttonEmployee)){
            setVisible(false);
            new LoginEmployee();
        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
//                new Splash();
            }
        }


    }

    public static void main(String[] args) {
        new Home();
    }
}
