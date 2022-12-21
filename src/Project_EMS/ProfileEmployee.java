package Project_EMS;

import javax.swing.*;
import java.awt.*;

public class ProfileEmployee extends JFrame {
    ProfileEmployee(){
        setLayout(null);
        getContentPane().setBackground(Color.pink);

        setSize(720, 400);
        setLocation(360, 220);
        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new ProfileEmployee();

    }
}
