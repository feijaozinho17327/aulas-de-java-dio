package edu.noen.poo.supermercado;

import java.util.ArrayList;
import java.util.Collections;

public class Controle {

    public static void main(String[] args) {

        ArrayList<Estoque> meuEstoque = new ArrayList<Estoque>() {

            {
                add(new Estoque("Pasta de dente", 20240203, 40));
                add(new Estoque("Farinha de Trigo", 20240304, 23));
                add(new Estoque("Arroz", 20240315, 15));
                add(new Estoque("Feijão", 20240801, 20));
                add(new Estoque("Açúcar", 20240228, 10));
                add(new Estoque("Sal", 20241210, 12));
                add(new Estoque("Macarrão", 20240630, 18));
                add(new Estoque("Óleo de Cozinha", 20240520, 25));
                add(new Estoque("Leite em Pó", 20240705, 8));
                add(new Estoque("Café", 20241130, 30));


            }


        };

        System.out.println("ANTES DA ORDENAÇÃO \n");

        for(Estoque E : meuEstoque) {

            System.out.println(E.getProduto());

        }

        System.out.println("DEPOIS DA ORDENAÇÃO \n");

        Collections.sort(meuEstoque);
        for (int i = 0; i < meuEstoque.size(); i++) {
            Estoque E = meuEstoque.get(i);
            System.out.println(E.getProduto());
        }






    }


}
