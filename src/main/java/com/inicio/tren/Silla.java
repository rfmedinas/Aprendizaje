package com.inicio.tren;

public class Silla {

    private String id;
    private ClaseSilla claseSilla;
    private PosicionSilla posicionSilla;
    private Pasajero pasajero;
    private int fila;

    public Silla(String id, ClaseSilla claseSilla, PosicionSilla posicionSilla, int fila) {
        this.id = id;
        this.claseSilla = claseSilla;
        this.posicionSilla = posicionSilla;
        this.fila = fila;
        Pasajero nombrePasajero = new Pasajero(1, "raúl");
        this.pasajero = nombrePasajero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClaseSilla getClaseSilla() {
        return claseSilla;
    }

    public void setClaseSilla(ClaseSilla claseSilla) {
        this.claseSilla = claseSilla;
    }

    public PosicionSilla getPosicionSilla() {
        return posicionSilla;
    }

    public void setPosicionSilla(PosicionSilla posicionSilla) {
        this.posicionSilla = posicionSilla;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"" +
                ", \"claseSilla\":\"" + claseSilla + "\"" +
                ", \"posicionSilla\":\"" + posicionSilla + "\"" +
                ", \"pasajero\":" + pasajero + "" +
                ", \"fila\":\"" + fila + "\"" +
                '}';
    }

    public boolean ocupada() {
        return pasajero != null;
    }
}
