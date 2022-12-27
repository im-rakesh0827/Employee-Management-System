package Project_EMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static Project_EMS.ApplyFontStyle.applyFontStyleButtonBig;

public class Splash extends JFrame implements ActionListener{

    JButton buttonClickHere;
    JButton buttonAbout;
    JButton buttonHome;
    JButton buttonHelp;
    JButton buttonSupport;
    JLabel labelHeading;
    public Splash(){
        getContentPane().setBackground(Color.white);
        labelHeading = new JLabel("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
        setLayout(null);
        labelHeading.setBounds(75, 40, 1020, 60);
        labelHeading.setFont(new Font("serif", Font.BOLD, 40));
        labelHeading.setForeground(Color.YELLOW);
        add(labelHeading);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image image2 = image1.getImage().getScaledInstance(1170, 750, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(0, 0, 1170, 750);
        add(image);

        buttonClickHere = new JButton("Click Here To Continue");
        buttonClickHere.setBounds(400, 560, 300, 70);
        buttonClickHere.setForeground(Color.BLUE);
        buttonClickHere.addActionListener(this::actionPerformed);
        applyFontStyleButtonBig(new JButton[]{buttonClickHere});
        image.add(buttonClickHere);


        setSize(1170, 750);
        setLocation(140, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        blinkLabel(labelHeading);
        blinkButton(buttonClickHere);



    }

    public static void blinkButton(JButton button){
        while (true){
            button.setVisible(false);
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            button.setVisible(true);
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void blinkLabel(JLabel label){
        while (true){
            label.setVisible(false);
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            label.setVisible(true);
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
            new Home();
        }

    }



    public static void main(String[] args) throws IOException {
        new Splash();
    }


}
