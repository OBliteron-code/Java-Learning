package com.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea un array de 10 posiciones de números con valores pedidos por teclado.
 * Muestra por consola el índice y el valor al que corresponde. 
 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
 */
public class Array10Num {
    public static void main(String[] args) {
        ArrayList listOfArrays = new ArrayList();
        listOfArrays = filler();
        Scanner sc = new Scanner(System.in);

        System.out.println("Tu Array creado con sus indices correspondientes es:");
        for (int i = 0; i < listOfArrays.size(); i++) {
            System.out.println(listOfArrays.get(i) + " -> [" + (i + 1) + "]");
        }
        sc.close();    
    }

    public static ArrayList<Integer> filler() {
        int i = 0;
        int num;
        ArrayList<Integer> numberIntegers = new ArrayList<Integer>(10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 10 numeros para tu Array");
        while (i < 10) {      
            num = sc.nextInt();
            numberIntegers.add(num);
            i++;
        }
        sc.close();
        return numberIntegers;
    }
}
