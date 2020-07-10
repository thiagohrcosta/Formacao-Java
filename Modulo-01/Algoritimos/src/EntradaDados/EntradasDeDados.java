package EntradaDados;

import javax.swing.*;

public class EntradasDeDados {

    public static void main(String[] args){

        String produtos = JOptionPane.showInputDialog("Informe a quantidade de produtos: ");
        String valorProduto = JOptionPane.showInputDialog("Informe o valor do(s) produto(s): ");

        double qntProdutos = Double.parseDouble(produtos);
        double priceProduto = Double.parseDouble(valorProduto);

        double total = qntProdutos * priceProduto;

        System.out.println(produtos);

        System.out.println("R$ : " + total);

        JOptionPane.showMessageDialog(null, "O Valor da venda é de R$ : " + total);

        int confirmaVenda = JOptionPane.showConfirmDialog(null, "Confirmar a venda?");

        if(confirmaVenda == 0){
            JOptionPane.showMessageDialog(null,"Venda lançada no sistema.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Venda Cancelada.");
        }


    }
}
