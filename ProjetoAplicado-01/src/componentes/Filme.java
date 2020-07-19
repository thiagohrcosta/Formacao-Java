package componentes;

public class Filme {

    private String nome;
    private int faixaEtaria;
    private static double lancamento = 1.5;
    private static double classico = 1.2;
    private double preco;

    public Filme() {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
        this.preco = preco;
        this.lancamento = lancamento;
        this.classico = classico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaixaEtaria(Integer integer) {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public static double getLancamento() {
        return lancamento;
    }

    public static void setLancamento(double lancamento) {
        Filme.lancamento = lancamento;
    }

    public static double getClassico() {
        return classico;
    }

    public static void setClassico(double classico) {
        Filme.classico = classico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "filme{" +
                "nome='" + nome + '\'' +
                ", faixaEtaria=" + faixaEtaria +
                ", preco=" + preco +
                '}';
    }
}



