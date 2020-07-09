package OperacoesLogicas;

public class SwitchCase {

    public static void main(String[] args){

        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 5;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        int diaDaSemana = 4;

        switch(diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            default: System.out.println("Outro dia da semana");
            break;
        }
        /* Switch case serve para operações exatas */

        switch(media){
            case 7:
                System.out.println("Aluno aprovado" + media);
                break;
            case 5:
                System.out.println("Aluno reprovado");
            default: System.out.println("Outro valor " + media);
                break;
        }
    }
}
