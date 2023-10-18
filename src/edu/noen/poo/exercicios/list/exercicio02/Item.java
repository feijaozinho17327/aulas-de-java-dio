package edu.noen.poo.exercicios.list.exercicio02;

public class Item {

    private final String nome;
    private final Float preco;

    private final int quantidade;

    public Item(String nome, Float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
