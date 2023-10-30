package edu.noen.poo.exercicios.set.exercicio01;

public class Controle {

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();



        conjuntoConvidados.adicionarConvidado("Carlos", 21300);
        conjuntoConvidados.adicionarConvidado("Maria", 21301);
        conjuntoConvidados.adicionarConvidado("João", 21302);
        conjuntoConvidados.adicionarConvidado("Ana", 21303);
        conjuntoConvidados.adicionarConvidado("Pedro", 21304);


        conjuntoConvidados.removerConvidadoPorCodigoConvite(21302);
        System.out.println("numero de convidados:");
        System.out.println(conjuntoConvidados.contarConvidados());

        System.out.println("lista de convidados:");
        conjuntoConvidados.exibirConvidados();











    }



}
