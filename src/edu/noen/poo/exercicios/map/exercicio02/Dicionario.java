package edu.noen.poo.exercicios.map.exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {

        dicionarioMap.put(palavra, definicao);

    }


    public void removerPalavra(String palavra) {

        if(!dicionarioMap.isEmpty()) {

            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {

        System.out.println(dicionarioMap);

    }

    public String pesquisarPorPalavra(String palavra) {

        String definicao = dicionarioMap.get(palavra);

        if(definicao != null) {

            return definicao;
        }
        return "não encontrado.";
    }
}

