package edu.noen.poo.exercicios.list.exercicio06;



public class Controle {

    public static void main(String [] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();


        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);

        ordenacaoNumeros.ordenarAscendente();

        System.out.println("---------");

        ordenacaoNumeros.ordenarDescendente();






    }


}
