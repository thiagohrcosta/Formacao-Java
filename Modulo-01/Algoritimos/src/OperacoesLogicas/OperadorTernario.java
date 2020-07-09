package OperacoesLogicas;

public class OperadorTernario {

    public static void main(String[] args){

        // Operadores ternários são usados para micro validações

        int nota1 = 10;
        int nota2 = 6;
        int nota3 = 8;

        int media = (nota1 + nota2 + nota3) / 3;

        String saidaResultado = media >= 7 ? "Aprovado" : "Reprovado";

        String saidaResultado2 = media >= 7? "Aprovado" : (media >= 4 && media <= 6) ? "Recuperação" : "Reprovado";
        System.out.println(saidaResultado);
        System.out.println(saidaResultado2);

    }
}
