package edu.noen.poo.exercicios.set.exercicio05;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    private Set<Tarefa> tarefaSet;


    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao, false);
        tarefaSet.add(novaTarefa);
    }



    public void removerTarefa(String descricao) {

        Set<Tarefa> tarefaParaRemover = new HashSet<>();

        for (Tarefa t : tarefaSet) {

            if (t.getDescricao().equals(descricao)) {

                tarefaParaRemover.add(t);
            }
        }

        for (Tarefa tarefa : tarefaParaRemover) {
            tarefaSet.remove(tarefa);
        }


    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }


    public void contarTarefas() {
        System.out.println("quantidade de tarefas:");
        System.out.println(tarefaSet.size());
    }


    public Set<Tarefa> obterTarefasConcluidas() {

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {

            if (t.getStatus() == true) {

                tarefasConcluidas.add(t);
            }

        }

        return tarefasConcluidas;

    }

    public Set<Tarefa> obterTarefasNaoConcluidas() {

        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {

            if (!t.isStatus()) {

                tarefasNaoConcluidas.add(t);
            }

        }

        return tarefasNaoConcluidas;

    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa t : tarefaSet) {



                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (t.getStatus() == true) {

                        System.out.println("tarefa já marcada como concluida.");

                    }
                    t.setStatus(true);

                }


        }
    }

    public void marcarTarefaPendente(String descricao) {

        for (Tarefa t : tarefaSet) {



            if (t.getDescricao().equalsIgnoreCase(descricao)) {

                if (t.getStatus() == false) {

                    System.out.println("tarefa já marcada como pendente.");

                }


                t.setStatus(false);

            }


        }
    }

    public void limparListaTarefas() {

        tarefaSet.removeAll(tarefaSet);

    }

}
