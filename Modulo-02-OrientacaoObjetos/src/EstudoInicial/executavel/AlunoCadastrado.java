package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;
import EstudoInicial.classes.Disciplinas;
import constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoCadastrado {

    public static void main(String[] args){

        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();

        for(int qtd = 1; qtd <= 5; qtd++){

            String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
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

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
            if(escolha == 0){

                int continuarRemover = 0;

                while (continuarRemover == 0){
                    String disciplinaRemover = JOptionPane.showInputDialog("Quando a disciplina a ser removida ?" );
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                }

            }
            alunos.add(aluno1);
        }

        for(Aluno aluno: alunos){
            if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
                alunosAprovados.add(aluno);
            }
            else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
                    alunosRecuperacao.add(aluno);
            }
            else{
                alunosReprovados.add(aluno);  /*  Alunos reprovados StatusAluno.Reprovado) */
            }
        }

        System.out.println("----------------------- Lista dos aprovados -----------------------");
        for(Aluno aluno: alunosAprovados){
            System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }

        System.out.println("----------------------- Lista dos reprovados -----------------------");
        for(Aluno aluno: alunosReprovados){
            System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }

        System.out.println("----------------------- Lista dos em recuperação -----------------------");
        for(Aluno aluno: alunosRecuperacao){
            System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }




    }


    }
