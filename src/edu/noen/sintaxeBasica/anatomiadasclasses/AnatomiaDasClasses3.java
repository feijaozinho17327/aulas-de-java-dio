package edu.noen.sintaxeBasica.anatomiadasclasses;

public class AnatomiaDasClasses3 {
    public static void main(String[] args) {
        String primeiroNome = "Kira";
        String segundoNome = "Belmont";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);


        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {


        return "nome completo: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
