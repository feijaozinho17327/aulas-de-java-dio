package edu.noen.poo.exercicios.list.exercicio03;

public class Controle {

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();


        catalogoLivros.adicionarLivro("O Capital", "Karl Marx", 2014);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogoLivros.adicionarLivro("A Arte da Guerra", "Sun Tzu", -500);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalogoLivros.adicionarLivro("Ulisses", "James Joyce", 1922);
        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("A Metamorfose", "Franz Kafka", 1915);


        System.out.println("pesquisa por autor:");

        catalogoLivros.pesquisarPorAutor("Karl Marx");

        System.out.println("\npesquisa por ano:");

        catalogoLivros.pesquisarPorIntervaloAnos(1900, 2000);

        System.out.println("\npesquisa por titulo:");

        catalogoLivros.pesquisarPorTitulo("O Capital");


    }


}
