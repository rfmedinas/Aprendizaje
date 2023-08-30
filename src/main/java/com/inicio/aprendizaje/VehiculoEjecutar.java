package com.inicio.aprendizaje;

public class VehiculoEjecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo camioneta = new Vehiculo();
		camioneta.setTamano("4x4");
		camioneta.setColor("Negro");
		System.out.println(camioneta.getTamano());
		System.out.println(camioneta.toString());
		Vehiculo automovil = new Vehiculo("familiar", 4);
		System.out.println(automovil.toString());
		Vehiculo tractomula = new Vehiculo("doble troque", "rojo", 16, "Mercedes", "pesado");
		System.out.println(tractomula.toString());
	}

}
