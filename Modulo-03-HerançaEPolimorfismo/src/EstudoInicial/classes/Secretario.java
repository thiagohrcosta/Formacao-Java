package EstudoInicial.classes;

import EstudoInicial.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }

    @Override
    public double salario() {
        return 1800.80 * 0.9;
    }

    /* Método do "Contrato" de autenticação */
    @Override
    public boolean autenticar() {
        /* Retorna verdadeiro, caso login e senha sejam admin */
        return login.equals("admin") && senha.equals("admin");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
