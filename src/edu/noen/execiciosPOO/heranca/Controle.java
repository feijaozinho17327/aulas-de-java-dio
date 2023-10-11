package edu.noen.execiciosPOO.heranca;

public class Controle {

    public static void main(String[] args){

      Carro carro1 = new Carro("Fiat","uno",2008, 60);
      Moto moto1 = new Moto("Honda", "pop-100", 2008, 109);


        System.out.println("CARRO 1: \n");

        System.out.println("marca: " + carro1.getMarca());
        System.out.println("modelo: " + carro1.getModelo());
        System.out.println("ano: " + carro1.getAno());
        System.out.println("cavalos:" + carro1.getCavalos());

        System.out.println("---------------");

        System.out.println("MOTO 1: \n");

        System.out.println("marca: " + moto1.getMarca());
        System.out.println("modelo: " + moto1.getModelo());
        System.out.println("ano: " + moto1.getAno());
        System.out.println("cilindradas: " + moto1.getCilindradas());

    }
}