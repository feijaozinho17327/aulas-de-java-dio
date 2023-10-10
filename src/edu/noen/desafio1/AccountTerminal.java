package edu.noen.desafio1;

import java.util.Scanner;

public class  {

    private int accountId;
    private String agency;
    private String customerName;
    private float balance = 00.00f;

    private void validateName(String checkName) {

        if (checkName.matches("[A-Z][a-z]*( [A-Z][a-z]*)+")) {

            this.customerName = checkName;

            enterInformation(2);

        } else {
            System.out.println("A entrada não é um nome válido. Tente novamente.");

            enterInformation(1);

        }

    }

    private void validateAccountId(String checkAccountId) {

        if (checkAccountId.matches("\\d+")) {
            if (checkAccountId.length() == 4) {
                this.accountId = Integer.parseInt(checkAccountId);
                enterInformation(3);
            } else {
                System.out.println("O número deve conter exatamente 4 dígitos. Tente novamente.");

                enterInformation(2);

            }
        } else {
            System.out.println("A entrada não é um número válido. Tente novamente.");

            enterInformation(2);

        }

    }

    private void validateFormatAgency(String checkAgency) {

        if (checkAgency.matches("\\d+")) {

            if (checkAgency.length() == 4) {

                this.agency = checkAgency.substring(0, 3) + "-" + checkAgency.substring(3);
                enterInformation(4);
            } else {
                System.out.println("O número deve conter exatamente 4 dígitos. Tente novamente.");

                enterInformation(3);

            }

        } else {
            System.out.println("A entrada não é um número válido. Tente novamente.");

            enterInformation(3);

        }

    }

    private void validateBalance(String checkBalance) {

        if (checkBalance.matches("^\\d+(\\.\\d{2})?$")) {

            if (checkBalance.matches("^\\d{1,5}(\\.\\d{1,2})?$")) {

                this.balance = Float.parseFloat(checkBalance);

                enterInformation(5);

            } else {

                System.out.println("Depósito fora do limite de 99999.99R$");

                enterInformation(4);

            }

        } else if (checkBalance.isEmpty()) {

            enterInformation(5);

        } else {
            System.out.println("A entrada não é um número válido. Tente novamente.");

            enterInformation(4);
        }

    }

    public void enterInformation(int aux) {

        Scanner scan = new Scanner(System.in);

        String inputAccount;
        String inputAgency;
        String inputName;
        String inputBalance;

        while (aux == 1) {

            System.out.println("Digite seu nome \n ex: José Silva");
            inputName = scan.nextLine();

            validateName(inputName);
            break;

        }

        while (aux == 2) {
            System.out.println("Digite o número da conta");
            inputAccount = scan.nextLine();

            validateAccountId(inputAccount);

            break;
        }

        while (aux == 3) {
            System.out.println("Digite o número da agência");
            inputAgency = scan.nextLine();

            validateFormatAgency(inputAgency);

            break;
        }

        while (aux == 4) {
            System.out.println("Digite o depósito");
            inputBalance = scan.nextLine();

            validateBalance(inputBalance);

            break;

        }

        while (aux == 5) {

            System.out.println("REGISTRO COMPLETO \n BEM-VINDO!!! \n\n");
            scan.close();
            aux++;

        }

    }

    public void displayInformation() {


        System.out.println("Nome completo: " + customerName + "\n");
        System.out.println("Número da conta: " + accountId + "\n");
        System.out.println("Agência: " + agency + "\n");
        System.out.println("Saldo: " + balance + "\n");

    }

}
