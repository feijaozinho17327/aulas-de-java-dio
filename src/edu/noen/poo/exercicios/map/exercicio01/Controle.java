package edu.noen.poo.exercicios.map.exercicio01;

public class Controle {

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Noen", 1212343332);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("João", 555123456);
        agendaContatos.adicionarContato("Ana", 888777666);
        agendaContatos.adicionarContato("Pedro", 123456789);
        agendaContatos.adicionarContato("Noen", 2123433321);
        agendaContatos.adicionarContato("Noem", 1212343332);


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Noem"));



    }
}
