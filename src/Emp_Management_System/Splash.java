package Emp_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static Emp_Management_System.ApplyFontStyle.applyFontButtonBig;

public class Splash extends JFrame implements ActionListener{

    JButton clickHere;
    JLabel heading;
    public Splash(){


        getContentPane().setBackground(Color.white);
        heading = new JLabel("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
        setLayout(null);
        heading.setBounds(40, 40, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.blue);
        add(heading);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image image2 = image1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        clickHere = new JButton("Click Here To Continue");
        clickHere.setBounds(400, 400, 300, 70);
        applyFontButtonBig(clickHere);
        clickHere.setBackground(Color.BLACK);
        clickHere.addActionListener(this::actionPerformed);
        image.add(clickHere);



        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        while (true){
            heading.setVisible(false);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            heading.setVisible(true);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clickHere){
            setVisible(false);
            new Login();
        }

    }



    public static void main(String[] args) throws IOException {
        new Splash();
    }


}
