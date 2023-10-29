package edu.noen.poo.exercicios.list.exercicio05;

public class Controle {


    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();


        ordenacaoPessoas.adicionarPessoa("Noen", 20, 1.78);
        ordenacaoPessoas.adicionarPessoa("Jade", 27, 1.60);
        ordenacaoPessoas.adicionarPessoa("Reila", 26, 1.50);
        ordenacaoPessoas.adicionarPessoa("Sophi", 30, 1.67);


        System.out.println("--------");

        for (Pessoa p : ordenacaoPessoas.pessoaList) {

            System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getAltura());


        }
        System.out.println("--------");

        ordenacaoPessoas.comparaIdade();
        
        System.out.println("--------");

        ordenacaoPessoas.comparaAltura();


    }

}
