package edu.noen.poo.exercicios.set.exercicio04;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> palavraSet;


    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {

        palavraSet.add(new Palavra(palavra));


    }

    public void removerPalavra(String palavra) {

        Palavra palavraParaRemover = null;

        for (Palavra p: palavraSet) {

            if(p.getPalavra().equalsIgnoreCase(palavra)) {

                palavraParaRemover = p;
                break;
            }

        }
        palavraSet.remove(palavraParaRemover);
    }

    public Set<Palavra> verificarPalavra(String palavra) {

        Set<Palavra> palavraBuscada = new HashSet<>();

        for(Palavra p: palavraSet) {

            if(p.getPalavra().equalsIgnoreCase(palavra)) {

                palavraBuscada.add(p);
                break;
            }
        }
        return palavraBuscada;
    }

    public void exibirPalavrasUnicas(){

        System.out.println(palavraSet);

    }

}
