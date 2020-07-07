public class EstruturaDeDecisao {

    public static void main(String[] args){
        int notaAluno = 8;

        if(notaAluno >= 7){
            System.out.println("Aprovado");
        }
        else if(notaAluno >= 5 && notaAluno <7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

        System.out.println(" ===========================  ");
        System.out.println("Usando CASE");
        System.out.println(" ===========================  ");
        
    }
}
