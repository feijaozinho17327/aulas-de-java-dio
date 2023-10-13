package edu.noen.poo.supermercado;

public class Estoque implements Comparable<Estoque> {

    private final String produto;
    private final int valLote;
    private final int qtd;

    public Estoque(String produto, int valLote, int qtd) {
        this.produto = produto;
        this.valLote = valLote;
        this.qtd = qtd;
    }

    public String getProduto() {
        return produto;
    }

    public int getValLote() {
        return valLote;
    }

    public int getQtd() {
        return qtd;
    }

    public int compareTo(Estoque estoqueL) {

        return produto.compareTo(estoqueL.getProduto());

    }
}
