package edu.noen.poo.pilaresPOO.polimorfismo;

public class Quadrilatero implements FormaGeometrica{

    private float lado1;

    private float lado2;

    public Quadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public float calcularArea() {

        float area = lado1 * lado2;

        return area;
    }
}
