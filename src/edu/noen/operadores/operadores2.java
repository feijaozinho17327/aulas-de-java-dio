package edu.noen.operadores;

public class operadores2 {

    public static void main(String[] args) {

        int numero = 5;


        System.out.println(numero + 1);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero);
        numero = --numero;
        numero--;

        System.out.println(numero);
        numero = ++numero;
        numero++;

        System.out.println(numero);


        System.out.println("BOOLEAN!!! \n");

        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

    }


}