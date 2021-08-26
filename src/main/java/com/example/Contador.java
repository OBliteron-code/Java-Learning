package com.example;

import java.util.Scanner;

/**
 * Crea  una  clase  Contador  con  los  métodos  para  incrementar  y  decrementar  el contador. 
 * La  clase  contendrá  un  constructor  por  defecto,  un  constructor  con parámetros, 
 * un constructor copia y los métodos getters y setters.
 */
public class Contador {
    private int cont;
    
    public Contador() {

    }
    
    public Contador(int cont) {
        this.cont = cont;
    }

    public Contador(final Contador c) {
        this.cont = c.cont;

    }

    public int getCont() {
        return this.cont;
    }

    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }      
    }

    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.println("Ingrese un valor");
        Scanner sc = new Scanner(System.in);

        contador.setCont(sc.nextInt());
        contador.incrementar(1);

        System.out.println(contador.cont);
        sc.close();        
    }
    
    void incrementar(int cont) {
        this.cont =+ cont;
    }

    void decrementar(int cont) {
        this.cont--;
        if (this.cont < 0) {
            this.cont = 0;            
        }
    }
}
