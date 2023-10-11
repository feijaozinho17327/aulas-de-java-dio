package edu.noen.execiciosPOO.polimorfismo;

public class Controle {

    public static void main(String[] args) {


    FormaGeometrica circulo = new Circulo(434);
    FormaGeometrica quadrilatero = new Quadrilatero(32, 23);

        System.out.println("area do circulo " + circulo.calcularArea());
        System.out.println("area do quadrado " + quadrilatero.calcularArea());
    }


}