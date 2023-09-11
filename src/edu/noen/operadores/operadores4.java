package edu.noen.operadores;
public class operadores4 {

    public static void main(String[] args) {

        int numero1 = 6;
        int numero2 = 5;

        String nome1 = "JAVA";
        String nome2 = new String("JAVA");

        boolean verificaNumero = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? \n" + verificaNumero);

        verificaNumero = numero1 != numero2;

        System.out.println("numero1 é diferente a numero2? \n" + verificaNumero);

        verificaNumero = numero1 > numero2;

        System.out.println("numero1 é maior a numero2? \n" + verificaNumero);

        verificaNumero = numero1 < numero2;

        System.out.println("numero1 é menor a numero2? \n" + verificaNumero);


        System.out.println("STRINGS!!!");

        System.out.println(nome1 == nome2);

        System.out.println(nome1.equals(nome2));




    }



}