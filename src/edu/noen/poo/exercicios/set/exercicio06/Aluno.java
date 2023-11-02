package edu.noen.poo.exercicios.set.exercicio06;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private int matricula;
    private Double nota;

    public Aluno(String nome, int matricula, Double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula() && Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getNota(), aluno2.getNota());
    }
}