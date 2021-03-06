package EstudoInicial.classes;

import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String NomeEscola;
    private String serieMatriculado;

    private List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

    public Aluno(){

    }

    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public double salario() {
        return 1500.90;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public double getMediaNota(){

        double somaNotas = 0.0;

        for(Disciplinas disciplinas : disciplinas){
            somaNotas += disciplinas.getNota();
        }
        return somaNotas / disciplinas.size();
    }
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if(media >= 7){
            return true;
        }
        else{
            return false;
        }
    }

    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if(media >= 5){
            if(media >= 7){
                return StatusAluno.APROVADO;
            }
            else{
                return StatusAluno.RECUPERACAO;
            }
        }
        else{
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }
// Equals hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override /* Identifica método sobrescrito */
    public boolean pessoaMaiorIdade() {
        return idade >= 21;
    }
    public String mensagemMaiorIdade21(){
        return this.pessoaMaiorIdade() ? "Aluno maior de 21 anos" : "Aluno não pode se matricular";
    }
}

