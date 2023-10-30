package edu.noen.poo.exercicios.set.exercicio02;

public class Controle {


    public static void main(String[] args) {


        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Ana", 1998605176);
        agendaContatos.adicionarContato("Ana Beatriz", 1998605176);
        agendaContatos.adicionarContato("Bob", 1234567890);
        agendaContatos.adicionarContato("Carol", 987654321);
        agendaContatos.adicionarContato("David", 555555555);
        agendaContatos.adicionarContato("Eva", 999999999);

        agendaContatos.exibirContatos();

        System.out.println("pesquisa por nome: ");
        System.out.println(agendaContatos.pesquisarPorNome("Ana"));


        System.out.println("atualizando numero de contato Ana: ");
        agendaContatos.atualizarNumeroContato("Ana", 1232323244);
        System.out.println(agendaContatos.pesquisarPorNome("Ana"));


    }


}
