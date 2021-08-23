package com.example;

import java.util.ArrayList;

/**
 * Dado un array de números de 5 posiciones con los siguientes valores {1,2,3,4,5},
 * guardar los valores de este array en otro array distinto, pero con los valores
 * invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
 */
public class Conversion {
    public static void main(String[] args) {
        ArrayList<Integer> numberIntegers = new ArrayList<Integer>(5);
        ArrayList<Integer> integerNumbers = new ArrayList<Integer>(5);

        for (int i = 1; i <= 5; i++) {
            numberIntegers.add(i);
        }
        
        for (int j = numberIntegers.size() - 1; j >= 0; j--) {
            integerNumbers.add(numberIntegers.get(j));
        }

        System.out.println(numberIntegers);
        System.out.println(integerNumbers);
    }
}
