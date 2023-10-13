package edu.noen.sintaxeBasica.repeticaoLab;

public class testeRepeticao {


    public static void main(String[] args) {

        String alunos[] = {"AAA", "BBB", "CCC", "DDD"};


        for (String aluno : alunos) {


            System.out.println(aluno + "\n");


        }

        for(int i=0; i < 10; i++) {

            if(i == 5)
                break;

            System.out.println(i);



        }


    }


}