package com.example;

import java.util.Scanner;

public class Matricula {
    // atributos
    private static String estudiante;
    private static int estrato;
    private static double cargBaseMatricula;
    private static double CargSegMedico;
    private static double cargAlimentacion;
    private static double cargCursosElectivos;
    private static double electivasTomadas;
    private static double costoGrado;
    private static double totalMatricula;
    private static int grado;
    Scanner sc = new Scanner(System.in);

    // constructor por defecto
    public Matricula() {
    }

    // constructor por parametros
    public Matricula(String estudiante, int estrato, double cargBaseMatricula, double CargSegMedico,
            double cargAlimentacion, double cargCursosElectivos, double electivasTomadas, double costoGrado,
            double totalMatricula, int grado) {
        this.estudiante = estudiante;
        this.estrato = estrato;
        this.cargBaseMatricula = cargBaseMatricula;
        this.CargSegMedico = CargSegMedico;
        this.cargAlimentacion = cargAlimentacion;
        this.cargCursosElectivos = cargCursosElectivos;
        this.electivasTomadas = electivasTomadas;
        this.costoGrado = costoGrado;
        this.totalMatricula = totalMatricula;
        this.grado = grado;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido");

        Matricula matricula = new Matricula(); // instancia
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        matricula.estudiante = sc.nextLine();
        System.out.println("Ingrese el estrato socioeconomico del estudiante");
        matricula.estrato = sc.nextInt();
        System.out.println("Ingrese el numero de electicas de este semestre del estudiante");
        matricula.electivasTomadas = sc.nextDouble();
        matricula.chequeoDeEstrato(matricula.estrato);
        matricula.calculoMatricula(matricula.estudiante, matricula.estrato, matricula.electivasTomadas);
    }

    // metodo para checar estrato
    public void chequeoDeEstrato(int estrato) {
        if (estrato > 6 || estrato < 1) {
            System.out.println("No ingreso un estrato válido, recuerde que debe ser del 1 al 6");
            this.estrato = sc.nextInt();
        }
    }

    // metodo para determinar la matricula
    public void calculoMatricula(String estudiante, int estrato, double electivasTomadas) {
        if (estrato == 1) {
            this.cargBaseMatricula = 50000;
            this.cargAlimentacion = 50000;
            this.CargSegMedico = 10000;
            this.cargCursosElectivos = 20000;
            this.totalMatricula = cargBaseMatricula + cargAlimentacion + CargSegMedico
                    + (cargCursosElectivos * electivasTomadas);
            this.costoGrado = totalMatricula + 400000 - (electivasTomadas * cargCursosElectivos);
        } else {
            if (estrato == 2 || estrato == 3) {
                this.cargBaseMatricula = 60000;
                this.cargAlimentacion = 70000;
                this.CargSegMedico = 15000;
                this.cargCursosElectivos = 40000;
                this.totalMatricula = cargBaseMatricula + cargAlimentacion + CargSegMedico
                        + (cargCursosElectivos * electivasTomadas);
                this.costoGrado = totalMatricula + 600000 - (electivasTomadas * cargCursosElectivos);
            } else {
                if (estrato == 4 || estrato == 5) {
                    this.cargBaseMatricula = 100000;
                    this.cargAlimentacion = 120000;
                    this.CargSegMedico = 20000;
                    this.cargCursosElectivos = 60000;
                    this.totalMatricula = cargBaseMatricula + cargAlimentacion + CargSegMedico
                            + (cargCursosElectivos * electivasTomadas);
                    this.costoGrado = totalMatricula + 800000 - (electivasTomadas * cargCursosElectivos);
                } else {
                    if (estrato == 6) {
                        this.cargBaseMatricula = 150000;
                        this.cargAlimentacion = 200000;
                        this.CargSegMedico = 30000;
                        this.cargCursosElectivos = 80000;
                        this.totalMatricula = cargBaseMatricula + cargAlimentacion + CargSegMedico
                                + (cargCursosElectivos * electivasTomadas);
                        this.costoGrado = totalMatricula + 1000000 - (electivasTomadas * cargCursosElectivos);
                    }
                }
            }
        }
        System.out.println("El valor del semestre para " + this.estudiante + " es de: " + totalMatricula);
        System.out.println("¿Desea ver el costo de grado para :" + this.estudiante + "? (Yes = 1 / No = 0)");
        int verTotalGrado = sc.nextInt();

        switch (verTotalGrado) {
            case 1:
                System.out.println("El valor de grado de " + this.estudiante + " es de: " + this.costoGrado);
            case 0:
                System.out.println("Gracias por utilizar nuestro servicio");
        }

    }
}
