package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;
import EstudoInicial.classes.Disciplinas;

import javax.swing.*;

public class AlunoCadastrado {

    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade?");
        String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a data de nascimento?");
        String registroGeralAluno = JOptionPane.showInputDialog("Qual o Registro geral?");
        String cpfAluno = JOptionPane.showInputDialog("Qual o CPF do aluno?");
        String nomeMaeAluno = JOptionPane.showInputDialog("Qual o nome da mãe");

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

        // Instanciando disciplinas e adicionando na lista
        Disciplinas disciplinas1 = new Disciplinas();
        disciplinas1.setDisciplina("Banco de Dados");
        disciplinas1.setNota(9);

        aluno1.getDisciplinas().add(disciplinas1);

        Disciplinas disciplinas2 = new Disciplinas();
        disciplinas2.setDisciplina("Desenvolvimento Java");
        disciplinas2.setNota(10);

        aluno1.getDisciplinas().add(disciplinas2);

        Disciplinas disciplinas3 = new Disciplinas();
        disciplinas3.setDisciplina("Programação com React");
        disciplinas3.setNota(10);

        aluno1.getDisciplinas().add(disciplinas3);

        System.out.println(aluno1);
        System.out.println("Média do aluno : " + aluno1.getMediaNota());
        System.out.println("Resultado : " + aluno1.getAlunoAprovado());
    }


    }
