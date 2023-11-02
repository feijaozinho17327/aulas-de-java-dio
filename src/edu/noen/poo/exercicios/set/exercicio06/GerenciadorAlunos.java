package edu.noen.poo.exercicios.set.exercicio06;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota) {

        alunoSet.add(new Aluno(nome,matricula,nota));
    }

    public void removerAluno(int matricula) {

        Set<Aluno> alunoParaRemover = new HashSet<>();

        for(Aluno a: alunoSet) {
            if(a.getMatricula() == matricula) {

                alunoParaRemover.add(a);


            }


        }
     alunoSet.removeAll(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {

        Set<Aluno> realocaAluno = new TreeSet<>(alunoSet);

        return realocaAluno;

    }

    public Set<Aluno> exibirAlunosPorNota() {

        Set<Aluno> realocaNota = new TreeSet<>(new ComparatorPorNota());

        realocaNota.addAll(alunoSet);

        return realocaNota;

    }

    public void exibirAlunos(){

        System.out.println(alunoSet);
    }
}

