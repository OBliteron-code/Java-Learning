package com.example;
import java.util.Scanner;

public class CuentaBancaria {
    private String nombreCliente;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;
    Scanner sc = new Scanner(System.in);

    // Constructor por defecto.
    public CuentaBancaria() {

    }

    // Constructor por parametros.
    public CuentaBancaria(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Constructor copia.
    public CuentaBancaria(final CuentaBancaria c) {
        this.nombreCliente = c.nombreCliente;
        this.numCuenta = c.numCuenta;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo;
    }

    // Metodos get.
    String getNombreCliente() {
        return this.nombreCliente;
    }

    String getNumCuenta() {
        return this.numCuenta;
    }

    double getTipoInteres() {
        return this.tipoInteres;
    }

    double getSaldo() {
        return this.saldo;
    }

    // Metodos set.
    void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        System.out.println("Saludos nuevo usuario");

        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner sc = new Scanner(System.in); 

        System.out.print("Ingresa tu nombre por favor.\nnombre: ");
        cuenta.nombreCliente = sc.nextLine();

        System.out.print("Ingresa tu numero de cuenta por favor.\nnumero de cuenta: ");
        cuenta.numCuenta = sc.nextLine();

        System.out.print("Ingresa el saldo actual de tu cuenta por favor.\nsaldo: ");
        cuenta.saldo = sc.nextDouble();

        System.out.print("Ingresa el tipo de interes de tu cuenta por favor.\ntipo de interes: ");
        cuenta.tipoInteres = sc.nextDouble();
        cuenta.opcionUsuario(cuenta);

        sc.close();
    }

    // Metodo ingreso de saldo
    public boolean aumentarSaldo(double aumento) {
        System.out.println("Ingresa la cantidad de dinero a añadir a tu cuenta");
        aumento = sc.nextDouble();
        if (aumento >= 0) {
            this.saldo = this.saldo + aumento;
            System.out.println("Tu saldo actual es: $" + this.saldo);
            return true;
        } else {
            System.out.println("Cantidad incorrecta. Ingresa un valor positivo");
            return false;
        }
    }

    // Metodo disminuir saldo.
    public boolean disminuirSaldo(double disminucion) {
        System.out.println("Ingresa la cantidad de dinero a debitar de tu cuenta");
        disminucion = sc.nextDouble();
        if (disminucion <= this.saldo && disminucion > 0) {
            this.saldo = this.saldo - disminucion;
            System.out.println("Tu saldo actual es: $" + this.saldo);
            return true;
        } else {
            System.out.println("Cantidad incorrecta. Ingresa un valor positivo");
            return false;
        }
    }

    public void opcionUsuario(CuentaBancaria cuenta) {
        while (true) {
            System.out.println("¿Deseas realizar una operacion? S o N");
            String opcion1;
            opcion1 = sc.nextLine();
            if (opcion1.equals("S")) {
                System.out.print("Elige una operacion a realizar.\n1. Ingreso de Saldo\n2. Retirar saldo\n");
                int opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    System.out
                            .print("\n" + cuenta.nombreCliente + "\n" + cuenta.numCuenta + "\n" + cuenta.saldo + "\n");
                    cuenta.aumentarSaldo(cuenta.saldo);
                } else if (opcion2 == 2) {
                    System.out.print(cuenta.nombreCliente + "\n" + cuenta.numCuenta + "\n" + cuenta.saldo + "\n");
                    cuenta.disminuirSaldo(cuenta.saldo);
                }
            } else if (opcion1.equals("N")) {
                System.out.println("Adios!");
                break;
            }
        }
    }
}
