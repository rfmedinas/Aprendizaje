package com.inicio.tren;

public class Silla {

    private String id;
    private ClaseSilla claseSilla;
    private PosicionSilla posicionSilla;
    private int fila;
    private boolean ocupada = false;

    public Silla(String id, ClaseSilla claseSilla, PosicionSilla posicionSilla, int fila) {
        this.id = id;
        this.claseSilla = claseSilla;
        this.posicionSilla = posicionSilla;
        this.fila = fila;
        //Pasajero nombrePasajero = new Pasajero(1, "raúl");
        //this.pasajero = nombrePasajero;
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

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"" +
                ", \"claseSilla\":\"" + claseSilla + "\"" +
                ", \"posicionSilla\":\"" + posicionSilla + "\"" +
                ", \"ocupada\":\"" + ocupada + "\"" +
                ", \"fila\":\"" + fila + "\"" +
                '}';
    }

}
