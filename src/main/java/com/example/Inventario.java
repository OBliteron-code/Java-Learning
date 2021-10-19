/*
/ Una tienda de productos comestible necesita desarrollar un sistema que le permita conocer el inventario de productos que rotan en su negocio. 
/ Como requisitos, se tiene que se comercializan los productos en estas categorías: verduras, refrigerados y granos; 
/ las verduras deben de rotan más rápido, es por ello, si el producto no ha salido de la tienda en 4 días, debe de haber un descuento para que salga,
/ y para los productos refrigerados se debe aplicar la misma regla, pero para un periodo de 15 días. Asimismo, se debe guardar la
/ información de los ingresos y egresos del inventario, factura, fecha de venta y otros elementos que considere necesarios.
 */
package com.example;

import java.util.Scanner;

public class Inventario {

        private static int cantegresos;
        private static int cantgranos;
        private static int cantingresos;
        private static int cantrefrigerados;
        private static int cantverduras;
        private static double descuento;
        private static int diasenstock;
        private static String factura;
        private static String fechaventa;
        private static String nombretienda;
        private static String opcion1;
        private static String opcion2;
        private static String opcion3;
        Scanner sc = new Scanner(System.in);

        // constructor por defecto
        public Inventario() {
        }

        // constructor por parametros
        public Inventario(int cantegresos, int cantgranos, int cantingresos, int cantrefrigerados, int cantverduras,
                        double descuento, int diasenstock, String factura, String fechaventa, String nombretienda,
                        String opcion1, String opcion2, String opcion3) {
                this.cantegresos = cantegresos;
                this.cantgranos = cantgranos;
                this.cantingresos = cantingresos;
                this.cantrefrigerados = cantrefrigerados;
                this.cantverduras = cantverduras;
                this.descuento = descuento;
                this.diasenstock = diasenstock;
                this.factura = factura;
                this.fechaventa = fechaventa;
                this.nombretienda = nombretienda;
                this.opcion1 = opcion1;
                this.opcion2 = opcion2;
                this.opcion3 = opcion3;
        }

        public static void main(String[] args) {
                Inventario inventario = new Inventario();
                Scanner sc = new Scanner(System.in);
                System.out.println("BIENVENIDO A SU GESTOR DE INVENTARIO Y VENTAS");
                System.out.println("Ingrese el nombre de su tienda");
                inventario.nombretienda = sc.nextLine();
                System.out.println("A continuacion ingrese las exitencias en inventario de verduras (en cantidades)");
                inventario.cantverduras = sc.nextInt();
                System.out.println(
                                "A continuacion ingrese las exitencias en inventario de refrigerados (en cantidades)");
                inventario.cantrefrigerados = sc.nextInt();
                System.out.println("A continuacion ingrese las exitencias en inventario de granos (en cantidades)");
                inventario.cantgranos = sc.nextInt();
                System.out.println("Gracias por actualizar su inventario. ¿Desea realizar alguna operacion? S o N");
                inventario.opcion1 = sc.nextLine();
                inventario.gestionInventarioVentas(inventario.nombretienda, inventario.cantverduras,
                                inventario.cantrefrigerados, inventario.cantgranos, inventario.opcion1);
        }

        public void gestionInventarioVentas(String nombretienda, int cantverduras, int cantrefrigerados, int cantgranos,
                        String opcion1) {
                this.diasenstock = 1;
                this.descuento = 0;
                this.opcion2 = "";
                this.opcion3 = "";
                if (this.opcion1.equals("N")) {
                        System.out.println("Gracias por utliziar nuestro sericio. Así queda su inventario: "
                                        + this.nombretienda);
                        System.out.println("Cantidad de verduras = " + this.cantverduras + ".");
                        System.out.println("Cantidad de refrigerados = " + this.cantrefrigerados + ".");
                        System.out.println("Cantidad de granos = " + this.cantgranos + ".");
                        System.out.println("Días pasados = " + this.diasenstock + ".");
                        System.out.println("Fecha de la última de factura: " + this.fechaventa + ".");
                        System.out.println("La ultima factura: " + this.factura + ".");
                        System.out.println("El descuento aplicable de la última venta: " + this.descuento + ".");

                } else {
                        if (this.opcion1.equals("S")) {
                                System.out.println(
                                                "Desea seguir ingresando productos al inventario (opcion a), ingresar una venta (opcion b) o salir del sistema (opcion c)");
                                this.opcion2 = sc.nextLine();
                                if (this.opcion2.equals("a")) {
                                        System.out.println(
                                                        "¿Desea ingresar verduras (v), refrigerados (r) o granos (g)?");
                                        this.opcion3 = sc.nextLine();
                                        if (this.opcion3.equals("v")) {
                                                System.out.println("¿Cuantas verduras va a agregar?");
                                                cantingresos = sc.nextInt();
                                                this.cantverduras = cantingresos + this.cantverduras;
                                                this.diasenstock = this.diasenstock + 1;
                                        }
                                        if (this.opcion3.equals("g")) {
                                                System.out.println("¿Cuantos granos va a agregar?");
                                                cantingresos = sc.nextInt();
                                                this.cantgranos = cantingresos + this.cantgranos;
                                                this.diasenstock = this.diasenstock + 1;
                                        }
                                        if (this.opcion3.equals("r")) {
                                                System.out.println("¿Cuantos refrigerados va a agregar?");
                                                cantingresos = sc.nextInt();
                                                this.cantrefrigerados = cantingresos + this.cantrefrigerados;
                                                this.diasenstock = this.diasenstock + 1;
                                        }
                                } else {
                                        if (this.opcion2.equals("b")) {
                                                System.out.println("A continuación podra ingresar una venta");
                                                System.out.println(
                                                                "Identifique el producto que se vendió uno a uno según: verduras (v), refrigerados (r) o granos (g)");
                                                if (this.opcion3.equals("v")) {
                                                        System.out.println("¿Cuantos verduras se vendieron?");
                                                        cantegresos = sc.nextInt();
                                                        this.cantverduras = this.cantverduras - cantegresos;
                                                        System.out.println("Ingrese un número de factura");
                                                        this.factura = sc.nextLine();
                                                        System.out.println("Ingrese la fecha de la venta");
                                                        this.fechaventa = sc.nextLine();
                                                        this.diasenstock = this.diasenstock + 1;
                                                        if (this.diasenstock >= 4) {
                                                                this.descuento = 0.20;
                                                        }
                                                }
                                                if (this.opcion3.equals("g")) {
                                                        System.out.println("¿Cuantos granos se vendieron?");
                                                        cantegresos = sc.nextInt();
                                                        this.cantgranos = this.cantgranos - cantegresos;
                                                        System.out.println("Ingrese un número de factura");
                                                        this.factura = sc.nextLine();
                                                        System.out.println("Ingrese la fecha de la venta");
                                                        this.fechaventa = sc.nextLine();
                                                        this.diasenstock = this.diasenstock + 1;
                                                }
                                                if (this.opcion3.equals("r")) {
                                                        System.out.println("¿Cuantos refrigerados se vendieron?");
                                                        cantegresos = sc.nextInt();
                                                        this.cantrefrigerados = this.cantrefrigerados - cantegresos;
                                                        System.out.println("Ingrese un número de factura");
                                                        this.factura = sc.nextLine();
                                                        System.out.println("Ingrese la fecha de la venta");
                                                        this.fechaventa = sc.nextLine();
                                                        this.diasenstock = this.diasenstock + 1;
                                                        if (this.diasenstock >= 15) {
                                                                this.descuento = 0.20;
                                                        }
                                                }
                                        } else {
                                                if (this.opcion2.equals("c")) {
                                                        System.out.println(
                                                                        "Gracias por utliziar nuestro sericio. Así queda su inventario: "
                                                                                        + this.nombretienda);
                                                        System.out.println("Cantidad de verduras = " + this.cantverduras
                                                                        + ".");
                                                        System.out.println("Cantidad de refrigerados = "
                                                                        + this.cantrefrigerados + ".");
                                                        System.out.println("Cantidad de granos = " + this.cantgranos
                                                                        + ".");
                                                        System.out.println("Días pasados = " + this.diasenstock + ".");
                                                        System.out.println("Fecha de la última de factura: "
                                                                        + this.fechaventa + ".");
                                                        System.out.println("La ultima factura: " + this.factura + ".");
                                                        System.out.println("El descuento aplicable de la última venta: "
                                                                        + this.descuento + ".");

                                                }
                                        }
                                }
                        }
                }

        }
}
