package edu.noen.poo.exercicios.map.exercicio03;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtoMap;


    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }


    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {

        produtoMap.put(cod,new Produto(nome,preco,quantidade));


    }

    public void exibirProdutos() {

        System.out.println(produtoMap);

    }

    public double calcularValorTotalEstoque() {

        double valorTotal = 0;

        if(!produtoMap.isEmpty()) {

            for(Produto p : produtoMap.values()) {

                valorTotal += p.getPreco() * p.getQuantidade();


            }

        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;
        double maiorValor = 0;

        for (Produto p : produtoMap.values()) {
            if (maiorValor < p.getPreco()) {
                maiorValor = p.getPreco();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }




    public Produto obterProdutoMaisBarato() {

        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;

        for(Produto p: produtoMap.values()) {

            if(menorValor > p.getPreco()) {

                menorValor = p.getPreco();
                produtoMaisBarato = p;
            }

        }


        return produtoMaisBarato;

    }

    public String obterProdutoMaiorQuantidadeValorTotalNoEstoque() {


        double maiorValorEstoqueAux = 0;
        double maiorValorEstoque = 0;
        String produto = null;

        for(Produto p : produtoMap.values()) {

            maiorValorEstoqueAux += p.getQuantidade() * p.getPreco();

            if(maiorValorEstoque < maiorValorEstoqueAux) {

                maiorValorEstoque = maiorValorEstoqueAux;

                produto = p.getNome();
            }

        }
       return produto;
    }

}
