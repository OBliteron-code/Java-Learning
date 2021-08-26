package com.example;

//Inherits Operario class
public class Tecnico extends Operario{
    public static void main(String[] args) {
        Tecnico tec = new Tecnico();
        tec.setNombre("Carlos");
        System.out.println(tec.toString());
    }
}
