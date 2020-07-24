package EstudoInicial.executavel;

import EstudoInicial.classes.Aluno;
import EstudoInicial.classes.Diretor;
import EstudoInicial.classes.Secretario;

public class TestandoClassesFilhas {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Thiago - JDev");

        Diretor diretor = new Diretor();
        diretor.setNome("Bill Gates");
        diretor.setTitulacao("Mestre");

        Secretario secretario1 = new Secretario();
        secretario1.setNome("João da Silva");
        secretario1.setExperiencia("Administração");

    }
}
