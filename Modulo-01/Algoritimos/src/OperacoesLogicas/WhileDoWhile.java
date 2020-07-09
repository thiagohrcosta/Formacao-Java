package OperacoesLogicas;

public class WhileDoWhile {

    public static void main(String[] args) {

        // Estrutura de repetição WHILE

        int a = 0;
        int b = 2;
        int c = 0;

        while (c < 200) {
            c = a + b;
            a++;
            b++;
            System.out.println("O número atual é :" + c);
        }

        System.out.println(" ============================ ");
        int numero2 = 0;

        do {
            System.out.println("O número atual é : " + numero2);
            numero2++;
        } while (numero2 <= 100);
    }
}