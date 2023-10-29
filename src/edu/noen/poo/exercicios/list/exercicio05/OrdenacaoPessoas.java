package edu.noen.poo.exercicios.list.exercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoaList = new ArrayList<>();


    void adicionarPessoa(String nome, int idade, double altura) {

        pessoaList.add(new Pessoa(nome, idade, altura));

    }


    public void comparaIdade() {

        Collections.sort(pessoaList);

        for (Pessoa p : pessoaList) {

            System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getAltura());

        }


    }

    public void comparaAltura() {

        Collections.sort(pessoaList, new OrdenaAltura());
        for (Pessoa p : pessoaList) {

            System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getAltura());

        }

    }

}

