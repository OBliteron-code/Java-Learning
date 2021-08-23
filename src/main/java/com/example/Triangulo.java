package com.example;

import java.util.Scanner;

/**
 * Programa que lea la longitud de los catetos de un triángulo rectángulo y 
 * calcule la longitud de la hipotenusa según el teorema de Pitágoras.
 */
public class Triangulo 
{
    public static void main( String[] args )
    {
        double Cateto1;
        double Cateto2;
        double Hipotenusa;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de uno de los catetos: ");
        Cateto1 = sc.nextInt();

        System.out.println("Ingrese el valor del otro cateto: ");
        Cateto2 = sc.nextInt();

        sc.close();

        Hipotenusa = Math.pow(Cateto1, 2) + Math.pow(Cateto2, 2);
        Hipotenusa = Math.sqrt(Hipotenusa);
        
        System.out.println("El valor de la hipotenusa del triangulo es: " + Hipotenusa);
    }
}