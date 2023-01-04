package Project_Files;

import javax.swing.*;
import java.awt.*;

public class Work extends JFrame {
    Work(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel heading = new JLabel("New Project : ");
        heading.setBounds(435, 30, 300, 50);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        add(heading);

        int verticalShift = 150;
        JLabel labelProject = new JLabel("Project Assigned To You :");
        labelProject.setBounds(40, verticalShift, 350, 30);
        labelProject.setFont(new Font("serif", Font.BOLD, 20));
        add(labelProject);

        JTextField tfProject = new JTextField();
        tfProject.setText("Hello");
        tfProject.setBounds(300, verticalShift, 300, 30);
        add(tfProject);





        setSize(1170, 750);
        setLocation(140, 50);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Work();
    }
}
