package Employee_Management_System;

import javax.swing.*;
import java.awt.*;

public class ApplyFontStyle {
//    Applying Font & Styles on JLabel and JTextField :
    public static void applyFontStyle(JLabel label, JTextField field){
        label.setFont(new Font("serif", Font.BOLD, 18));
        field.setFont(new Font("serif", Font.PLAIN, 18));
    }

    public static void applyFontButtonBig(JButton button){
        button.setFont(new Font("serif", Font.BOLD, 20));
    }



    public static void applyFontStyleButtonBig(JButton [] buttonArray){
        for(JButton button:buttonArray){
            button.setFont(new Font("Serif", Font.BOLD, 20));
            button.setBackground(Color.black);
            button.setForeground(Color.BLUE);
        }
    }

    public  static  void applyFontStyleButtonSmall(JButton [] buttonArray){
        for(JButton button:buttonArray){
            button.setFont(new Font("serif", Font.BOLD, 16));
        }
    }
}
