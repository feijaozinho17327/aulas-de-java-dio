package edu.noen.poo.supermercado;


import java.util.Comparator;

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

class ComparaQtd implements Comparator<Estoque> {

    public int compare(Estoque estoque1, Estoque estoque2) {

        return Integer.compare(estoque1.getQtd(), estoque2.getQtd());

    }

}

class ComparaVal implements Comparator<Estoque> {


    public int compare(Estoque estoque1, Estoque estoque2) {

        return Integer.compare(estoque1.getValLote(), estoque2.getValLote());

    }


}