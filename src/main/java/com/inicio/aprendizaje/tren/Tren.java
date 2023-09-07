package com.inicio.aprendizaje.tren;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Tren {
    private int id;
    private ArrayList<Silla> sillas = new ArrayList<>();
    public Tren(int id) {
        this.id = id;
        crearSilla(ClaseSilla.EJECUTIVA, 20, 4);
        crearSilla(ClaseSilla.ECONOMICA, 80, 4);
    }

    private void crearSilla(ClaseSilla claseSilla, int numSillas, int numSillasPorFila){
        for (int i = 0; i < numSillas; i++) {
            int fila = (i / numSillasPorFila) + 1;
            StringBuilder idSilla = new StringBuilder();
            idSilla.append(fila);
            idSilla.append("-");
            idSilla.append(Character.toString((char) ((i%numSillasPorFila) + 65)));
            PosicionSilla posicionSilla = i % 2 == 0 ? PosicionSilla.VENTANA : PosicionSilla.PASILLO;
            Silla silla =  new Silla(idSilla.toString(), claseSilla, posicionSilla, fila);
            sillas.add(silla);
        }
    }

    public Silla crearReserva(){
        return null;
    }
    public boolean eliminarReserva (){
        return false;
    }
    public Pasajero buscarPasajero(){
        return null;
    }
    public BigDecimal calcularOcupacion(){
        long ocupadas = sillas.stream()
                .filter(Silla::isOcupada)
                .count();
        return BigDecimal.valueOf(ocupadas)
                .divide(BigDecimal.valueOf(sillas.size()));
        /*
        BigDecimal ocupacion = BigDecimal.ZERO;
        for (Silla silla : sillas) {
            if (silla.isOcupada()){
                ocupacion = ocupacion.add(BigDecimal.ONE);
            }
        }
        return ocupacion.divide(new BigDecimal(sillas.size()));
         */
    }

    public ArrayList<Silla> sillasLibres(){
        return null;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    @Override
    public String toString() {
        return String.format("{\"Tren\": {\"id\":\"%d\",\"Sillas\":%s}}",id,sillas);
    }
}
