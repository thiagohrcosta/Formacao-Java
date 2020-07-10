package OperacoesLogicas;

public class ForBreak {

    public static void main(String[] args){

        for ( int numero = 0; numero <= 100; numero++){
            if(numero == 10){
                System.out.println("O número " + numero + " foi localizado");
                break;
            }
        }
    }
}
