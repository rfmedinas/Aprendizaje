package com.inicio.aprendizaje.tren;

public class Reserva {
    private int id;
    private Pasajero pasajero;
    private Silla silla;
    private boolean activa;

    public Reserva(int id, Pasajero pasajero, Silla silla) {
        this.id = id;
        this.pasajero = pasajero;
        this.silla = silla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
