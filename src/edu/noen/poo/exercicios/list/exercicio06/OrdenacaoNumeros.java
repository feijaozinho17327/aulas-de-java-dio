package edu.noen.poo.exercicios.list.exercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Numero> numeroList = new ArrayList<>();



    void adicionarNumero(int numero) {

        numeroList.add(new Numero(numero));


    }

    void ordenarAscendente() {

        Collections.sort(numeroList);

        for (Numero n: numeroList) {

            System.out.println(n.getNumero());
        }


    }

    void ordenarDescendente() {

        Collections.sort(numeroList, Collections.reverseOrder());

        for (Numero n: numeroList) {

            System.out.println(n.getNumero());
        }

    }






}
