package com.inicio.tren;

public class Inicio {
    public static void main(String[] args) {
        Tren tren = new Tren(1);
        System.out.println(tren);
        System.out.println(tren.calcularOcupacion());
    }
}
