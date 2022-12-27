package Project_EMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Project_EMS.ConfirmChoice.confirmOptionYesNo;

public class RegisterAdmin extends JFrame implements ActionListener {
    JButton buttonSubmit, buttonBack, buttonCancel;
    RegisterAdmin(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(120,258,150));

        JLabel heading  = new JLabel("ADMIN REGISTRATION FORM");
        heading.setBounds(120, 15, 600, 30);
        heading.setFont(new Font("serif",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);











//        Button Area : Submit
        int buttonShiftVertical=560;
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(100, buttonShiftVertical, 150, 40);
        buttonSubmit.addActionListener(this::actionPerformed);
        add(buttonSubmit);


//        Button : Back
        buttonBack = new JButton("Back");
        buttonBack.setBounds(345, buttonShiftVertical, 150, 40);
        buttonBack.setBackground(Color.black);
        buttonBack.addActionListener(this::actionPerformed);
        add(buttonBack);


//        Buttons : Cancel
        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(600, buttonShiftVertical, 150, 40);
        buttonCancel.addActionListener(this::actionPerformed);
        add(buttonCancel);



        setSize(850, 700);
        setLocation(300, 80);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new RegisterAdmin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonSubmit)){
            System.out.println("Your Details Are Submitted Successfully");
            System.exit(0);
        }else if(e.getSource().equals(buttonBack)){
            if(confirmOptionYesNo()){
                setVisible(false);
                new LoginAdmin();
            }
        }else if(e.getSource().equals(buttonCancel)){
           if(confirmOptionYesNo()){
               setVisible(false);
               new Home();
           }
        }
    }
}
