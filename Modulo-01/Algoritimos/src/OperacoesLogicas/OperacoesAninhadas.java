package OperacoesLogicas;

public class OperacoesAninhadas {

    public static void main(String[] args){

        int nota1 = 0;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 5;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Operações lógicas aninhadas são aquelas realizadas
        // dentro de outras operações

        if(media >= 5){
            if(media >= 7){
                System.out.println("Aluno automaticamente aprovado");
            }
            else{
                System.out.println("Aluno em recuperação");
            }
        }else{
            System.out.println("Reprovado");
        }

    }

}
