package com.instancia2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase principal
 */
public class Main {

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 2;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;


    /**
     *
     * Método principal de ejecución
     * @param args argumentos de entrada
     *
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo desde Cice!!!!");

        System.out.println(darSaludo("Gorka"));

        byte numero = 8;
        numero = 10;

        final int MI_CONSTANTE = 128;

        //Calculamos el cuadrado de un número
        int numeroCalcular = 2;
        int cuadrado = CalculaCuadrado(numeroCalcular);

        System.out.println("El resultado de calcular el cuadrado de " + numeroCalcular + " es: " + cuadrado);

        OperadoresRelacion();
        OperadoresLogicos();
        OperadoresUnarios();
        OperadoresAsignacion();
        ArraysObjetos();
    }

    /**
     *
     * Método que construye un saludo dado un nombre
     * @param nombre Nombre que se recibe para construir el saludo
     * @return Texto con el saludo contruido
     *
     */
    static String darSaludo (String nombre){
        String sSaludo = "Hola " + nombre;

        return sSaludo;
    }

    /**
     * Dado un número calcula su cuadrado
     * @param a Numero para calcular el cuadrado
     * @return Resultado de la operacion
     *
     */
    static int CalculaCuadrado (int a){
        int resultado = 0;

        resultado = a * a;

        return resultado;
    }


    /**
     * Lunes 28/05
     * Opereadores de realcion su finalidad es la de relacionar 2 objetos o variables para conseguir una respuesta true o false
     * Los operadores de relacion son: >, <, <=, >=, !=, ==
     */
    static void OperadoresRelacion(){

        System.out.println("\nOperadoresRelacion");

        System.out.println("1 > 2 es " + r1);
        System.out.println("1 < 2 es " + r2);
        System.out.println("1 >= 2 es " + r3);
        System.out.println("1 <= 2 es " + r4);
        System.out.println("1 != 2 es " + r5);
        System.out.println("1 == 2 es " + r6);

    }

    /**
     * Lunes 28/05
     * Operadores Logicos
     * Los operdores lógicos son: &&, &, ||, |, !, ^
     */
    static void OperadoresLogicos(){

        System.out.println("\nOperadoresLogicos");

        System.out.println("r1 && r2 es " + (r1 && r2));
        System.out.println("r2 || r3 es " + (r2 && r3));
        System.out.println("r2 || r3 es " + (r2 || r3));
        System.out.println("!r4 es " + !r4);
        System.out.println("r4 ^ r5 es " + (r4 ^r5));
        System.out.println("1 != 2 es " + r5);
        System.out.println("r1 & r2 es " + (r1 & r2));
        System.out.println("r2 | r3 es " + (r2 | r3));


    }

    /**
     * Lunes 28/05
     * Operadores Unarios
     * Los operdores lógicos son: ~, -
     */
    static void OperadoresUnarios(){

        System.out.println("\nOperadoresUnarios");

        int a = ~127;
        System.out.println(a);

    }


    /**
     * Lunes 28/05
     * Operadores de Asignacion
     * Los operadores de asignacion son: ++, --, *=;
     */
    static void OperadoresAsignacion(){

        System.out.println("\nOperadoresAsignacion");

        int b = 5;
        b++; // b = b + 1
        System.out.println("b++ es " + b);
        System.out.println(b++); //!!!Pregunta de certificacion
        System.out.println(++b); //!!!Pregunta de certificacion
        System.out.println(b);
        b--; // b = b - 1
        System.out.println("b-- es " + b);
        b*=2; // b = b * 2
        System.out.println("b*=2 es " + b);
        b/=5; // b = b / 5
        System.out.println("b/=5 es " + b);

        b+=3;
        System.out.println("b+=3 es " + (b+=3));

        b%=5; // b = b % 5
        System.out.println("b%=5 es " + (b%=5));

        b = 1;
        b<<=1;
        System.out.println(b<<=1);
        //System.out.println("b<<=1 es " + (b<<=1));


    }

    /**
     * Lunes 28/05
     * Arrays
     */
    static void ArraysObjetos(){
        int[] numeros = new int[5];
        int[] masnumeros = {1,2,3,4,5};

        int tama = 10;
        int[] otrosnumeros = new int[tama];

        int tama1 = 20;
        int num[] = new int[tama1];

        System.out.println("\nArraysObjetos");

        System.out.println(masnumeros[1]);

        int iSize = masnumeros.length;
        System.out.println("Longitud de masnumeros es: " + iSize);


    }





}
