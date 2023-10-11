package edu.noen.execiciosPOO.encapsulamento;
import java.util.Scanner;
public class ContaBancaria {

    Scanner scan = new Scanner(System.in);
    private final int numeroConta = 2132331;

    private final String titular = "Noen Belmont";
    private float saldo = 11532.15f;

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void escolherOpcao() {

        int opcao;
        do {
        System.out.println("\n digite as opções: \n1-sacar \n2-depositar \n3-sair");
        opcao = scan.nextInt();


            switch (opcao) {

                case 1:
                    System.out.println("quanto quer sacar?");
                    float saque = scan.nextFloat();

                    if(saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("saldo atual: " + saldo);
                    } else {
                        System.out.println("quantia invalida");
                    }
                    break;
                case 2:
                    System.out.println("quanto quer depositar?");
                    float deposito = scan.nextFloat();

                    saldo = saldo + deposito;
                    System.out.println("saldo atual:" + saldo);
                    break;
                case 3:
                    System.out.println("saindo");
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        }while (opcao != 3);
    }

}
