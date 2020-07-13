package EstudoInicial.classes;

import java.util.Objects;

public class Disciplinas {

    private double nota1;
    private String disciplina1;
    private double nota2;
    private String disciplina2;
    private double nota3;
    private String Disciplina3;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina3() {
        return Disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        Disciplina3 = disciplina3;
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "nota1=" + nota1 +
                ", disciplina1='" + disciplina1 + '\'' +
                ", nota2=" + nota2 +
                ", disciplina2='" + disciplina2 + '\'' +
                ", nota3=" + nota3 +
                ", Disciplina3='" + Disciplina3 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplinas that = (Disciplinas) o;
        return Double.compare(that.nota1, nota1) == 0 &&
                Double.compare(that.nota2, nota2) == 0 &&
                Double.compare(that.nota3, nota3) == 0 &&
                disciplina1.equals(that.disciplina1) &&
                disciplina2.equals(that.disciplina2) &&
                Disciplina3.equals(that.Disciplina3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota1, disciplina1, nota2, disciplina2, nota3, Disciplina3);
    }
}
