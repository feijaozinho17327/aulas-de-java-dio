package edu.noen.excecoesLab;

import java.text.NumberFormat;
import java.text.ParseException;

import static java.text.NumberFormat.*;

public class ExemploExcecao {

    public static void main(String[] args) throws ParseException {

        Number valor;
        try {
            valor = getInstance().parse("1g2121");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(valor);



    }



}