package Employee_Management_System;
import javax.swing.*;
public class ConfirmChoice extends JFrame {
    static JFrame frame;
    public static boolean confirmOptionYesNo(){
        frame = new JFrame();
        return JOptionPane.showConfirmDialog(frame, "Press Yes/No To Confirm...", "Are You Sure !", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION;
    }
    public static boolean confirmOptionClose(){
        frame = new JFrame();
        return JOptionPane.showConfirmDialog(frame, "Press Ok To Confirm...", "Are You Sure !",  JOptionPane.CLOSED_OPTION)==JOptionPane.CLOSED_OPTION;
    }
    public static boolean confirmOptionCancel(){
        frame = new JFrame();
        return JOptionPane.showConfirmDialog(frame,  "Press Ok/Cancel To Confirm...", "Are You Sure !",  JOptionPane.CANCEL_OPTION)==JOptionPane.CANCEL_OPTION;
    }

    public static boolean confirmOptionOkCancel(){
        frame = new JFrame();
        return JOptionPane.showConfirmDialog(frame,  "Press Ok/Cancel To Confirm...", "Are You Sure !",  JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_CANCEL_OPTION;
    }




}
