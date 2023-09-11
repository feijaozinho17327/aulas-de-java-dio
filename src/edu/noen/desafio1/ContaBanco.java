package edu.noen.desafio1;

import java.util.concurrent.Callable;

public class ContaBanco {

    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.digitarInformacoes(1);


        System.out.println("numero: " + contaTerminal.numeroConta + "\n");
        System.out.println("agencia: " + contaTerminal.agencia + "\n");
        System.out.println("nome: " + contaTerminal.nomeCliente + "\n");
        System.out.println("saldo: " + contaTerminal.saldo + "\n");








    }


}