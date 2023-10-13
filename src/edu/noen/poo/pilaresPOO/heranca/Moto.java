package edu.noen.poo.pilaresPOO.heranca;

public class Moto extends Veiculo{



    private int cilindradas;

    Moto(String marca, String modelo, int ano, int cilindradas) {

        super(marca, modelo, ano);
        this.cilindradas = cilindradas;


    }

    public int getCilindradas() {
        return cilindradas;
    }


}
