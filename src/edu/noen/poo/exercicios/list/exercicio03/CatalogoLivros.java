package edu.noen.poo.exercicios.list.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {


    List<Livro> livroList = new ArrayList<>();


    public CatalogoLivros() {

        this.livroList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public void pesquisarPorAutor(String autor) {
        boolean encontrado = false;
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(l.getAutor() + " " + l.getTitulo() + " " + l.getAno());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado do autor: " + autor);
        }
    }


    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        boolean encontrado = false;
        for (Livro l : livroList) {


            if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {

                System.out.println(l.getAutor() + " "
                        + l.getTitulo() + " "
                        + l.getAno());

                encontrado = true;

            }

        }
        if (!encontrado) {
            System.out.println("livro nessas datas não encontrado");
        }
    }

    public void pesquisarPorTitulo(String titulo) {
        boolean encontrado = false;

        for (Livro l : livroList) {

            if (l.getTitulo().equals(titulo)) {

                System.out.println(l.getAutor() + " "
                        + l.getTitulo() + " "
                        + l.getAno());
                encontrado = true;

            }

        }
        if (!encontrado) {

            System.out.println("livro do titulo " + titulo + " não encontrado");
        }
    }


}
