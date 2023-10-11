package edu.noen.excecoesLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturasExcepcionais {

    public static void main(String[] args) {


        while (true) {

            try {
                Scanner scan = new Scanner(System.in);

                System.out.println("nome");
                String nome = scan.next();

                System.out.println("sobrenome");
                String sobrenome = scan.next();

                System.out.println("idade");
                int idade = scan.nextInt();

                System.out.println("altura");
                double altura = scan.nextDouble();

                System.out.println("nome completo:" + nome.toUpperCase() + " " + sobrenome + "\n");
                System.out.println("idade: " + idade);
                System.out.println("altura: " + altura);
                scan.close();
                break;

            } catch (InputMismatchException e) {

                System.out.println("formato invalido");

            }
        }


    }

}