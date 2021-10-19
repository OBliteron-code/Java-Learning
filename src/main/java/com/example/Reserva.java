package com.example;

import javax.swing.*;
import java.awt.event.*;

public class Reserva extends JPanel implements ActionListener {

    private static JButton buttonReserva;
    private static JLabel ruta;
    private static JLabel horarios;
    private static JLabel idVehiculo;
    private static JLabel placaVehiculo;
    private static JLabel tipoVehiculo;
    private static JLabel duracion;
    private static JLabel conductor;
    private static JLabel pax;
    private static JTextField fielPax;
    private static JRadioButton radioRuta1;
    private static JRadioButton radioRuta2;
    private static ButtonGroup grupoRuta;
    private static JRadioButton radioHorario1;
    private static JRadioButton radioHorario2;
    private static JRadioButton radioHorario3;
    private static ButtonGroup grupoHorarios;

    Reserva() {
        this.setLayout(null);

        JFrame frame = new JFrame();
        frame.setTitle("Reserva de Viajes");
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);

        ruta = new JLabel("Ruta");
        ruta.setBounds(10, 10, 80, 45);
        this.add(ruta);

        grupoRuta = new ButtonGroup();

        radioRuta1 = new JRadioButton("MED - BOG");
        radioRuta1.setBounds(10, 45, 100, 45);
        grupoRuta.add(radioRuta1);
        this.add(radioRuta1);

        radioRuta2 = new JRadioButton("BOG - MED");
        radioRuta2.setBounds(10, 90, 100, 45);
        grupoRuta.add(radioRuta2);
        this.add(radioRuta2);

        horarios = new JLabel("Horarios");
        horarios.setBounds(110, 10, 100, 45);
        this.add(horarios);

        grupoHorarios = new ButtonGroup();

        radioHorario1 = new JRadioButton("6AM");
        radioHorario1.setBounds(110, 45, 100, 45);
        grupoHorarios.add(radioHorario1);
        this.add(radioHorario1);

        radioHorario2 = new JRadioButton("9AM");
        radioHorario2.setBounds(110, 90, 100, 45);
        grupoHorarios.add(radioHorario2);
        this.add(radioHorario2);

        radioHorario3 = new JRadioButton("11AM");
        radioHorario3.setBounds(110, 135, 100, 45);
        grupoHorarios.add(radioHorario3);
        this.add(radioHorario3);

        JLabel pasajeros = new JLabel("#Pasajeros:");
        pasajeros.setBounds(110, 180, 100, 45);
        this.add(pasajeros);

        fielPax = new JTextField();
        fielPax.setBounds(110, 225, 50, 25);
        this.add(fielPax);

        idVehiculo = new JLabel("ID del vehiculo:");
        idVehiculo.setBounds(210, 10, 400, 45);
        this.add(idVehiculo);

        placaVehiculo = new JLabel("placa del vehiculo:");
        placaVehiculo.setBounds(210, 55, 400, 45);
        this.add(placaVehiculo);

        tipoVehiculo = new JLabel("Tipo de vehiculo:");
        tipoVehiculo.setBounds(210, 100, 400, 45);
        this.add(tipoVehiculo);

        duracion = new JLabel("Duración del viaje: 9h & 415km");
        duracion.setBounds(210, 145, 400, 45);
        this.add(duracion);

        conductor = new JLabel("Nombre del conductor:");
        conductor.setBounds(210, 190, 400, 45);
        this.add(conductor);

        pax = new JLabel("Para el viaje quedan disponibles x puestos");
        pax.setBounds(210, 235, 300, 45);
        this.add(pax);

        buttonReserva = new JButton("Reservar");
        buttonReserva.setBounds(480, 280, 100, 25);
        buttonReserva.addActionListener(this);
        this.add(buttonReserva);
    }

    public static void main(String[] args) {
        Reserva reserva = new Reserva();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        int numpax = Integer.parseInt(fielPax.getText());
        if (a.getSource() == buttonReserva) {
            if (radioRuta1.isSelected()) {
                if (radioHorario1.isSelected()) {
                    idVehiculo.setText("ID del vehiculo: CHEV001");
                    placaVehiculo.setText("placa del vehiculo: FGH356");
                    tipoVehiculo.setText("Tipo de vehiculo: Bus");
                    conductor.setText("Nombre del conductor: Roberto G. Bolaños");
                    pax.setText("Para el viaje quedan disponibles " + (40 - numpax) + " puestos");
                } else if (radioHorario2.isSelected()) {
                    idVehiculo.setText("ID del vehiculo: CHEV002");
                    placaVehiculo.setText("placa del vehiculo: JFK963");
                    tipoVehiculo.setText("Tipo de vehiculo: MicroBus");
                    conductor.setText("Nombre del conductor: Enrique Iglesias");
                    pax.setText("Para el viaje quedan disponibles " + (20 - numpax) + " puestos");
                } else if (radioHorario3.isSelected()) {
                    idVehiculo.setText("ID del vehiculo: CHEV003");
                    placaVehiculo.setText("placa del vehiculo: TNT666");
                    tipoVehiculo.setText("Tipo de vehiculo: Van");
                    conductor.setText("Nombre del conductor: Freddy Mercury");
                    pax.setText("Para el viaje quedan disponibles " + (10 - numpax) + " puestos");
                }
            } else if (radioRuta2.isSelected()) {
                if (radioHorario1.isSelected()) {
                    idVehiculo.setText("ID del vehiculo: CHEV004");
                    placaVehiculo.setText("placa del vehiculo: SOS123");
                    tipoVehiculo.setText("Tipo de vehiculo: Bus");
                    conductor.setText("Nombre del conductor: Peter Parker");
                    pax.setText("Para el viaje quedan disponibles " + (40 - numpax) + " puestos");
                } else if (radioHorario2.isSelected()) {
                    idVehiculo.setText("ID del vehiculo: CHEV005");
                    placaVehiculo.setText("placa del vehiculo: FUK789");
                    tipoVehiculo.setText("Tipo de vehiculo: MicroBus");
                    conductor.setText("Nombre del conductor: Mary J. Watson");
                    pax.setText("Para el viaje quedan disponibles " + (20 - numpax) + " puestos");
                } else if (radioHorario3.isSelected()) {
                    idVehiculo.setText("ID del vehiculo: CHEV006");
                    placaVehiculo.setText("placa del vehiculo: TNT666");
                    tipoVehiculo.setText("Tipo de vehiculo: Van");
                    conductor.setText("Nombre del conductor: Emilia Heart");
                    pax.setText("Para el viaje quedan disponibles " + (10 - numpax) + " puestos");
                }
            }
        }
    }
}
