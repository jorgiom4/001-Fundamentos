package com.instancia2;



public class Operadores {

    private boolean r1 = 1 > 2;
    private boolean r2 = 1 < 2;
    private boolean r3 = 1 >= 2;
    private boolean r4 = 1 <= 2;
    private boolean r5 = 1 != 2;
    private boolean r6 = 1 == 2;


    //Constructor
    public Operadores(){
        super();
    }

    /**
     * Lunes 28/05
     * Opereadores de realcion su finalidad es la de relacionar 2 objetos o variables para conseguir una respuesta true o false
     * Los operadores de relacion son: >, <, <=, >=, !=, ==
     */
    public void OperadoresRelacion(){

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
    public void OperadoresLogicos(){

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
    public void OperadoresUnarios(){

        System.out.println("\nOperadoresUnarios");

        int a = ~127;
        System.out.println(a);

    }


    /**
     * Lunes 28/05
     * Operadores de Asignacion
     * Los operadores de asignacion son: ++, --, *=;
     */
    public void OperadoresAsignacion(){

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


}
