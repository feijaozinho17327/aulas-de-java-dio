package edu.noen.sintaxeBasica.argumentos;

        public class Argumentos {


            public static void main (String[] args) {

                String nome = args[0];
                String sobrenome = args[1];
                int idade = Integer.valueOf(args[2]);

                System.out.println("Nome: " + nome + " " + sobrenome + "\n");
                System.out.println("Idade: " + idade);


            }
}