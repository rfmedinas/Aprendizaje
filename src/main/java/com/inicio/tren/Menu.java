package com.inicio.tren;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Tren tren = new Tren(1);
        ArrayList <Pasajero> pasajeros = new ArrayList<Pasajero>();
        Scanner scInt = new Scanner(System.in);
        Scanner scTxt = new Scanner(System.in);
        int opcion = 0;

        System.out.println("El tren esta listo para recibir pasajeros");
        do {
            try{
                opcion = crearMenuPrincipal();
            }catch (InputMismatchException e){
                System.out.println("Debes seleccionar un número");
                scInt.next();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cédula del pasajero");
                    int cedula = scInt.nextInt();
                    System.out.println("Ingrese el nombre del pasajero");
                    String nombre = scTxt.nextLine();
                    System.out.println("nombre: " + nombre);
                    pasajeros.add(new Pasajero(cedula, nombre));
                    break;
                case 2:
                    // Código para la opción 2
                    break;
                case 3:
                    // Código para la opción 3
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

    }

    private static int crearMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el número de una opcion");
        System.out.println("1. Agregar Pasajero");
        System.out.println("2. Agregar Reserva");
        System.out.println("3. Eliminar Reserva");
        System.out.println("4. Ver ocupacion");
        System.out.println("5. Limpiar");
        return scanner.nextInt();
    }

    /*
    private static void crearPasajero() {
        Scanner scTxt = new Scanner(System.in);

        System.out.println("Ingrese la cédula del pasajero");
        int cedula = scanner.nextInt();
        scanner.close();
        System.out.println("Ingrese el nombre del pasajero");
        String nombre = scTxt.nextLine();
        System.out.println("nombre: " + nombre);

        pasajeros.add(new Pasajero(cedula, nombre));

    }

     */
    private static void crearMenuClase() {
        System.out.println("1. Ejecutiva");
        System.out.println("2. Economica");
    }

    private static void crearMenuPosicion() {
        System.out.println("1. Ventana");
        System.out.println("2. Pasillo");
    }


}

