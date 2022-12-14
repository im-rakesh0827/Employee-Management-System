package Emp_Management_System;

import javax.swing.*;
import java.awt.*;

public class ApplyFontStyle {
    public static void applyFontStyle(JLabel label, JTextField field){
        label.setFont(new Font("serif", Font.BOLD, 18));
        field.setFont(new Font("serif", Font.PLAIN, 18));
    }

    public static void applyFontButtonBig(JButton button){
        button.setFont(new Font("serif", Font.BOLD, 20));
    }

    public static void applyFontButtonSmall(JButton button){
        button.setFont(new Font("serif", Font.BOLD, 16));
    }
}
