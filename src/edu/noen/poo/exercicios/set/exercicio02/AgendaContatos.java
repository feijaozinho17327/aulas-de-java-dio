package edu.noen.poo.exercicios.set.exercicio02;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;


    public AgendaContatos() {

        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero) {

        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos() {

        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {

        Set<Contato> contatoParaPesquisar = new HashSet<>();


        for (Contato c: contatoSet) {

            if(c.getNome().startsWith(nome)) {

               contatoParaPesquisar.add(c);

            }


        }
        return contatoParaPesquisar;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;

        for (Contato c: contatoSet) {

            if(c.getNome().equalsIgnoreCase(nome)) {

                c.setNumero(novoNumero);
                contatoAtualizado = c;
               break;
            }

        }
        return contatoAtualizado;

    }
}
