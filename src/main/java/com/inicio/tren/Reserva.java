package com.inicio.tren;

import java.util.UUID;

public class Reserva {
    private UUID id = UUID.randomUUID();
    private Pasajero pasajero;
    private Silla silla;

    public Reserva(Pasajero pasajero, Silla silla) {
        this.pasajero = pasajero;
        this.silla = silla;
    }

    public UUID getId() {
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
