package com.instancia2;

/**
 * Miercoles 30/05
 *
 */
public class Bucles {

    //Constructor
    public Bucles(){
        super();
    }

    /**
     * Miercoles 30/05
     * Bucle For
     */
    public void BucleFor(){

        System.out.println("\nBucle FOR");

        int n = 0;

        for(int i=1;i<=10;i++){
            System.out.println("Indice de i: " + i);
        }

        /*
        PREGUNTA DE CERTIFICACION BUCLE INFINITO
         */
        /*for(;;){
            System.out.printf("Hola");
        }*/
        /*
        Solo es necesario la inicializacion externa y la condicion y el incremento puede ser dentro del for
        */

    }


    /**
     * Lunes 04/06
     * Ejercicio 4
     Realizar un programa que calcule el factorial de un número existente en una determinada variable
     entera.
     El factorial de un número es el resultado de multiplicar entre sí todos los números naturales menores
     comprendidos entre 1 y el número en cuestión.
     */
    public void CalcularFactorial(){
        int numero = 20;
        long factorial = numero;
        int j = 0;
        System.out.println("\nCalculamos factorial de un numero");

        /*
        j = numero -1;
        for(int i=1; i<numero; i++){
            factorial = factorial * j;
            j--;
        }

        System.out.printf("Factorial de: " + numero + " = "  + factorial);
        */

        int facto = 1;
        int numeroDado = 5;
        for(;numeroDado > 0;){
            facto *= numeroDado;
            numeroDado --;
        }

        System.out.printf("Factorial de: " + numero + " = "  + facto);


    }

    /**
     * Lunes 04/06
     * Bucle foreach
     */
    public void BucleForEach(){

        System.out.println("\nBucle foreach");

        int miArray[] = {1,2,3,4,5,6,7,8,9};

        for(int a:miArray){
            System.out.println("Valor de miArray: " + a);
        }

    }


    /**
     * Lunes 04/06
     * Ejercicio 5
     Realizar un programa que, dado un array de números enteros, calcule la suma de todos los números
     contenidos en el mismo y la muestre por pantalla.
     Se empleará una instrucción foreach para realizar el recorrido del array.
     */
    public void SumaElementosArray(){

        System.out.printf("\nSuma elementos de un Array");

        int iSuma = 0;

        int miArray[] = {1,2,3,4,5,6};
        for (int numero:miArray){
            iSuma += numero;
        }

        System.out.printf("Suma de los valores del miArray es: " + iSuma);


    }

    /**
     * Lunes 04/06
     *  Bucle While
     */
    public void BucleWhile(){

        System.out.println("\nBucle While");

        int i = 0;

        while(i<=10){
            //System.out.println("Valor de i: " + i);
            //i ++;
            System.out.println("Valor de i: " + ++i); //-> PREGUNTA EN LA CERTIFICACION
        }
    }

    /**
     * Lunes 04/06
     * Bucle Do While
     */
    public void BucleDoWhile(){
        System.out.println("\nBucle Do While");

        int i = 0;

        do{
            System.out.println("Valor de i: " + i);
            i ++;

        }while(i<=10);

    }

    /**
     * Lunes 04/06
     * Ejercicio 6
     Realizar un programa que, dado un determinado array de números enteros, realice el recorrido de éste
     y muestre cada uno de estos números hasta que se encuentre un número negativo, momento en el
     cual se finalizará el recorrido del array y se indicará el total de números recuperados.
     Para realizar este recorrido utilizaremos una instrucción while en vez de for, ya que se desconoce el
     número de iteraciones que debemos realizar.
     */
    public void SacaValorDeArray(){

        System.out.println("\nSacar Valor Array Ejercicio 6");

        int myArray[] = {1,2,3,-4,5,6,7};
        int i = 0;

        while(myArray[i] > 0 && i < myArray.length){
            System.out.println("Valor de la posicion de myArray es: " + myArray[i]);
            i++;
        }

        System.out.println("Valor del numero negativo encontrado: " + myArray[i] + " en la posicion: " + (i + 1));
        System.out.println("Total de numeros recuperados: " + (i + 1));

    }

}
