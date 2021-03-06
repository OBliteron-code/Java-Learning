package com.example;

import static java.lang.Double.NaN;

import java.util.Scanner;
/*Crea  una  clase  Complejo  con  métodos  para  sumar,  restar,  multiplicar  y  dividir números complejos. */
public class Complejo{

    public static void main(String[] args) {
        char operacion;
        double par_real1, par_imag1, par_real2, par_imag2;

        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese operación (+,-,*,/): ");
        operacion = reader.next().charAt(0);
        System.out.printf("Ingrese parte real del número 1: ");
        par_real1 = reader.nextDouble();
        System.out.printf("Ingrese parte imaginaria del número 1: ");
        par_imag1 = reader.nextDouble();
        System.out.printf("Ingrese parte real del número 2: ");
        par_real2 = reader.nextDouble();
        System.out.printf("Ingrese parte imaginaria del número 2: ");
        par_imag2 = reader.nextDouble();

        boolean division_por_cero = false;
        boolean operacion_valida = true;
        double par_real = NaN, par_imag = NaN, denominador;
        switch (operacion) {
            case '+':
                par_real = par_real1 + par_real2;
                par_imag = par_imag1 + par_imag2;
                break;
            case '-':
                par_real = par_real1 - par_real2;
                par_imag = par_imag1 - par_imag2;
                break;
            case '*':
                par_real = par_real1 * par_real2 - par_imag1 * par_imag2;
                par_imag = par_real1 * par_imag2 + par_imag1 * par_real2;
                break;
            case '/':
                denominador = Math.pow(par_real2, 2) + Math.pow(par_imag2, 2);
                if (denominador == 0) {
                    division_por_cero = true;
                } else {
                    par_real = par_real1 * par_real2 + par_imag1 * par_imag2;
                    par_real /= denominador;
                    par_imag = par_imag1 * par_real2 - par_real1 * par_imag2;
                    par_imag /= denominador;
                }
                break;
            default:
                operacion_valida = false;
                System.out.printf("La operación no es válida%n");
        }
        if (operacion_valida) {
            if (division_por_cero) {
                System.out.printf("No se puede dividir entre cero%n");
            } else {
                System.out.printf("El resultado es: %.3f + %.3fi%n", par_real, par_imag);
            }
        }
    }
    // Creditos Andrés Melgar. http://iterando.online/
}
