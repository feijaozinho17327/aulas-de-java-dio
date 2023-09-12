package edu.noen.desafio1;

import java.util.Scanner;

public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldo = 00.00f;

    private void verificarNome(String verificaNome) {

        if (verificaNome.matches("[A-Z][a-z]*( [A-Z][a-z]*)+")) {

            this.nomeCliente = verificaNome;

            digitarInformacoes(2);

        } else {
            System.out.println("A entrada não é um número válido. Tente novamente. ");

            digitarInformacoes(1);

        }

    }

    private void verificarNumero(String verificaNumeroConta) {

        if (verificaNumeroConta.matches("\\d+")) {
            if (verificaNumeroConta.length() == 4) {
                this.numeroConta = Integer.parseInt(verificaNumeroConta);
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

    private void verificarFormatarAgencia(String verificaFormataAgencia) {

        if (verificaFormataAgencia.matches("\\d+")) {

            if (verificaFormataAgencia.length() == 4) {

                this.agencia = verificaFormataAgencia.substring(0, 3) + "-" + verificaFormataAgencia.substring(3);
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

    private void verificarSaldo(String verificaSaldo) {

        if (verificaSaldo.matches("^\\d+(\\.\\d{2})?$")) {

            if (verificaSaldo.matches("^\\d{1,5}(\\.\\d{1,2})?$")) {

                this.saldo = Float.parseFloat(verificaSaldo);

                digitarInformacoes(5);

            } else {

                System.out.println("Deposito fora do limite de 99999.99R$");

                digitarInformacoes(4);

            }

        } else if (verificaSaldo.isEmpty()) {

            digitarInformacoes(5);

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

            System.out.println("digite seu nome \n ex: Jose Silva");
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

            System.out.println("REGISTRO COMPLETO \n BEM-VINDO!!! \n\n");
            scan.close();
            aux++;



        }

    }

    public void exibirInformacoes() {

        System.out.println("nome completo: " + nomeCliente + "\n");
        System.out.println("numero da conta: " + numeroConta + "\n");
        System.out.println("agencia: " + agencia + "\n");
        System.out.println("saldo: " + saldo + "\n");

    }

}
