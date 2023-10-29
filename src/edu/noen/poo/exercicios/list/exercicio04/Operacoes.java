package edu.noen.poo.exercicios.list.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Operacoes {

    List<Numeros> numerosList = new ArrayList<>();


    void Operadores(){

        this.numerosList = new ArrayList<>();

    }


    void adicionarNumero(int numero) {

        numerosList.add(new Numeros(numero));

    }

    int calcularSoma() {

        int soma = 0;

       for (Numeros n : numerosList) {

           soma += n.getNumero();


       }

        return soma;
    }

    int encontrarMaiorNumero() {

        int aux = 0;

        for (Numeros n : numerosList) {

            if(n.getNumero() >= aux) {

                aux = n.getNumero();

            }

        }

        return aux;

    }

    int encontrarMenorNumero() {

        int aux = 0;

        for (Numeros n : numerosList) {

            if(n.getNumero() <= aux) {

                aux = n.getNumero();

            }

        }

        return aux;

    }


    void exibirNumeros() {

        for (Numeros n : numerosList) {

            System.out.println(n.getNumero());

        }

    }


}





