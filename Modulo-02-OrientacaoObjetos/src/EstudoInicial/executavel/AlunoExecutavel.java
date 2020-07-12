package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;

import javax.swing.*;

public class AlunoExecutavel {

    public static void main(String[] args){

        // New Aluno() é uma instância (Criação de objeto);

        Aluno aluno1 = new Aluno("Maria");
        aluno1.setNota1(90);
        aluno1.setNota2(80.8);
        aluno1.setNota3(74);

        System.out.println(aluno1.getNome());
        System.out.println("A nota média do aluno é : " + aluno1.getMediaNota());

        if(aluno1.getAlunoAprovado() == true){
            JOptionPane.showMessageDialog(null, "Aluno Aprovado.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Aluno Reprovado");
        }

        Aluno aluno2 = new Aluno("Joao", 30);

        System.out.println(aluno2.getNome());

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Jose");
        aluno3.setIdade(44);
        aluno3.setDataNascimento("20.01");

        System.out.println(aluno3.getNome() + " " + aluno3.getIdade());

    }
}
