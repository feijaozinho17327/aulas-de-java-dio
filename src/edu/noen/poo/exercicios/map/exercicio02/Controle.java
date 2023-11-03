package edu.noen.poo.exercicios.map.exercicio02;

public class Controle {

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();


        dicionario.adicionarPalavra("int","inteiro");
        dicionario.adicionarPalavra("float", "decimal");
        dicionario.adicionarPalavra("String", "caracter");
        dicionario.adicionarPalavra("boollean","logico");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("int"));
    }




}
