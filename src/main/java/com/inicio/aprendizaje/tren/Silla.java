package com.inicio.aprendizaje.tren;

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
    }

    public boolean isOcupada(){
        return pasajero != null;
    }
    public String getId() {
        return id;
    }

    public ClaseSilla getClaseSilla() {
        return claseSilla;
    }

    public PosicionSilla getPosicionSilla() {
        return posicionSilla;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public int getFila() {
        return fila;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"" +
                ", \"claseSilla\":\"" + claseSilla + "\"" +
                ", \"posicionSilla\":\"" + posicionSilla + "\"" +
                ", \"pasajero\":\"" + pasajero + "\"" +
                ", \"fila\":\"" + fila + "\"" +
                '}';
    }

}
