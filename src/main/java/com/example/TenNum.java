package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Pide por teclado dos números y genera 10 números aleatorios entre esos
 * números. Usa el método Math.random para generar un número entero aleatorio
 * (recuerda el casting de double a int).
 */
public class TenNum {
    public static void main(String[] args) {

        int num1;
        int num2;
        int counter = 0;
        List<Integer> numberIntegers = new ArrayList<Integer>(); // Inicializar lista de enteros.

        JOptionPane.showMessageDialog(null, "Ingresa 2 numeros para obtener 10 numero aleatorios dentro de estos");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));

        if (num1 > num2) {
            while (counter < 10) {
                int random = (int) ((Math.random() * (num1 - num2)) + num2); // Generar numeros random entre los limites
                                                                             // (exclusivo para num1).
                numberIntegers.add(random); // Añadir el valor al final de la lista.
                counter++;
            }
            JOptionPane.showMessageDialog(null, "Los numeros son: " + numberIntegers);
        } else {
            while (counter < 10) {
                int random = (int) ((Math.random() * (num2 - num1)) + num1); // Generar numeros random entre los limites
                                                                             // (exclusivo para num2).
                numberIntegers.add(random); // Añadir el valor al final de la lista.
                counter++;
            }
            JOptionPane.showMessageDialog(null, "Los numeros son: " + numberIntegers);
        }
    }
}