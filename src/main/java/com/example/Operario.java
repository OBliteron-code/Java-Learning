package com.example;

//Inherits Empleado class
public class Operario extends Empleado {
    public static void main(String[] args) {
        Operario op = new Operario();
        op.setNombre("Carlos");
        System.out.println(op.toString());
    }
}
