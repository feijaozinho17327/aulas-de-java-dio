package edu.noen.poo.exercicios.list.exercicio03;

public class Controle {

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();


        catalogoLivros.adicionarLivro("Karl Marx", "O Capital", 2014);
        catalogoLivros.adicionarLivro("Miguel de Cervantes", "Dom Quixote", 1605);
        catalogoLivros.adicionarLivro("George Orwell", "1984", 1949);
        catalogoLivros.adicionarLivro("George Orwell", "A Revolução dos Bichos", 1945);
        catalogoLivros.adicionarLivro("Sun Tzu", "A Arte da Guerra", -500);
        catalogoLivros.adicionarLivro("J.R.R. Tolkien", "O Senhor dos Anéis", 1954);
        catalogoLivros.adicionarLivro("Gabriel García Márquez", "Cem Anos de Solidão", 1967);
        catalogoLivros.adicionarLivro("James Joyce", "Ulisses", 1922);
        catalogoLivros.adicionarLivro("Antoine de Saint-Exupéry", "O Pequeno Príncipe", 1943);
        catalogoLivros.adicionarLivro("Franz Kafka", "A Metamorfose", 1915);



        System.out.println("pesquisa por autor:");

        catalogoLivros.pesquisarPorAutor("George Orwell");

        System.out.println("\npesquisa por ano:");

        catalogoLivros.pesquisarPorIntervaloAnos(1900, 2000);

        System.out.println("\npesquisa por titulo:");

        catalogoLivros.pesquisarPorTitulo("O Capital");


    }


}
