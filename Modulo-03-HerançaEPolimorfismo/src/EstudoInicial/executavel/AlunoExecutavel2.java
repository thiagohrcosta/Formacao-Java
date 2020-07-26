package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;

import javax.swing.*;

public class AlunoExecutavel2 {

    public static void main(String[] args){



        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade?");
        String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a data de nascimento?");
        String registroGeralAluno = JOptionPane.showInputDialog("Qual o Registro geral?");
        String cpfAluno = JOptionPane.showInputDialog("Qual o CPF do aluno?");
        String nomeMaeAluno = JOptionPane.showInputDialog("Qual o nome da mãe");

        // Notas do Aluno
        String nota1Aluno = JOptionPane.showInputDialog("Nota 1: ");
        String nota2Aluno = JOptionPane.showInputDialog("Nota 2: ");
        String nota3Aluno = JOptionPane.showInputDialog("Nota 3: ");

        Aluno aluno1 = new Aluno();

        //Definindo nome do aluno
        aluno1.setNome(nome);

        // Convertendo a idade para INT
        aluno1.setIdade(Integer.valueOf(idade));

        // Definindo data de nascimento
        aluno1.setDataNascimento(dataNascimentoAluno);

        // Definindo o RG
        aluno1.setRegistroGeral(registroGeralAluno);

        // Definindo CPF
        aluno1.setNumeroCpf(cpfAluno);

        // Definindo nome da mãe
        aluno1.setNomeMae(nomeMaeAluno);

        // Definindo as notas do Aluno
        //aluno1.setNota1(Double.parseDouble(nota1Aluno));
        //aluno1.setNota2(Double.parseDouble(nota2Aluno));
        //aluno1.setNota3(Double.parseDouble(nota3Aluno));


        System.out.println(aluno1.toString());
        System.out.println("Média do aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado());


    }
}
