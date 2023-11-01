package edu.noen.poo.exercicios.set.exercicio03;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String nome;
    private int codigo;
    private double preco;
    private int qtd;

    public Produto(String nome, int codigo, double preco, int qtd) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {


    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(),produto2.getPreco());
    }
}