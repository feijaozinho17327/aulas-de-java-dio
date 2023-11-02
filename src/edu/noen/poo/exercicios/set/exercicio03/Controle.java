package edu.noen.poo.exercicios.set.exercicio03;

public class Controle {


    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();


        cadastroProduto.cadastrarProduto("Molho De Tomate", 12532, 5.49, 20);
        cadastroProduto.cadastrarProduto("Arroz", 78901, 3.99, 50);
        cadastroProduto.cadastrarProduto("Feijão", 45678, 4.25, 40);
        cadastroProduto.cadastrarProduto("Macarrão", 23456, 2.99, 30);
        cadastroProduto.cadastrarProduto("Leite", 10101, 2.49, 60);
        cadastroProduto.cadastrarProduto("Ovos", 30303, 1.99, 100);
        cadastroProduto.cadastrarProduto("Café", 70707, 7.99, 15);
        cadastroProduto.cadastrarProduto("Carne", 11111, 12.99, 10);
        cadastroProduto.cadastrarProduto("Peixe", 22222, 9.99, 12);
        cadastroProduto.cadastrarProduto("Frango", 33333, 6.99, 18);

        System.out.println("lista de produtos: \n");
        System.out.println(cadastroProduto.produtoSet);

        System.out.println("lista ordenada por nome: \n");
        System.out.println(cadastroProduto.ordenarProduto());

        System.out.println("lista ordenada por preço: \n");
        System.out.println(cadastroProduto.comparaPorPreco());










    }

}
