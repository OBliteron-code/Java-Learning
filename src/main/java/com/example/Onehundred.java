package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea un array de números de 100 posiciones, que contendrá los números del 1
 * al 100. Obtén la suma de todos ellos y la media (promedio).
 */
public class Onehundred {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        float promedio;
        List<Integer> numberIntegers = new ArrayList<Integer>(100);

        while (i <= 100) {
            numberIntegers.add(i);
            i++;
        }

        for (int j = 0; j < numberIntegers.size(); j++) {
            sum = sum + numberIntegers.get(j);
        }

        promedio = (float) sum / numberIntegers.size();

        System.out.println("La suma sera igual a: " + sum);
        System.out.println("El promedio sera igual a: " + promedio);
    }
}
