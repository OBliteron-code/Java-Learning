package com.example;

//Inherits Empleado class
public class Directivo extends Empleado{
    public static void main(String[] args) {
        Directivo dir = new Directivo();
        dir.setNombre("Pedro");
        System.out.println(dir.toString());
    }
}
