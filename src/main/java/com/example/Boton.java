package com.example;

import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener {
    JButton boton1;
    JButton boton2;
    JButton boton3;

    private Boton() {
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton1.setBounds(300, 200, 100, 40);
        boton2.setBounds(200, 200, 100, 40);
        boton3.setBounds(100, 200, 100, 40);

        this.add(boton1);
        this.add(boton2);
        this.add(boton3);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Boton ventana = new Boton();
        ventana.pack();
        ventana.setBounds(0, 0, 350, 350);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            setTitle("boton1");
        } else if (e.getSource() == boton2) {
            setTitle("boton2");
        } else if (e.getSource() == boton3) {
            setTitle("boton3");
        }
    }
    
}
