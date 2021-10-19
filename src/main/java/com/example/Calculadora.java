package com.example;

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Calculadora extends JPanel implements ActionListener{

    private static JButton buttonPlus;
    private static JButton buttonMinus;
    private static JButton buttonTimes;
    private static JButton buttonDivide;
    private static JButton buttonClose;
    private static JTextField fieldNum1;
    private static JTextField fieldNum2;
    private static JLabel num1;
    private static JLabel num2;
    private static JLabel result;
    private static DecimalFormat df = new DecimalFormat("0.00");

    Calculadora() {
        this.setLayout(null);
        
        JFrame frame = new JFrame();
        frame.setTitle("Calculadora");
        frame.setSize(600, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);

        fieldNum1 = new JTextField();
        fieldNum1.setBounds(100, 20, 165, 25);
        this.add(fieldNum1);

        fieldNum2 = new JTextField();
        fieldNum2.setBounds(100, 60, 165, 25);
        this.add(fieldNum2);
        
        num1 = new JLabel("Numero 1");
        num1.setBounds(10, 10, 80, 45);
        this.add(num1);

        num2 = new JLabel("Numero 2");
        num2.setBounds(10, 50, 80, 45);
        this.add(num2);

        result = new JLabel("Resultado: ");
        result.setBounds(300, 35, 120, 35);
        this.add(result);

        buttonPlus = new JButton("Suma");
        buttonPlus.setBounds(10, 120, 80, 25);
        buttonPlus.addActionListener(this);
        this.add(buttonPlus);

        buttonMinus = new JButton("Resta");
        buttonMinus.setBounds(90, 120, 80, 25);
        buttonMinus.addActionListener(this);
        this.add(buttonMinus);

        buttonTimes = new JButton("Multiplicación");
        buttonTimes.setBounds(170, 120, 150, 25);
        buttonTimes.addActionListener(this);
        this.add(buttonTimes);

        buttonDivide = new JButton("División");
        buttonDivide.setBounds(320, 120, 100, 25);
        buttonDivide.addActionListener(this);
        this.add(buttonDivide);

        buttonClose = new JButton("Cerrar");
        buttonClose.setBounds(510, 120, 80, 25);
        buttonClose.addActionListener(this);
        this.add(buttonClose);

    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }
    
    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == buttonClose) {
            System.exit(0);
        }

        double num1 = Double.parseDouble(fieldNum1.getText());
        double num2 = Double.parseDouble(fieldNum2.getText());
        if (a.getSource() == buttonPlus) {
            result.setText("Resultado: " + String.valueOf(df.format(num1+num2)));
        } else if (a.getSource() == buttonMinus) {
            result.setText("Resultado: " + String.valueOf(df.format(num1-num2)));
        } else if (a.getSource() == buttonTimes) {
            result.setText("Resultado: " + String.valueOf(df.format(num1*num2)));
        } else if (a.getSource() == buttonDivide) {
            result.setText("Resultado: " + String.valueOf(df.format(num1/num2)));
        }
    }
}

