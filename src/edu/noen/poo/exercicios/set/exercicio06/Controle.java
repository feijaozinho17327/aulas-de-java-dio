package edu.noen.poo.exercicios.set.exercicio06;

public class Controle {

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Paulo", 12533,6);
        gerenciadorAlunos.adicionarAluno("Paola", 12534,10);
        gerenciadorAlunos.adicionarAluno("Ana", 12535,8);
        gerenciadorAlunos.adicionarAluno("Ana Paula", 12536,3);
        gerenciadorAlunos.adicionarAluno("Marta", 12537,7);
        gerenciadorAlunos.removerAluno(12533);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());


    }


}
