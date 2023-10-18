package edu.noen.poo.exercicios.list.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Item> itemList = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }



    public void adicionarItem(String nome, Float preco, int quantidade) {

        itemList.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome) {

        List<Item> itensRemover = new ArrayList<>();

        for (Item item : itemList) {

            if (item.getNome().equalsIgnoreCase(nome)) {

                itensRemover.add(item);

            }



        }
        itemList.removeAll(itensRemover);
    }



    public Float calcularValorTotal() {

        Float soma = 0f;

        for (Item item : itemList) {

            soma += item.getPreco() * item.getQuantidade();

        }

        return soma;

    }

    public void exibirItens() {


        for (Item itens : itemList) {

            System.out.println("produto: " + itens.getNome()
                    +" "+ "preço: " + itens.getPreco()
                    +" "+ "quantidade: " + itens.getQuantidade());

        }
    }

}
