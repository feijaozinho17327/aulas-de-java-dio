package edu.noen.poo.exercicios.list.exercicio02;



public class Controle {

    public static void main (String [] args) {


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();


        carrinho.adicionarItem("macarrao", 5.50f, 2);
        carrinho.adicionarItem("arroz", 3.00f, 3);
        carrinho.adicionarItem("feijão", 2.50f, 2);
        carrinho.adicionarItem("leite", 2.00f, 4);
        carrinho.adicionarItem("carne", 8.00f, 1);
        carrinho.adicionarItem("ovos", 1.50f, 12);
        carrinho.adicionarItem("pão", 2.00f, 5);
        carrinho.adicionarItem("batata", 1.00f, 6);
        carrinho.adicionarItem("cenoura", 1.20f, 3);
        carrinho.adicionarItem("banana", 0.50f, 10);


        System.out.println("antes da funcao removerItem");
        carrinho.exibirItens();
        System.out.println("\n\n valor total:" + carrinho.calcularValorTotal());


        carrinho.removerItem("banana");

        System.out.println("\n depois da funcao removerItem");
        carrinho.exibirItens();
        System.out.println("\n\n valor total:" + carrinho.calcularValorTotal());






    }

}
