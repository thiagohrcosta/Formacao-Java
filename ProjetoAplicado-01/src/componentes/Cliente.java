package componentes;

public class Cliente {

    private String nome;
    private int idade;
    private int vip;
    private int autorizacao;

    public Filme filmeAlugado;

    public Cliente() {

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

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(int autorizacao) {
        this.autorizacao = autorizacao;
    }

    public Filme getFilmeAlugado() {
        return filmeAlugado;
    }

    public void setFilmeAlugado(Filme filmeAlugado) {
        this.filmeAlugado = filmeAlugado;
    }
}
