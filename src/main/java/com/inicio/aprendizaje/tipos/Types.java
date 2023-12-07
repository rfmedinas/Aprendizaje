package com.inicio.aprendizaje.tipos;

import java.math.BigDecimal;

public class Types {
    public static void main(String[] args) {
        int numero = 10;
        int divisor =3;
        System.out.println(numero/divisor);

        BigDecimal numero1 = new BigDecimal("10");
        BigDecimal divisor1 = new BigDecimal("3.0");
        BigDecimal resultado = numero1.divide(divisor1, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(resultado);



        float floatVal = 0.1f;
        double doubleVal = 0.1;
        double doubleValCopy = floatVal;


        System.out.println(floatVal);      // 0.1
        System.out.println(doubleVal);     // 0.1
        System.out.println(doubleValCopy); // 0.10000000149011612

        System.out.println(floatVal == doubleVal); // false
        System.out.println(doubleVal == doubleValCopy); // false


        System.out.println(Boolean.TRUE);

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1.compareTo(false));

        String[] nombres = {"Juan", "Pedro", "Maria", "Pablo"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
