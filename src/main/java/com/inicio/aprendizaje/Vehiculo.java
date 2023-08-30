package com.inicio.aprendizaje;

public class Vehiculo {
	private String tamano ;
    private String color;
    private int llantas ;
    private String marca;
    private String tipo;
    public Vehiculo(String tamano, int llantas) {
		
		this.tamano = tamano;
		this.llantas = llantas;
		
	}
    
	public Vehiculo(String tamano, String color, int llantas, String marca, String tipo) {
		super();
		this.tamano = tamano;
		this.color = color;
		this.llantas = llantas;
		this.marca = marca;
		this.tipo = tipo;
	}

	public Vehiculo() {
	
		}
	public String getTamano() {
		return tamano;
	}
	public String getColor() {
		return color;
	}
	public int getLlantas() {
		return llantas;
	}
	public String getMarca() {
		return marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [tamano=" + tamano + ", color=" + color + ", llantas=" + llantas + ", marca=" + marca
				+ ", tipo=" + tipo + "]";
	}
	
}
