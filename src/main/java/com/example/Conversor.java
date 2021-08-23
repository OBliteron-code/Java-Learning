package com.example;

import java.util.Scanner;

/**
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */
public class Conversor 
{
    public static void main( String[] args )
    {
        float Kmh;
        float ms;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de la velocidad en Km/h: ");
        Kmh = sc.nextInt();

        sc.close();

        ms = Kmh * 1000 / 3600 ;
        
        System.out.println("El valor de la velocidad en m/s es: " + ms +"m/s");
    }
}
