package edu.noen.poo.exercicios.list.exercicio04;

public class Controle {

    public static void main(String[] args) {

        Operacoes operacoes = new Operacoes();

        operacoes.adicionarNumero(0);
        operacoes.adicionarNumero(1);
        operacoes.adicionarNumero(2);
        operacoes.adicionarNumero(3);
        operacoes.adicionarNumero(4);
        operacoes.adicionarNumero(5);


        System.out.println("encontra o maior");
        System.out.println(operacoes.encontrarMaiorNumero());

        System.out.println("encontra o menor");
        System.out.println(operacoes.encontrarMenorNumero());

        System.out.println("calcula soma");
        System.out.println(operacoes.calcularSoma());

        System.out.println("exibe numeros");
        operacoes.exibirNumeros();


    }



}
