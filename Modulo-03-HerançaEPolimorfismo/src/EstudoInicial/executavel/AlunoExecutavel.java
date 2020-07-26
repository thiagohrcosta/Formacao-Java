package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class AlunoExecutavel {

    public static void main(String[] args){

        // New Aluno() é uma instância (Criação de objeto);


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






    }
}
