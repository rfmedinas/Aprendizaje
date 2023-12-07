package com.inicio.tren;

import java.util.ArrayList;
import java.util.Arrays;

public class Tren {
    private int id;
    private ArrayList<Silla> sillas = new ArrayList<Silla>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
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
            if (silla.isOcupada()) {
                numOcupadas += 1;
            }
        }
        return (double) numOcupadas / sillas.size();
    }

    public Reserva crearReserva1(Pasajero pasajero, ClaseSilla claseSilla , PosicionSilla posicionSilla) throws Exception {
        for (Reserva reserva : reservas) {
            if (reserva.getPasajero() != null) {
                if (reserva.getPasajero().getId() == pasajero.getId()) {
                    throw new Exception("El pasajero ya tiene una reserva");
                }
            }
        }
        for (Silla sillaTren : sillas) {
            if (sillaTren.getClaseSilla().equals(claseSilla)
                    && sillaTren.getPosicionSilla().equals(posicionSilla)
                    && !sillaTren.isOcupada()) {
                Reserva reserva = new Reserva( pasajero, sillaTren);
                sillaTren.setOcupada(true);
                reservas.add(reserva);
                return reserva;
            }
        }
        throw new Exception("No existen sillas disponibles");
    }

    public void eliminarReserva(Pasajero pasajero) throws Exception {
        for (Reserva reserva : reservas) {
            if (reserva.getPasajero() != null) {
                if (reserva.getPasajero().getId() == pasajero.getId()) {
                    reserva.getSilla().setOcupada(false);
                    reservas.remove(reserva);
                    return;
                }
            }
        }
        throw new Exception("El pasajero no tiene una reserva");
    }

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return String.format("{\"Tren\": {\"id\":\"%d\",\"numEconomicas\":\"%d\",\"numEjecutivas\":\"%d\",\"numSillasFila\":\"%d\",\"ocupacion\":\"%f%%\",\"Sillas\":%s,\"Reservas\":%s}}", id, numEconomicas, numEjecutivas, numSillasFila, calcularOcupacion() * 100.0, sillas, reservas);
    }

    public Reserva crearReserva(Pasajero pasajero, ClaseSilla claseSilla, PosicionSilla posicionSilla) throws Exception {
        reservas.stream()
                .filter(reserva -> reserva.getPasajero() != null)
                .filter(reserva -> reserva.getPasajero().getId() == pasajero.getId())
                .findFirst()
                .ifPresent(reserva -> {
                    try {
                        throw new Exception("El pasajero ya tiene una reserva");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        return sillas.stream()
                .filter(sillaTren -> sillaTren.getClaseSilla().equals(claseSilla))
                .filter(sillaTren -> sillaTren.getPosicionSilla().equals(posicionSilla))
                .filter(sillaTren -> !sillaTren.isOcupada())
                .findFirst()
                .map(sillaTren -> {
                    Reserva reserva = new Reserva(pasajero, sillaTren);
                    sillaTren.setOcupada(true);
                    reservas.add(reserva);
                    return reserva;
                })
                .orElseThrow(() -> new Exception("No existen sillas disponibles"));
    }

}
