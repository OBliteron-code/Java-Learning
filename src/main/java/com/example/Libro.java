package com.example;

/**
 * Crea una clase llamada Libro que guarde la información de cada uno de los
 * libros de una biblioteca. La clase debe guardar el título del libro, autor,
 * número de ejemplares del libro y número de ejemplares prestados. La clase
 * contendrá los siguientes métodos: Constructor por defecto. Constructor con
 * parámetros. Métodos Setters/getters Método préstamo que incremente el
 * atributo correspondiente cada vez que se realice un préstamo del libro. No se
 * podrán prestar libros de los que no queden ejemplares disponibles para
 * prestar. Devuelve true si se ha podido realizar la operación y false en caso
 * contrario.
 * 
 * Método devolución que decremente el atributo correspondiente cuando se
 * produzca la devolución de un libro. No se podrán devolver libros que no se
 * hayan prestado. Devuelve true si se ha podido realizar la operación y false
 * en caso contrario. Método toString para mostrar los datos de los libros. Este
 * método se heredada de Object y lo debemos modificar (override) para adaptarlo
 * a la clase Libro. Escribe un programa para probar el funcionamiento de la
 * clase Libro.
 */

public class Libro {
    private String autor;
    private String titulo;
    private int numEjemplares;
    private int numPrestados;

    public Libro() {

    }

    public Libro(String autor, String titulo, int numEjemplares, int numPrestados) {
        this.autor = autor;
        this.titulo = titulo;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getNumEjemplares() {
        return this.numEjemplares;
    }

    public int getNumPrestados() {
        return this.numPrestados;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Varios Autores", "La Biblia", 50, 10);
        Libro libro2 = new Libro("J.R.R. Tolkien", "El Señor de los Anillos", 130, 130);
        Libro libro3 = new Libro("Dan Brown", "El Código da Vinci", 30, 0);
        Libro libro4 = new Libro("Anna Frank", "El diario de Ana Frank", 300, 10);

        // Pruebas
        libro1.prestamo(40);
        libro2.prestamo(10);
        libro3.devolucion(10);
        libro4.devolucion(5);

        System.out.println(libro1.toString() + "\n");
        System.out.println(libro2.toString());
    }

    public boolean prestamo(int numPrestados) {
        if (numEjemplares > 0 && numPrestados <= (numEjemplares - this.numPrestados)) {
            this.numPrestados = this.numPrestados + numPrestados;
            this.numEjemplares = this.numEjemplares - this.numPrestados;
            System.out.println("La cantidad de ejemplares prestados actual es: " + this.numEjemplares);
            return true;
        } else {
            System.out.println("No es posible prestar ejemplares en el momento.");
            return false;
        }
    }

    public boolean devolucion(int numdevueltos) {
        if (numPrestados > 0 && numdevueltos <= numPrestados) {
            this.numEjemplares = this.numEjemplares + numdevueltos;
            this.numPrestados = this.numPrestados - numdevueltos;
            System.out.println("La cantidad de ejemplares prestados actual es: " + this.numEjemplares);
            return true;
        } else {
            System.out.println("No es posible regresar ejemplares en el momento.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Autor: " + this.autor + "\nTitulo: " + this.titulo + "\nExistencias disponibles: " + this.numEjemplares
                + "\nExistencias prestadas: " + this.numPrestados;
    }
}
