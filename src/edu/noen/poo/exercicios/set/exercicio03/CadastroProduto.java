package edu.noen.poo.exercicios.set.exercicio03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {


    Set<Produto> produtoSet;


    public CadastroProduto(){

        this.produtoSet = new HashSet<>();


    }

    public void cadastrarProduto(String nome, int codigo, double preco, int qtd) {


        produtoSet.add(new Produto(nome,codigo,preco,qtd));



    }


    public Set<Produto> procurarProduto() {

        Set<Produto> produtoRealocado = new TreeSet<>(produtoSet);



        return produtoRealocado;

    }

    public  Set<Produto> comparaPorPreco() {

        Set<Produto> comparaPreco = new TreeSet<>(new ComparatorPorPreco());

        comparaPreco.addAll(produtoSet);
        return comparaPreco;

    }
}
