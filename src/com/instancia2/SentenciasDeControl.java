package com.instancia2;

import java.util.Scanner;

/**
 * Miercoles 30/05
 */
public class SentenciasDeControl {

    //Constructor
    public SentenciasDeControl(){
        super();
    }

    /**
     * Miercoles 30/05
     * Estructura de control IF ELSE
     */
    public void Condiciones(){

        System.out.println("\nCondiciones");

        boolean condicion = false;

        if(condicion){
            System.out.println("Se comple la condicion");
        }else{
            System.out.println("No se cumple la condicion");
        }

    }

    /**
     * Miercoles 30/05
     * Ejercicio 2
     Realizar un programa que dado un determinado número entero almacenado en una variable nos
     muestre un mensaje en la consola indicando si el número es par o impar.
     El programa lo escribiremos dentro del método main() de la clase.
     PISTA: Para saber si un número es par o impar debemos comprobar el resto de la división entre ese
     número y 2. Si el resultado es 0 el número es par, sino es impar.
     */
    public void Ejercicio2(){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt(); //leer un entero

        if(n % 2 == 0){
            System.out.println("El numero: " + n + " es par");
        }else{
            System.out.println("El numero: " + n + " es impar");
        }
    }

    /**
     * Miercoles 30/05
     * Condiciones con Switch
     */
    public void CondicionSwitch(){

        Scanner sc = new Scanner(System.in);
        String sNombre;
        System.out.print("Introduzca un nombre: ");
        sNombre = sc.next(); // leer String

        switch(sNombre){
            case "Antonio":
                System.out.println("El nombre introducido es Antonio");
                break;
            case "Manuel":
                System.out.println("El nombre introducido es Manuel");
                break;
            case "Jaime":
                System.out.println("El nombre introducido es Jaime");
                break;
            case "Pedro":
                System.out.println("El nombre introducido es Pedro");
                break;
            case "Gorka":
                System.out.println("El nombre introducido es Gorka");
                break;
            default:
                System.out.println("El nombre introducido no está contemplado");
                break;
        }

    }

    /**
     * Miercoles 30/05
     * Ejercicio 3
     Realizar un programa que a partir de un número almacenado en una determinada variable entera, que
     representará la hora del día y por tanto estará́comprendido entre 1 y 24, nos de los buenos días, las
     buenas tardes o las buenas noches.
     El programa deberá́ser capaz de comprobar si el número está realmente comprendido entre ese rango
     pues, en caso contrario, nos mostrará un mensaje de error.
     */
    public void Ejercicio3 (){

        int iHora = 22;

        System.out.println("\nEjercicio 3");
        System.out.println("\nLa hora introducida es: " + iHora);

        switch(iHora){
            case 1:
                System.out.println("Hola buenas noches");
                break;
            case 2:
                System.out.println("Hola buenas noches");
                break;
            case 3:
                System.out.println("Hola buenas noches");
                break;
            case 4:
                System.out.println("Hola buenas noches");
                break;
            case 5:
                System.out.println("Hola buenas noches");
                break;
            case 6:
                System.out.println("Hola buenos días");
                break;
            case 7:
                System.out.println("Hola buenos días");
                break;
            case 8:
                System.out.println("Hola buenos días");
                break;
            case 9:
                System.out.println("Hola buenos días");
                break;
            case 10:
                System.out.println("Hola buenos días");
                break;
            case 11:
                System.out.println("Hola buenos días");
                break;
            case 12:
                System.out.println("Hola buenos días");
                break;
            case 13:
                System.out.println("Hola buenas tardes");
                break;
            case 14:
                System.out.println("Hola buenas tardes");
                break;
            case 15:
                System.out.println("Hola buenas tardes");
                break;
            case 16:
                System.out.println("Hola buenas tardes");
                break;
            case 17:
                System.out.println("Hola buenas tardes");
                break;
            case 18:
                System.out.println("Hola buenas tardes");
                break;
            case 19:
                System.out.println("Hola buenas tardes");
                break;
            case 20:
                System.out.println("Hola buenas tardes");
                break;
            case 21:
                System.out.println("Hola buenas tardes");
                break;
            case 22:
                System.out.println("Hola buenas noches");
                break;
            case 23:
                System.out.println("Hola buenas noches");
                break;
            case 24:
                System.out.println("Hola buenas noches");
                break;
            default:
                System.out.println("La hora introducida no está contemplado");
                break;
        }

    }
}
