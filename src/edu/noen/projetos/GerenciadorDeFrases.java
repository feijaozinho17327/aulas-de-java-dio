package edu.noen.projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeFrases {

    public static void main(String[] args) {
        ArrayList<String> bancoDeDados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Digitar uma mensagem");
            System.out.println("2. Exibir mensagens");
            System.out.println("3. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite algo:");
                    scanner.nextLine(); // Limpa o buffer do Enter
                    String mensagem = scanner.nextLine();
                    bancoDeDados.add(mensagem);
                    System.out.println("Mensagem armazenada com sucesso!");
                    break;
                case 2:
                    System.out.println("Mensagens armazenadas:");
                    for (String msg : bancoDeDados) {
                        System.out.println(msg);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
