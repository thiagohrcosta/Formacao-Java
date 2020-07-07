public class OperadoresLogicos {

    // Os operadores lógicos servem para combinar resultados
    // de expressões, retornando se o resultado é V ou F.

    // Ou em Java => | , ||
    // OU em SQL => OR,
    // E em Java => &, &&
    // E em SQL => AND
    // União => C & C | C

    public static void main(String[] args){
        boolean numero1 = true;
        boolean numero2 = false;

        if(numero1 || numero2){
            System.out.print("Algum número é verdadeiro");
        }
        else if(numero1 && numero2){
            System.out.print("Tem resultado falso");
        }
    }

}
