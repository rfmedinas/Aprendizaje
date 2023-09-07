package com.inicio.aprendizaje.tren;

public class Inicio {
    public static void main(String[] args) {
        Tren tren = new Tren(1);
        System.out.println(tren);
        Pasajero pasajero = new Pasajero(123456789, "Juan");

        System.out.println(tren.calcularOcupacion());
    }
}
