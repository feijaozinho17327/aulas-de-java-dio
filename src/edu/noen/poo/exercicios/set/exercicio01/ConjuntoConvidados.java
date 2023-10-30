package edu.noen.poo.exercicios.set.exercicio01;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {

        this.convidadoSet = new HashSet<>();


    }

    public void adicionarConvidado(String nome, int codigo) {

        convidadoSet.add(new Convidado(nome, codigo));



    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {

        Convidado convidadoParaRemover = null;

        for (Convidado c: convidadoSet) {

            if(c.getCodigo() == codigoConvite) {

                convidadoParaRemover = c;

                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);



    }

    public int contarConvidados() {

        return  convidadoSet.size();


    }

    public void exibirConvidados() {

        System.out.println(convidadoSet);

    }




}
