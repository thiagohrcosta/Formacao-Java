package OperacoesLogicas;

public class IfElse {

    public static void main(String[] args){

        int nota1 = 90;
        int nota2 = 60;
        int nota3 = 70;
        int nota4 = 80;

        int media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 70){
            System.out.println("Aluno Aprovado");
        }
        else if(media >= 60 && media <70){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

        }
    }

