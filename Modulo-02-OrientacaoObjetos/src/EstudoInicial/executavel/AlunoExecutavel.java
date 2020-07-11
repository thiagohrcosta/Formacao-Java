package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;

public class AlunoExecutavel {

    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Maria");

        System.out.println(aluno1.getNome());

        Aluno aluno2 = new Aluno("Joao", 30);

        System.out.println(aluno2.getNome());


    }
}
