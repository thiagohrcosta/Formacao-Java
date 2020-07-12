package EstudoInicial.classes;

import java.util.Date;

public class Aluno {

    String nome;
    int idade;

    // Neste momento do curso utilizou-se a String para dataNascimento;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;

    private double nota1;
    private double nota2;
    private double nota3;

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


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /* Método que retorna a média do aluno */

    public double getMediaNota(){
        return ((nota1 + nota2 + nota3) / 3);
    }
}

