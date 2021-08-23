package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
 * Puedes hacer con o sin métodos de String.
 */
public class ArrayFrase {
    public static void main(String[] args) {
        List<Character> stringArray = new ArrayList<>();
        String frase;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digita una frase por teclado:");
        frase = sc.nextLine();
        sc.close();

        for (char ch : frase.toCharArray()) {
            stringArray.add(ch);
        }
        
        System.out.println("Tu Array de tu frase es:");
        for (int i = 0; i < stringArray.size(); i++) {
            System.out.print("[" + stringArray.get(i) + "]");            
        }
    }
}
