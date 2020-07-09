package tiposEVariaveis;

public class TipoString {

    public static void main(String[] args){

        String nome = "João";
        String sobrenome = "da Silva";

        String nomeCompleto = nome + " " + sobrenome;

        String logradouro = "Avenida 1";
        String numeroLogradouro = "10";
        String bairro = "São João";

        String enderecoCompleto = logradouro + " " + numeroLogradouro + " " + bairro;

        System.out.println(nomeCompleto + " " + enderecoCompleto);

    }
}
