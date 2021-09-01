package com.example;

import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JButton button;
    private static JTextField textField;
    private static JLabel passwordLabel;  
    private static JPasswordField passwordField; 
    private static JLabel success;
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JFrame frame = new JFrame();
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 45);
        panel.add(userLabel);

        textField = new JTextField(20);
        textField.setBounds(100, 20, 165, 25);
        panel.add(textField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 60, 80, 45);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 60, 165, 25);
        panel.add(passwordField);

        button = new JButton("Login");
        button.setBounds(10, 100, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 130, 300, 25);
        panel.add(success);
                    
        

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String user = textField.getText();
        String password = passwordField.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Santiago") && password.equals("1035")) {
            success.setText("Login Successful!!!");   
        } else {
            success.setText("Login Unsuccessful");
        }
    }
}
