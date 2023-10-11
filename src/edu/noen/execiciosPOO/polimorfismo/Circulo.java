package edu.noen.execiciosPOO.polimorfismo;

public class Circulo implements FormaGeometrica{

    private float raio;
    final float pi = 3.14f;

    public Circulo(float raio) {
        this.raio = raio;
    }
    public float calcularArea() {

        float area = pi * (raio * raio);

        return area;



    }


    }

