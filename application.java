package todo;

import javax.swing.*;
import java.awt.event.*;

public class application implements ActionListener{

    runApp() {
        JFrame frame = new JFrame("//TODO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField newTaskNameField = new JTextField("New Task");
        newTaskNameField.setBounds(5,5,250,30);

        JButton button = new JButton("Create");
        button.setBounds(260,5,100,30);

        button.addActionListener(this);

        frame.add(newTaskNameField);
        frame.add(button);
        
        frame.setSize(380,600);
        frame.setLayout(null);
        frame.setVisible(true); 
    }

    public static void main(String[] args) {
        new runApp();
    }

    public void actionPerformed(ActionEvent e) {

    }

    private void createNewTask(String name) {

    }

    public class Task {
        Task subTasks[];
        boolean done = false;

        private void check() {
            done = true;
        }

        private boolean done() {
            return done;
        }
    }
}
