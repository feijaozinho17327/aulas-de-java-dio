package edu.noen.sintaxeBasica.anatomiadasclasses;

public class BoletimEscolar {

    public static void main(String[] args) {

        int mediaFinal = 1;

        if (mediaFinal > 6)
            System.out.println("APROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("REPROVADO");

    }
}