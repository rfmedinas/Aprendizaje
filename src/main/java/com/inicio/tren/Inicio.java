package com.inicio.tren;

public class Inicio {
    public static void main(String[] args) {
        Tren tren = new Tren(1);
        System.out.println(tren);
        System.out.println(tren.calcularOcupacion());
        Pasajero raul = new Pasajero(1, "Raúl Medina");
        try {
            Reserva reserva = tren.crearReserva(raul, ClaseSilla.EJECUTIVA, PosicionSilla.PASILLO);
            System.out.printf("La reserva Asignada es :%s%n", reserva);
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);

        }
        Pasajero jose = new Pasajero(2, "Jose Gomez");
        try {
            Reserva reserva = tren.crearReserva(jose, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La reserva Asignada es :%s%n", reserva);
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);

        }
        System.out.println(tren.calcularOcupacion());
        try {
            tren.eliminarReserva(raul);
            System.out.println(" el Listado de reservas es" + tren.getReservas());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(tren.calcularOcupacion());
        Pasajero angela = new Pasajero(3, "Angela Pedraza");
        try {
            Reserva reserva = tren.crearReserva(angela, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La Reserva Asignada es :%s%n", reserva);
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);

        }
        System.out.println(tren);
        try {
            Reserva reservaEncontrada = tren.buscarPasajero(2);
            System.out.println(reservaEncontrada);
            reservaEncontrada = tren.consultarReserva(reservaEncontrada.getId().toString());
            System.out.println(reservaEncontrada);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
