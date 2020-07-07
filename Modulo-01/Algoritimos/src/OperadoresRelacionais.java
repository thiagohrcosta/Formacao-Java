public class OperadoresRelacionais {

    // Os operadores relacionais são usados para comparar String de
    // caracteres, números, verificações, condições e tomadas de
    // decisões.

    // ==, !=, >, <, >=, <=
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 20;

        if(numero1 == numero2){
            System.out.print("Iguais");
        }
        else if(numero1 > numero2){
            System.out.print("10 é maior que 20");
        }
        else if(numero1 < numero2){
            System.out.println("10 é menor que 20");
        }
        System.out.print(numero1 != numero2);

    }

}
