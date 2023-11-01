package edu.noen.poo.exercicios.list.exercicio03;

public class Livro {

    private final String autor;
    private final String titulo;
    private final int ano;

    public Livro(String autor, String titulo, int ano) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }


}
