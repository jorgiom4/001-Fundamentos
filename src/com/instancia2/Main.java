package com.instancia2;

/**
 * Clase principal
 */
public class Main {


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

        Operadores operadores = new Operadores();

        operadores.OperadoresAsignacion();
        operadores.OperadoresLogicos();
        operadores.OperadoresRelacion();
        operadores.OperadoresUnarios();

        Arreglos arreglos = new Arreglos();

        arreglos.ArraysObjetos();
        arreglos.ArrayBidimensionales();

        SentenciasDeControl sentencias = new SentenciasDeControl();

        sentencias.Condiciones();
        //sentencias.Ejercicio2();
        //sentencias.CondicionSwitch();
        sentencias.Ejercicio3();

        Bucles bucles = new Bucles();
        bucles.BucleFor();
        bucles.CalcularFactorial();
        bucles.BucleForEach();
        bucles.SumaElementosArray();
        bucles.BucleWhile();
        //bucles.BucleDoWhile();
        bucles.SacaValorDeArray();

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



}
