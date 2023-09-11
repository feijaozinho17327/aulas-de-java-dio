package edu.noen.operadores;
import java.sql.SQLOutput;

public class Operadores {

    public static void main(String[] args) {

        double modulo = 19 % 2;
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        String concatenacao = "?";

         concatenacao = 1 + 1 + 1 + "6" + 1 + 1;
        System.out.println("concatenacao: \n" + concatenacao);
         concatenacao = "6" + (1+1+1);
        System.out.println("concatenacao: \n" + concatenacao);


        System.out.println("modulo: \n" + modulo);
        System.out.println("nomeCompleto: \n" + nomeCompleto);




    }

}