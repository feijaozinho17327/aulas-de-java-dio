package edu.noen.poo.exercicios.list.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasParaRemover = new ArrayList<>() ;

        for(Tarefa tarefa : tarefaList) {

            if (tarefa.getDescricao().equals(descricao)) {

                tarefasParaRemover.add(tarefa);

            }


        }

        tarefaList.removeAll(tarefasParaRemover);

    }


    public int quantificarTarefas() {

     return tarefaList.size();



    }


    public void exibirTarefas() {

        for (Tarefa list : tarefaList) {

            System.out.println(list.getDescricao());

        }


    }

}


