package com.inicio.tren;

import java.util.ArrayList;

public class Tren {
    private int id;
    private ArrayList<Silla> sillas = new ArrayList<Silla>();
    private int numEconomicas = 80;
    private int numEjecutivas = 20;
    private int numSillasFila = 4;

    public Tren(int id) {
        this.id = id;
        crearSilla(ClaseSilla.EJECUTIVA);
        crearSilla(ClaseSilla.ECONOMICA);

    }

    private void crearSilla(ClaseSilla claseSilla) {
        int numSillas = 0;
        if (claseSilla.equals(ClaseSilla.ECONOMICA)) {
            numSillas = numEconomicas;
        } else {
            numSillas = numEjecutivas;
        }
        for (int i = 0; i < numSillas; i++) {
            int fila = (i / numSillasFila) + 1;
            int posicion = i % numSillasFila;
            String posicionFila = fila + "-" + String.valueOf((char) (posicion + 65));
            PosicionSilla posicionSilla = i % 2 == 0 ? PosicionSilla.VENTANA : PosicionSilla.PASILLO;
            Silla silla = new Silla(posicionFila, claseSilla, posicionSilla, fila);
            sillas.add(silla);
        }
    }

    public double calcularOcupacion() {
        double numOcupadas = 0.0;
        for (Silla silla : sillas) {
            if (silla.ocupada()) {
                numOcupadas += 1;
            }
        }
        return (double) numOcupadas / sillas.size();
    }

    @Override
    public String toString() {
        return String.format("{\"Tren\": {\"id\":\"%d\",\"numEconomicas\":\"%d\",\"numEjecutivas\":\"%d\",\"numSillasFila\":\"%d\",\"ocupacion\":\"%f\",\"Sillas\":%s}}", id, numEconomicas, numEjecutivas, numSillasFila, calcularOcupacion(), sillas);
    }
}
