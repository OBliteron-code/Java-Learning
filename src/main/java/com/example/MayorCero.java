package com.example;

import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este número es mayor o igual que
 * cero, si no lo es lo volverá a pedir (do while), después muestra ese número
 * por consola.
 */
public class MayorCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingrese número mayor que cero: ");
            n = sc.nextInt();

        } while (n < 0);
        System.out.println("el número " + n + " es correcto! ");
        sc.close();
    }
}
