package todo;

import javax.swing.*;

public class application {
    public static void main(String[] args) {
        JFrame frame = new JFrame("//TODO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button);
        frame.setVisible(true);  
    }
}