import java.util.Scanner;

public class PseudoCodigo {

    public static void main(String[] args) {

        // Media final = (n1 + n2 + n3 + n4) / 4
        // Receber nota 1;
        // Receber nota 2;
        // Receber nota 3;
        // Receber nota 4;
        // Somar todas as notas e dividir por quatro
        // Mostrar resultado

        Scanner sc = new Scanner(System.in);

        double nota1;
        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextInt();

        double nota2;
        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextInt();

        double nota3;
        System.out.print("Digite a nota 3: ");
        nota3 = sc.nextInt();

        double nota4;
        System.out.print("Digite a nota 4: ");
        nota4 = sc.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é de: " + media);

        System.out.println("================================");

        // Apenas para praticar: Adicionar IF para aprovação >= 7;

        if(media >=7){
            System.out.println("O aluno foi aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
        System.out.println("================================");


    }

}
