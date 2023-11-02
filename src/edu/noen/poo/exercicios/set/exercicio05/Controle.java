package edu.noen.poo.exercicios.set.exercicio05;

public class Controle {

    public static void main(String[] args) {


        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("estudar ingles");
        listaTarefa.adicionarTarefa("estudar java");
        listaTarefa.adicionarTarefa("trocar a lampada");
        listaTarefa.adicionarTarefa("dar banho no cachorro");
        listaTarefa.adicionarTarefa("tomar remedio");


        listaTarefa.contarTarefas();

        listaTarefa.exibirTarefas();

        listaTarefa.marcarTarefaConcluida("tomar remedio");
        listaTarefa.marcarTarefaConcluida("estudar java");

        System.out.println(listaTarefa.obterTarefasConcluidas());

        System.out.println(listaTarefa.obterTarefasNaoConcluidas());

        listaTarefa.marcarTarefaPendente("estudar java");

        System.out.println(listaTarefa.obterTarefasNaoConcluidas());


        listaTarefa.removerTarefa("estudar java");
        listaTarefa.exibirTarefas();


        System.out.println("limpando lista:");
        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();

    }


}
