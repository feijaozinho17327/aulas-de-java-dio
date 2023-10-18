package edu.noen.poo.exercicios.list.exercicio01;

public class Controle {


    public static void main(String [] args) {

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Primeira tarefa");
        lista.adicionarTarefa("Segunda Tarefa");
        lista.adicionarTarefa("Terceira Tarefa");
        lista.adicionarTarefa("Tarefa a Ser Removida");
        lista.adicionarTarefa("Tarefa a Ser Removida");

        System.out.println("tarefas antes da remoção:");
        lista.exibirTarefas();

        System.out.println("quantidade antes da remoção:");
        System.out.println(lista.quantificarTarefas());

        lista.removerTarefa("Tarefa a Ser Removida");

        System.out.println("\n tarefas depois da remoção:");
        lista.exibirTarefas();

        System.out.println("quantidade depois da remoção:");
        System.out.println(lista.quantificarTarefas());


    }

}
