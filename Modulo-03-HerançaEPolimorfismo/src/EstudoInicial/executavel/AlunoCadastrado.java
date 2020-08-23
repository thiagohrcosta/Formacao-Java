package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;
import EstudoInicial.classes.Diretor;
import EstudoInicial.classes.Disciplinas;
import EstudoInicial.classes.Secretario;
import EstudoInicial.interfaces.PermitirAcesso;
import classesAuxiliares.FuncaoAutenticacao;
import constantes.StatusAluno;
import excessao.ExcessaoProcessarNota;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AlunoCadastrado {

    public static void main(String[] args) {

        try {

            try{
                File file = new File("lines.txt");
                Scanner scanner = new Scanner(file);
            }
            catch(FileNotFoundException e){
               throw new ExcessaoProcessarNota("Erro ao processar o arquivo de notas do aluno");
            }


            String login = JOptionPane.showInputDialog("Informe o login:");
            String senha = JOptionPane.showInputDialog("Informe a senha:");

            if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) { /* Travar o contrato para autorizar somente quem tem o "contrato" legítimo" */

                List<Aluno> alunos = new ArrayList<Aluno>();

                // HASHMAP é uma lista que dentro dela há uma chave que identifica
                // Uma sequência de valores
                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


                List<Aluno> alunosAprovados = new ArrayList<Aluno>();
                List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
                List<Aluno> alunosReprovados = new ArrayList<Aluno>();

                for (int qtd = 1; qtd <= 2; qtd++) {

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

                    for (int pos = 1; pos <= qtdMaterias; pos++) {
                        String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + pos + " : ");
                        String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina " + pos + " : ");
                        Disciplinas disciplinas = new Disciplinas();

                        disciplinas.setDisciplina(nomeDisciplina);
                        disciplinas.setNota(Double.valueOf(notaDisciplina));

                        aluno1.getDisciplinas().add(disciplinas);

                    }

                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
                    if (escolha == 0) {

                        int continuarRemover = 0;

                        while (continuarRemover == 0) {
                            String disciplinaRemover = JOptionPane.showInputDialog("Quando a disciplina a ser removida ?");
                            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
                            continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                        }

                    }
                    alunos.add(aluno1);
                }

                maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
                maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
                maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());


                for (Aluno aluno : alunos) {
                    if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                        maps.get(StatusAluno.APROVADO).add(aluno);
                    } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                        maps.get(StatusAluno.RECUPERACAO).add(aluno);
                    } else {
                        maps.get(StatusAluno.REPROVADO).add(aluno);
                    }
                }

                System.out.println("----------------------- Lista dos aprovados -----------------------");
                for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                    System.out.println("Resultado = " +aluno.getNome() + " - " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
                }

                System.out.println("----------------------- Lista dos reprovados -----------------------");
                for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                    System.out.println("Resultado = " +aluno.getNome() + " - " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
                }

                System.out.println("----------------------- Lista dos em recuperação -----------------------");
                for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println("Resultado = " +aluno.getNome() + " - " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha ou login inválidos");
            }


        } catch (NumberFormatException e) {

            StringBuilder saida = new StringBuilder();

            e.printStackTrace(); /* Imprime erro no console Java */

            /* Mensagem do erro ou sua causa */
            System.out.println("Mensagem: " + e.getMessage());

            for(int i = 0; i < e.getStackTrace().length; i++){
              saida.append("\n Classe de erro : " + e.getStackTrace()[i].getClassName());
              saida.append("\n Método de erro : " + e.getStackTrace()[i].getMethodName());
              saida.append("\n Linha de erro : " + e.getStackTrace()[i].getLineNumber());

            }

            JOptionPane.showMessageDialog(
                    null,
                    "Erro de conversão de número" + saida.toString());
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO: Null pointer exception!!! " + e.getClass());
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Erro inesperado : " + e.getClass().getName()
            );
        }
        finally {
            /* Sempre é executado ocorrendo erros ou não */
            JOptionPane.showMessageDialog(null, "Testes realizados");

        }
    }



}
