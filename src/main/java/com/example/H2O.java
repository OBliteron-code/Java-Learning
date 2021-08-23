package com.example;

import java.util.Scanner;

/**
 * Programa que lea la longitud de los catetos de un triángulo rectángulo y
 * calcule la longitud de la hipotenusa según el teorema de Pitágoras.
 */
public class H2O {
    public static void main(String[] args) {
        double DiametroVaso;
        double RadioVaso;
        double AlturaVaso;
        double VolVaso;
        double Pi = 3.14;
        double Lh2o;
        double CantVasos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantos litros de agua se toma al día: ");
        Lh2o = sc.nextInt();

        System.out.println("Ingrese el diametro en cm del vaso que usa: ");
        DiametroVaso = sc.nextInt();

        System.out.println("Ingrese la altura en cm del vaso que usa: ");
        AlturaVaso = sc.nextInt();

        sc.close();

        RadioVaso = DiametroVaso / 2;
        VolVaso = Pi * Math.pow(RadioVaso, 2) * AlturaVaso;
        VolVaso = VolVaso * 0.001;
        CantVasos = Lh2o / VolVaso;

        System.out.println("La cantidad de vasos que debe tomarse para tomar " + Lh2o + "L de agua son: " + CantVasos);
    }
}