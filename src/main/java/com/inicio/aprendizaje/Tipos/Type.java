package com.inicio.aprendizaje.Tipos;

public class Type {
    public static void main(String[] args) {
        int numero = 10;
        int divisor = 3;
        byte enterocorto;
        short enteromedio;
        long enterolargo = 1l;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(numero / divisor);

        double numdecimal = 1.0 / 3.0;
        double numdivisor = numdecimal * 3;
        float numflotante = 0.1f;
        double vlrdouble = 0.1;
        double resultado = numflotante;
        Boolean numb = null;
        char caracter = 'a';
        String cadena;
        Character texto = 'a';
        System.out.println(numflotante);
        System.out.println(vlrdouble);
        System.out.println(resultado);
        System.out.println(Boolean.TRUE);
        char[] array = {'r', 'a', 'u', 'l'};
        String[] array1 = {"raul", "medina", "sandoval"};
        System.out.println(array);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        for (String nombre : array1) {
            System.out.println(nombre);
        }
        /* System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(numdivisor == 1.0);
        System.out.println(numdecimal);
        BigDecimal bignumber = BigDecimal.valueOf(1.0);
        BigDecimal bigdivisor = BigDecimal.valueOf(3.0);
        System.out.println(bignumber.add(bigdivisor));
        System.out.println(bignumber.divide(bigdivisor, 10, RoundingMode.HALF_UP));*/

    }
}
