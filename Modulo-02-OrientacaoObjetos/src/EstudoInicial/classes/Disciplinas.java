package EstudoInicial.classes;

import java.util.Objects;

public class Disciplinas {

    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplinas that = (Disciplinas) o;
        return Double.compare(that.nota, nota) == 0 &&
                disciplina.equals(that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
