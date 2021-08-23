package com.example;

import java.util.ArrayList;

/**
 * Muestra los números primos entre 1 y 100 ya almacenarlos en un array.
 */
public class OnehundredPrimos {
    public static void main(String[] args) {
        int i = 1;
        ArrayList<Integer> numberIntegers = new ArrayList<Integer>(100);

        while (i <= 100) {
            if (isPrime(i) == true)
                numberIntegers.add(i);
            i++;
        }

        System.out.println("Array de numeros primos del 1 al 100:");
        for (int j = 0; j < numberIntegers.size(); j++) {
            System.out.print("[" + numberIntegers.get(j) + "]");
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
