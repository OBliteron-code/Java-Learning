package com.example;

//Primary Class
public class Empleado {
    private String nombre;

    public Empleado() {

    }
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Empleado: " + this.nombre;
    }
}