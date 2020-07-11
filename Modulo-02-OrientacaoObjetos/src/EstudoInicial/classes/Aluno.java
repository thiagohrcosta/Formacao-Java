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

    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
