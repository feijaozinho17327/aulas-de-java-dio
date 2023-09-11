package edu.noen.desafio1;

import java.util.Scanner;


public class ContaTerminal {


    int numeroConta;
    String agencia, nomeCliente;
    float saldo = 0;


    public void verificarNumero(String verificaNumeroConta) {


        if (verificaNumeroConta.matches("\\d+")) {
            if (verificaNumeroConta.length() == 4) {
                numeroConta = Integer.parseInt(verificaNumeroConta);
                digitarInformacoes(3);
            } else {
                System.out.println("O número deve conter exatamente 4 dígitos. Tente novamente.");

                digitarInformacoes(2);

            }
        } else {
            System.out.println("A entrada não é um número válido. Tente novamente.");

            digitarInformacoes(2);

        }


    }

    public void verificarFormatarAgencia(String verificaFormataAgencia) {


        if (verificaFormataAgencia.matches("\\d+")) {

            if (verificaFormataAgencia.length() == 4) {

                agencia = verificaFormataAgencia.substring(0, 3) + "-" + verificaFormataAgencia.substring(3);
                digitarInformacoes(4);
            } else {
                System.out.println("O número deve conter exatamente 4 dígitos. Tente novamente.");

                digitarInformacoes(3);

            }


        } else {
            System.out.println("A entrada não é um número válido. Tente novamente. ");

            digitarInformacoes(3);

        }


    }

    public void verificarNome(String verificaNome) {


        if (verificaNome.matches("[A-Z][a-z]*( [A-Z][a-z]*)+")) {

            nomeCliente = verificaNome;

            digitarInformacoes(2);


        } else {
            System.out.println("A entrada não é um número válido. Tente novamente. ");

            digitarInformacoes(1);

        }


    }

    public void verificarSaldo(String verificaSaldo) {


        if (verificaSaldo.matches("^\\d+(\\.\\d{2})?$")) {

            if (verificaSaldo.matches("^\\d{1,5}(\\.\\d{1,2})?$")) {

                saldo = Float.parseFloat(verificaSaldo);

                digitarInformacoes(5);

            } else {

                System.out.println("Deposito fora do limite");

                digitarInformacoes(4);

            }

        } else {
            System.out.println("A entrada não é um número válido. Tente novamente. ");

            digitarInformacoes(4);
        }


    }


    public void digitarInformacoes(int aux) {


        Scanner scan = new Scanner(System.in);

        String digiConta;
        String digiAgencia;
        String digiNome;
        String digiSaldo;


        while (aux == 1) {

            System.out.println("digite seu nome");
            digiNome = scan.nextLine();

            verificarNome(digiNome);
            break;

        }

        while (aux == 2) {
            System.out.println("digite o numero da conta");
            digiConta = scan.nextLine();

            verificarNumero(digiConta);

            break;
        }

        while (aux == 3) {
            System.out.println("digite o numero na agencia");
            digiAgencia = scan.nextLine();

            verificarFormatarAgencia(digiAgencia);

            break;
        }

        while (aux == 4) {
            System.out.println("digite o deposito");
            digiSaldo = scan.nextLine();

            verificarSaldo(digiSaldo);

            break;


        }

        while (aux == 5) {

            System.out.println("NICE!!!");

            aux = 6;

        }


    }


}
