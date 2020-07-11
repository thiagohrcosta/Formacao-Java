package ProgramaMedia;

import javax.swing.*;
import java.awt.*;

public class ProgramaCalculoMedia {

    public static void main(String[] args){

        String nota1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
        String nota2 = JOptionPane.showInputDialog("Informe a seguda nota: ");
        String nota3 = JOptionPane.showInputDialog("Informe a terceira nota: ");

        double dNota1 =Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);

        double media = (dNota1 + dNota2 + dNota3) / 3;

        JOptionPane.showMessageDialog(null, " A nota média é : " + media);

        // Média para aprovação >= 7

        if(media >= 7){
            JOptionPane.showMessageDialog(null, "Aluno aprovado com nota média de : " + media);
        }
        else if(media >= 5 && media < 7){
            JOptionPane.showMessageDialog(null, "Aluno em recuperação com nota média de : " + media);
        }
        else{
            JOptionPane.showMessageDialog(null, "Aluno reprovado com nota média de : " + media);
        }
    }
}
