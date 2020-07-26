package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;

public class EqualsHashCodeAlunoExecutavel {

    public static void main(String[] args){


        /* Equals and HashCode
        *  O objetivo é diferenciar objetos
        */

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Thiago");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Thiago");

        if(aluno1.equals(aluno2)){
            System.out.println("Alunos são iguais");
        }
        else{
            System.out.println("Alunos são diferentes");
        }
    }
}
