package edu.noen.poo.exercicios.set.exercicio05;

import java.util.Objects;

public class Tarefa {

    private final String descricao;

    private boolean status;


    public Tarefa(String descricao, Boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", status=" + status +
                '}';
    }

    public boolean getStatus(){
        return status;

    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
