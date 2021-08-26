package com.example;

//Inherits Operario class
public class Oficial extends Operario {
    public static void main(String[] args) {
        Oficial of = new Oficial();
        of.setNombre("Juan");
        System.out.println(of.toString());
    } 
}
