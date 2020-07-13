package EstudoInicial.classes;

import java.util.Date;
import java.util.Objects;

public class Aluno {

    String nome;
    int idade;

    // Neste momento do curso utilizou-se a String para dataNascimento;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;

    private Disciplinas disciplinas = new Disciplinas();

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public Aluno(){

    }

    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
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
        return (disciplinas.getNota1()
                + disciplinas.getNota2()
                + disciplinas.getNota3()) / 3;
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
}

