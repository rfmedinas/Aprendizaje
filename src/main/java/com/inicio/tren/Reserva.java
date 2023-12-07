package com.inicio.tren;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Reserva {

    private int id;

    private static AtomicInteger idGenerado = new AtomicInteger(0);

    public int getNextId() {
        return idGenerado.incrementAndGet();
    }

    private Pasajero pasajero;
    private Silla silla;

    public Reserva( Pasajero pasajero, Silla silla) {
        this.pasajero = pasajero;
        this.silla = silla;
        this.id = getNextId();
    }

    public int getId() {
        return id;
    }


    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"" +
                ", \"pasajero\":" + pasajero +
                ", \"silla\":" + silla +
                '}';
    }
}
