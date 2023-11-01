package edu.noen.poo.exercicios.set.exercicio04;

public class Controle {


    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();


        conjuntoPalavrasUnicas.adicionarPalavra("Arvore");
        conjuntoPalavrasUnicas.adicionarPalavra("Arara");
        conjuntoPalavrasUnicas.adicionarPalavra("Arvore");
        conjuntoPalavrasUnicas.adicionarPalavra("Falcao");
        conjuntoPalavrasUnicas.adicionarPalavra("Linux");
        conjuntoPalavrasUnicas.adicionarPalavra("Flor");

        System.out.println("exibindo palavras");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("procurando palavras");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("linux"));

        System.out.println("deletando palavras");
        conjuntoPalavrasUnicas.removerPalavra("Arara");

        System.out.println("reexibindo palavras");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }

}
