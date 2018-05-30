package com.instancia2;

public class Arreglos {

    //Constructor
    public Arreglos(){
        super();
    }

    /**
     * Lunes 28/05
     * Arrays
     */
    public void ArraysObjetos(){
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


    /**
     * Miercoles 30/05
     * Arrays Bidimensionales
     */
    public void ArrayBidimensionales(){
        int[][] arraybidimensional = new int[2][4];
        int[] array2[] = new int[2][4];
        int array2b[][] = {{0,1,2,3},{2,1,5,4},{5,4,7,8},{6,5,4,1}};

        System.out.println("\nArraysBidimensionales");

        //System.out.println("array2b: " + array2b[1][4]);

        int[][][] array3d = { { { 1,2,3,4,5 }, { 2,1,3,4,5 }, { 1,4,3,2,5 } }, { { 5,4,3,2,1 }, { 3,4,2,5,1 }, { 1,5,4,2,3 } } };
        int [][][] array3d2 = new int[2][3][3];

        System.out.println("array3d: " + array3d[1][0][0]);


    }



}
