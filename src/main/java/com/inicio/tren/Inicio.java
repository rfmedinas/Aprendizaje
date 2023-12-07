package com.inicio.tren;

public class Inicio {
    public static void main(String[] args)  {
        Tren tren = new Tren(1);
        System.out.println(tren);

        Pasajero raul = new Pasajero(1, "raúl");
        Pasajero juan = new Pasajero(2, "juan");
        Pasajero pedro = new Pasajero(3, "pedro");
        Pasajero ana = new Pasajero(4, "ana");
        try {
            Reserva reserva = tren.crearReserva(raul, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La reservada es: %s%n", reserva);
            reserva = tren.crearReserva(pedro, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La reservada es: %s%n", reserva);
            tren.eliminarReserva(raul);
            System.out.println("TREN "  + tren.getReservas());
            reserva = tren.crearReserva(juan, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La reservada es: %s%n", reserva);
            tren.eliminarReserva(pedro);
            reserva = tren.crearReserva(pedro, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La reservada es: %s%n", reserva);
            reserva = tren.crearReserva(ana, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La reservada es: %s%n", reserva);
            System.out.println(tren.getReservas());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        /*
        Pasajero juan = new Pasajero(2, "juan");
        tren.crearReserva(juan, ClaseSilla.ECONOMICA, PosicionSilla.VENTANA);

        Pasajero pedro = new Pasajero(3, "pedro");
        tren.crearReserva(pedro, ClaseSilla.ECONOMICA, PosicionSilla.VENTANA);
        System.out.println(tren);

         */
    }
}
