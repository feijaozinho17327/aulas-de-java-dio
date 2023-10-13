package edu.noen.poo.pilaresPOO.abstracao;

public class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("O cachorro latiu");
    }

    @Override
    public void dormir() {
        System.out.println("dormindo");
    }
}
