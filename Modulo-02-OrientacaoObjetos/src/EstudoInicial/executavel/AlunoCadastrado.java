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

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimentoAluno);
        aluno1.setRegistroGeral(registroGeralAluno);
        aluno1.setNumeroCpf(cpfAluno);
        aluno1.setNomeMae(nomeMaeAluno);

        String materias = JOptionPane.showInputDialog("Digite o número de matérias para cadastrar: ");
        Double qtdMaterias = Double.valueOf(materias);

        for (int pos = 1; pos <= qtdMaterias; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + pos + " : ");
            String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina " + pos + " : ");
            Disciplinas disciplinas = new Disciplinas();

            disciplinas.setDisciplina(nomeDisciplina);
            disciplinas.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplinas);

        }



        System.out.println(aluno1);
        System.out.println("Média do aluno : " + aluno1.getMediaNota());
        System.out.println("Resultado : " + aluno1.getAlunoAprovado());
    }


    }
