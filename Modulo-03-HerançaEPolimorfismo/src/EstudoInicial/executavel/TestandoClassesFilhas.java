package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;
import EstudoInicial.classes.Diretor;
import EstudoInicial.classes.Pessoa;
import EstudoInicial.classes.Secretario;

public class TestandoClassesFilhas {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Thiago - JDev");
        aluno1.setIdade(20);

        Diretor diretor = new Diretor();
        diretor.setNome("Bill Gates");
        diretor.setTitulacao("Mestre");
        diretor.setIdade(50);

        Secretario secretario1 = new Secretario();
        secretario1.setNome("João da Silva");
        secretario1.setExperiencia("Administração");
        secretario1.setIdade(18);

        System.out.println(aluno1);
        System.out.println(diretor);
        System.out.println(secretario1);

        System.out.println(aluno1.pessoaMaiorIdade() + " - " + aluno1.mensagemMaiorIdade21());

        Aluno aluno2 = new Aluno();

        System.out.println("Salário é = " + aluno1.salario());

        Pessoa pessoa = new Aluno();

        teste(aluno1);
        teste(diretor);
        teste(secretario1);
    }

    public static void teste(Pessoa pessoa){
        System.out.println("Essa pessoa se chama " + pessoa.getNome() + " e o salário");
    }
}
