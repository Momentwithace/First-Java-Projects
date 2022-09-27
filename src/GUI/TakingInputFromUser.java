package GUI;

import javax.swing.*;

public class TakingInputFromUser {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" year's old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height"));
        JOptionPane.showMessageDialog(null, "Your height is "+height+" feet");
    }
}
