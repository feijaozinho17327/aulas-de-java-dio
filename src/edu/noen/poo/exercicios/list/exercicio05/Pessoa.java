package edu.noen.poo.exercicios.list.exercicio05;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {


    private final String nome;
    private final int idade;
    private final Double altura;

    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }


    public int compareTo(Pessoa pessoa) {

        return Integer.compare(this.idade, pessoa.getIdade());


    }


}

class OrdenaAltura implements Comparator<Pessoa> {


    public int compare(Pessoa pessoa1, Pessoa pessoa2) {

        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());

    }


}