package edu.noen.poo.exercicios.map.exercicio03;

public class Controle {



        public static void main(String[] args) {
            EstoqueProdutos estoque = new EstoqueProdutos();

            // Adicionando produtos
            estoque.adicionarProduto(1, "Produto A", 10, 50.0);
            estoque.adicionarProduto(2, "Produto B", 5, 30.0);
            estoque.adicionarProduto(3, "Produto C", 8, 40.0);
            estoque.adicionarProduto(4, "Produto D", 15, 25.0);
            estoque.adicionarProduto(5, "Produto E", 12, 60.0);

            // Exibindo os produtos no estoque
            estoque.exibirProdutos();

            // Calculando o valor total do estoque
            double valorTotal = estoque.calcularValorTotalEstoque();
            System.out.println("Valor total do estoque: " + valorTotal);

            // Obtendo o produto mais caro
            Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
            System.out.println("Produto mais caro: " + produtoMaisCaro.getNome());

            // Obtendo o produto mais barato
            Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
            System.out.println("Produto mais barato: " + produtoMaisBarato.getNome());

            // Obtendo o produto com maior valor total no estoque
            String produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
            System.out.println("Produto com maior valor total no estoque: " + produtoMaiorQuantidadeValorTotal);
        }
    }



