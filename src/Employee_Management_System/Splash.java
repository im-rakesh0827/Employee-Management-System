package Employee_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static Employee_Management_System.ApplyFontStyle.applyFontButtonBig;

public class Splash extends JFrame implements ActionListener{

    JButton buttonClickHere;
    JButton buttonAbout;
    JButton buttonHome;
    JButton buttonHelp;
    JButton buttonSupport;
    JLabel heading;
    public Splash(){
        getContentPane().setBackground(Color.white);
        heading = new JLabel("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
        setLayout(null);
        heading.setBounds(75, 40, 1020, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.GRAY);
        add(heading);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image image2 = image1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(50, 100, 1070, 600);
        add(image);

        buttonClickHere = new JButton("Click Here To Continue");
        buttonClickHere.setBounds(400, 480, 300, 70);
        applyFontButtonBig(buttonClickHere);
        buttonClickHere.setBackground(Color.BLACK);
        buttonClickHere.addActionListener(this::actionPerformed);
        image.add(buttonClickHere);

        setSize(1170, 750);
        setLocation(200, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        while (true){
            heading.setVisible(false);
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            heading.setVisible(true);
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== buttonClickHere){
            setVisible(false);
            new Login();
        }

    }



    public static void main(String[] args) throws IOException {
        new Splash();
    }


}
