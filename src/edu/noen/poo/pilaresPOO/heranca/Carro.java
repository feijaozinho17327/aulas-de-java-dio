package edu.noen.poo.pilaresPOO.heranca;

public class Carro extends Veiculo{



    private int cavalos;

    Carro(String marca, String modelo, int ano, int cavalos) {

        super(marca, modelo, ano);
        this.cavalos = cavalos;

    }
    public int getCavalos() {
        return cavalos;
    }

}
