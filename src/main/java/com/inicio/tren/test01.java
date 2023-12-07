package com.inicio.tren;

import java.util.Arrays;
// Importar Scanner
import java.util.Scanner;

public class test01{

    public static void main(String[] args) {

        // Crear Variables Principales
        String Clientes[] = new String[20];
        int opcion, i = 0;
        // Inicializar scanner
        Scanner scInt = new Scanner(System.in);
        Scanner scTxt = new Scanner(System.in);
        // Preguntar
        while(true) {
            System.out.println("Escoja Opción: \t 1. Dar Alta Empleado \t 2. Listar Empleados \t 3. Comprobar Existencia Empleado \t 4. Salir del Programa");
            opcion = scInt.nextInt();
            // Switch Case
            switch (opcion) {
                case 1:
                    // Estética
                    System.out.println();
                    // Añadir Empleado
                    if(i < 20) {
                        System.out.println("Ha escogido la opción " + opcion + ". Introduzca el nombre del empleado -> " + i);
                        Clientes[i] = scTxt.nextLine();
                        System.out.println(Clientes[i]);
                    }else {
                        System.out.println("No se pueden añadir más clientes, lo sentimos.");
                    }
                    break;
                case 2:
                    // Crear boolean
                    boolean hasValue = false;
                    // Estética
                    System.out.println();
                    System.out.println("Ha escogido la opción " + opcion + ". Se procederá a mostrar los Empleados.");
                    for(int j = 0; j <= Clientes.length; j++) {
                        if(Clientes[j] != null){
                            hasValue = true;
                            System.out.println("Cliente cuyo Nº es -> : " + j + " le corresponde el Nombre: " + Clientes[j]);
                        }else {
                            hasValue = false;
                        }
                    }
                    // Añadir Empleado
                    if(hasValue == false) {
                        // Estética
                        System.out.println();
                        // Output Error
                        System.out.println("No es posible, no se ha introducido ningún cliente.");
                    }

                    break;
                case 3:
                    System.out.println("Ha escogido la opción " + opcion + ". Ha seleccionado salir del programa, hasta luego :-)");
                    System.exit(0);
                    break;
                default:
                    // Estética
                    System.out.println();
                    // Error Output
                    System.out.println("Error, la opción " + opcion + " seleccionada no es válida.");
                    break;
            }
            // Incrementar
            i++;
        }

    }
}