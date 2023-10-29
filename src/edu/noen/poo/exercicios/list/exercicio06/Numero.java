package edu.noen.poo.exercicios.list.exercicio06;

public class Numero implements Comparable<Numero> {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int compareTo(Numero numero) {

        return Integer.compare(this.numero, numero.getNumero() );



    }


}
