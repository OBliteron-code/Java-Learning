package com.example;

import java.awt.*;
import javax.swing.*;

class Frame extends JFrame {
 
    // frame
    static JFrame f;
 
    // label to display text
    static JLabel l;
    static JLabel l2;
 
    // default constructor
    Frame() {
        
    }
 
    // main class
    public static void main(String[] args)
    {
        f = new JFrame("App");
        JPanel p = new JPanel(new GridLayout(0, 1));
 
        
        l = new JLabel("Facebook", JLabel.LEFT);
        l.setPreferredSize(new Dimension(220, 100));

        l2 = new JLabel("Version 0.1");
        l2.setPreferredSize(new Dimension(220, 100));
    
        p.add(l);
        p.add(l2);
 
        f.add(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 300);
        f.setLocationRelativeTo( null );
        f.setResizable(false);
        f.setVisible(true);
    }
}