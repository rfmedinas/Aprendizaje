package com.inicio.tren;

public class Inicio {
    public static void main(String[] args) {
        Tren tren = new Tren(1);
        System.out.println(tren);
        System.out.println(tren.calcularOcupacion());
        Pasajero raul = new Pasajero(1, "Raúl Medina");
        try {
            Silla silla = tren.crearReserva(raul, ClaseSilla.EJECUTIVA, PosicionSilla.PASILLO);
            System.out.printf("La Silla Asignada es :%s%n", silla);
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);

        }
        Pasajero jose = new Pasajero(2, "Jose Gomez");
        try {
            Silla silla = tren.crearReserva(jose, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La Silla Asignada es :%s%n", silla);
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);

        }
        System.out.println(tren.calcularOcupacion());
        try {
            Silla sillaLiberada = tren.eliminarReserva(raul);
            System.out.println("la Silla Liberada es" + sillaLiberada);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(tren.calcularOcupacion());
        Pasajero angela = new Pasajero(3, "Angela PEdraza");
        try {
            Silla silla = tren.crearReserva(angela, ClaseSilla.EJECUTIVA, PosicionSilla.VENTANA);
            System.out.printf("La Silla Asignada es :%s%n", silla);
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);

        }
    }

}
