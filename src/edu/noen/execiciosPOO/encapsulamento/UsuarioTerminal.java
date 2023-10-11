package edu.noen.execiciosPOO.encapsulamento;


public class UsuarioTerminal {


    public static void main(String[] args) {


   ContaBancaria conta = new ContaBancaria();

        System.out.println("numero da conta: "+ conta.getNumeroConta());
        System.out.println("titular: "+ conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        conta.escolherOpcao();







    }


}